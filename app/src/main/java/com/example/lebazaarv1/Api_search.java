package com.example.lebazaarv1;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
public interface Api_search {
    String BASE_URL_SEARCH="https://simplifiedcoding.net/demos/";
    //String BASE_URL="http://www.letriobazaar.com/api/Category/";
    @GET("marvel")
    //  @GET("GetCategory")
    Call <List <Hero>> getHeroes_Search();
}


