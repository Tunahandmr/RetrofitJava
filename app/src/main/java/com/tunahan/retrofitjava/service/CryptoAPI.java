package com.tunahan.retrofitjava.service;

import com.tunahan.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json

    //GET, POST, UPDATE, DELETE

    //URL BASE-> www.website.com
    //Get-> price?key=xxx
    //URL BASE-> https://raw.githubusercontent.com/
    //GET-> atilsamancioglu/K21-JSONDataSet/master/crypto.json

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    Observable<List<CryptoModel>> getData();
    //Call<List<CryptoModel>> getData();
}
