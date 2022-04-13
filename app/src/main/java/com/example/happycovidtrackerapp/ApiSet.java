package com.example.happycovidtrackerapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;

public interface ApiSet {
    @GET("countries")
    Call<List<ResponseModel>> getdata();
}
