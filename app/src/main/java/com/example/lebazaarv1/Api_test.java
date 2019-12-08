package com.example.lebazaarv1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api_test {
    //String BASE_URL="http://simplifiedcoding.net/demos/";

  // @GET("marvel")
  @GET("GetAll")
    Call <List <Hero>> getHeroes();
}
