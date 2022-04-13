package com.example.happycovidtrackerapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiController {
    private static final String url = "https://corona.lmao.ninja/v2/";
    private static ApiController controllerObject;
    private static Retrofit retrofit;

    ApiController() {
        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized ApiController getInstance() {
        if (controllerObject == null) {
            controllerObject = new ApiController();
        }
        return controllerObject;
    }

    ApiSet getApi() {
        return retrofit.create(ApiSet.class);
    }


}
