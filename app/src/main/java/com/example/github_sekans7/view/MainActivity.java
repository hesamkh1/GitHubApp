package com.example.github_sekans7.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.github_sekans7.R;
import com.example.github_sekans7.adapter.Adapter_main;
import com.example.github_sekans7.model.User;
import com.example.github_sekans7.remote.ApiClient;
import com.example.github_sekans7.remote.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView_main;
    private RecyclerView.LayoutManager layoutManager;
    private List<User> users;
    private User user;
    private Adapter_main adapter_main;
    private ApiInterface apiInterface;
    private SearchView searchView;
    private Button find;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView_main=findViewById(R.id.recycler_main);
        layoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView_main.setLayoutManager(layoutManager);
        recyclerView_main.setHasFixedSize(true);
        performall();
        searchView=findViewById(R.id.searchbox);
        find=findViewById(R.id.find_btn);
        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performsearch(searchView.getQuery().toString());
            }
        });


    }

    public void performall(){
        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
        Log.e("main","main");
        Call<List<User>> call=apiInterface.performall();
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                users=response.body();
                recyclerView_main.setVisibility(View.VISIBLE);
                adapter_main = new Adapter_main(users, getApplicationContext());
                recyclerView_main.setAdapter(adapter_main);
                adapter_main.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error\n"+t.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }


    public void performsearch(String username){
        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
        Call<User> call=apiInterface.performsearch(username);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                user=response.body();
                Intent homeIntent =new Intent(getApplicationContext(), UserActivity.class);
                homeIntent.putExtra("name",user.getName());
                homeIntent.putExtra("id",user.getId());
                homeIntent.putExtra("follower",user.getFollowers());
                homeIntent.putExtra("following",user.getFollowing());
                homeIntent.putExtra("email",user.getEmail());
                homeIntent.putExtra("imageurl",user.getAvatarUrl());
                homeIntent.putExtra("created",user.getCreatedAt());
                homeIntent.putExtra("updated",user.getUpdatedAt());
                homeIntent.putExtra("login",user.getLogin());
                homeIntent.putExtra("public_repos",user.getPublicRepos());
                homeIntent.putExtra("html_url",user.getHtmlUrl());
                startActivity(homeIntent);
//                finish();

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error\n"+t.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}