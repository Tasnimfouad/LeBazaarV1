package com.example.lebazaarv1;

import android.support.annotation.StringDef;
import android.support.annotation.StringRes;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Api_signin {
    String BASE_URL_signin="http://letriobazaar.com/api/User/Signin/";

   // @FormUrlEncoded
    // Call<LoginResponse> createUser(@Body LoginResponse login);
   // @POST("api/User/Signin/Mai/03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4")
    @GET("Mai/1234")
    Call <signinresponse> login();
 // Call <signinresponse> createUser(@Body signinresponse login);
  //  Call<signinresponse> login(@StringDef("UserName") String UserName, @String("Password") String Password);
//Call<signinresponse> login(@Field("UserName") String UserName,@Field("Password") String Password);
    //Call<signinresponse> login();
 /*   public void insertUser(
            @Field("UserName") String UserName,
            @Field("Password") String Password,

            Callback <Response> callback);*/
    //Call<signinresponse> login(signintodb sign);
}
