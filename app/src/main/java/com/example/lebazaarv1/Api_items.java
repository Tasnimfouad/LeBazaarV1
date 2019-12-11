package com.example.lebazaarv1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api_items {


    // @GET("Search/ca")
   // @GET("GetItemsbyCategory")
    @GET("GetAll")
    Call <List <Item_ModelDeclaration>> get_Items();
}
