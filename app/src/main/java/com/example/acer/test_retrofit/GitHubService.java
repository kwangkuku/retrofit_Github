package com.example.acer.test_retrofit;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Acer on 6/9/2559.
 */

public interface GitHubService {
    @GET("/users/{username}")
    Call<User> getUser(@Path("username") String username);


}