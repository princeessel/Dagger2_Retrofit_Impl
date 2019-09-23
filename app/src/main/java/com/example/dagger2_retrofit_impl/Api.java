package com.example.dagger2_retrofit_impl;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("photos")
    Call<List<Photo>> getPhotos();
}
