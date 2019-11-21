package com.example.lebazaarv1;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;


public interface Api_userRegistration {

    String BASE_URL_userlink="http://letriobazaar.com/";


       // Call<LoginResponse> createUser(@Body LoginResponse login);
        @POST("api/User")
        Call<SignupResponse> createUser(@Body SignupResponse login);

}
