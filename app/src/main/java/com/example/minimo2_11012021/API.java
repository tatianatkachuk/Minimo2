package com.example.minimo2_11012021;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface API {

        //url
        String URL = "https://developer.github.com/v3/";



//        static API crearAPI() {
//            Gson gson = new GsonBuilder()
//                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
//                    .create();
//
//            Retrofit retrofit = new Retrofit.Builder()
//                    .baseUrl(URL)
//                    .addConverterFactory(GsonConverterFactory.create(gson))
//                    .build();
//
//            return retrofit.create(API.class);
//        }
    }

