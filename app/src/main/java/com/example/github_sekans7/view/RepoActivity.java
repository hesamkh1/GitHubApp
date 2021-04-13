package com.example.github_sekans7.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.github_sekans7.R;
import com.example.github_sekans7.adapter.Adapter_main;
import com.example.github_sekans7.adapter.Adapter_repo;
import com.example.github_sekans7.model.Repo;
import com.example.github_sekans7.model.User;
import com.example.github_sekans7.remote.ApiClient;
import com.example.github_sekans7.remote.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RepoActivity extends AppCompatActivity {

    private ApiInterface apiInterface;
    private List<Repo> repos;
    private RecyclerView recyclerView_repo;
    private RecyclerView.LayoutManager layoutManager;
    private Adapter_repo adapter_repo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repo);
        Bundle bundle = getIntent().getExtras();
        String login=bundle.getString("login");
       // Toast.makeText(getApplicationContext(),login,Toast.LENGTH_SHORT).show();
        recyclerView_repo=findViewById(R.id.recycler_repo);
        layoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView_repo.setLayoutManager(layoutManager);
        recyclerView_repo.setHasFixedSize(true);
        performrepo(login);
    }
    public void performrepo(String username){
        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
        Call<List<Repo>> call=apiInterface.performrepo(username);
        call.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                repos=response.body();
                recyclerView_repo.setVisibility(View.VISIBLE);
                adapter_repo = new Adapter_repo(repos, getApplicationContext());
                recyclerView_repo.setAdapter(adapter_repo);
                adapter_repo.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error\n"+t.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}