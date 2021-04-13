package com.example.github_sekans7.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.github_sekans7.R;

public class UserActivity extends AppCompatActivity {

    TextView email_tv,follower_tv,following_tv,id_tv,created_tv,updated_tv,name_tv,public_repos_tv,browser_tv;
    ImageView avatar;
    Button repo_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        email_tv=findViewById(R.id.email);
        follower_tv=findViewById(R.id.follower);
        following_tv=findViewById(R.id.following);
        id_tv=findViewById(R.id.id);
        name_tv=findViewById(R.id.name);
        avatar=findViewById(R.id.imageView);
        created_tv=findViewById(R.id.created);
        updated_tv=findViewById(R.id.updated);
        repo_btn=findViewById(R.id.button);
        public_repos_tv=findViewById(R.id.pubic_repos);
        browser_tv=findViewById(R.id.browser);
        Bundle bundle = getIntent().getExtras();
        String name=bundle.getString("name");
        String email=bundle.getString("email");
        String following=bundle.getString("following");
        String follower=bundle.getString("follower");
        String id=bundle.getString("id");
        String image_url=bundle.getString("imageurl");
        String created=bundle.getString("created");
        String updated=bundle.getString("updated");
        String public_repos=bundle.getString("public_repos");
        String html_url=bundle.getString("html_url");
        Glide.with(getApplicationContext())
                .load(image_url)
                .autoClone()
                .centerCrop()
                .into(avatar);
        email_tv.setText(email);
        follower_tv.setText(follower);
        following_tv.setText(following);
        id_tv.setText(id);
        updated_tv.setText(updated);
        created_tv.setText(created);
        name_tv.setText(name);
        public_repos_tv.setText(public_repos);
        repo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent homeIntent =new Intent(getApplicationContext(), RepoActivity.class);
                homeIntent.putExtra("login",bundle.getString("login"));
                startActivity(homeIntent);
            }
        });
        browser_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(html_url));
                startActivity(browserIntent);
            }
        });

    }
}