package com.example.github_sekans7.remote;


import com.example.github_sekans7.model.Repo;
import com.example.github_sekans7.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("/users")
    Call<List<User>> performall();

    @GET("/users/{username}")
    Call<User> performsearch(@Path("username") String User);

    @GET("/users/{username}/repos")
    Call<List<Repo>> performrepo(@Path("username") String User);

//    @GET("search/users")
//    Call<List<Response>> performsearch(@Query("q") String filter);



}
