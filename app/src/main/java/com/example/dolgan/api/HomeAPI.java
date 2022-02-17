package com.example.dolgan.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface HomeAPI {
    @GET("v3/0a20fad0-9e55-48e5-8e03-ed6da8136547")
    Call<List<HomeClass>> getData();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://run.mocky.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
