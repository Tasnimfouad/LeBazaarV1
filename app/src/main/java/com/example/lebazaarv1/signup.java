package com.example.lebazaarv1;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class signup extends AppCompatActivity {
    private static Retrofit retrofit1 = null;
    Api_userRegistration apiInterface;
    int flag=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_signup );
     //   Toolbar toolbar = findViewById( R.id.toolbar );
      //  setSupportActionBar( toolbar );
        //apiInterface =getClient().create(Api_userRegistration.class);
        final Button signuppress = (Button) findViewById( R.id.signup );
        Calendar cal = Calendar.getInstance();
        cal.set( Calendar.HOUR_OF_DAY,2);
        final Date date = cal.getTime();
     // final   UUID uid=UUID.fromString( "aa8125a9-d4b9-4ac1-9946-9f45079f1250" );
    //  Log.d( "Tag",UUID.randomUUID().toString() );
        signuppress.setOnClickListener( new View.OnClickListener() {
            @android.support.annotation.RequiresApi(api = Build.VERSION_CODES.KITKAT)


            @Override
            public void onClick(View v) {

                final String hashed = Hashing.sha256()
                        .hashString("1234", StandardCharsets.UTF_8).toString();
                //your code here
                if (flag == 1) {
                    signuppress.setEnabled( true );
                    signuppress.setClickable( true );
                }
                    if (CommonMethod.isNetworkAvailable( signup.this )) {
                        loginRetrofit2Api( UUID.randomUUID(), "Ashraf", "Saiedi",
                                "Tota", "01111", "tatatag", "egyptian", "0101",
                                "Tasnim", hashed, false, false, 0, true, ""
                                , "", null );
                        flag = 0;
                        signuppress.setEnabled( false);
                        signuppress.setClickable( false );

                    } else
                        CommonMethod.showAlert( "Internet Connectivity Failure", signup.this );
                }

            });
            //    public static final String BASE_URL = "Your Base Url ";
              //  private Retrofit retrofit = null;
             //   public static Retrofit getClient () {


                   // Api_userRegistration apiuser = retrofit.create( Api_userRegistration.class );

                   // if (retrofit == null) {

                     //   retrofit = new Retrofit.Builder()
                       //         .baseUrl( Api_userRegistration.BASE_URL_userlink )
                         //       .addConverterFactory( GsonConverterFactory.create() )
                           //     .build();
                    //}
                 //   return retrofit;
                //}
                //Intent intent3 = new Intent( MainActivity.this, usercart.class );
                //MainActivity.this.startActivity( intent3 );

    }

    private void loginRetrofit2Api(UUID userID, String firstName, String middleName, String lastName, String mobile, String email, String nationality, String additionalPhone, String userName, String password, boolean isSeller, boolean isAdmin, int failedLoginCount, boolean active, String lastLoginDate, String passwordKey, String sellerRequestID) {
        {

            SignupResponse login = new SignupResponse( userID, firstName, middleName, lastName, mobile, email, nationality, additionalPhone, userName, password, isSeller, isAdmin, failedLoginCount,active, lastLoginDate, passwordKey, sellerRequestID );

            apiInterface =getClient().create(Api_userRegistration.class);
            Call <SignupResponse> call1 = apiInterface.createUser( login );
            call1.enqueue( new Callback <SignupResponse>() {
                @Override
                public void onResponse(Call <SignupResponse> call, Response <SignupResponse> response) {
                    SignupResponse loginResponse = response.body();

                    Log.e( "keshav", "loginResponse 1 --> " + loginResponse );

                        Log.d( "TAG", "onResponse - Status : " + response.code() );

                        Log.d( "TAG", "onResponse - Status : " + response.errorBody() );

                    if (loginResponse != null) {
                        Log.e( "keshav", "getUserId          -->  " + loginResponse.getUserID() );
                        Log.e( "keshav", "getFirstName       -->  " + loginResponse.getFirstName() );
                        Log.e( "keshav", "getLastName        -->  " + loginResponse.getLastName() );
                        Log.e( "keshav", "getProfilePicture  -->  " + loginResponse.getAdditionalPhone() );

                        String responseCode = loginResponse.getResponseCode();
                        Log.e( "ResponeCode", "getResponseCode  -->  " + loginResponse.getResponseCode() );
                        Log.e( "ResponseMessage", "getResponseMessage  -->  " + loginResponse.getResponseMessage() );
                        if (responseCode != null && responseCode.equals( "500" )) {
                            Toast.makeText( signup.this, "Please try again", Toast.LENGTH_SHORT ).show();}
                        else if (responseCode != null && responseCode.equals( "404" )) {
                                Toast.makeText( signup.this, "Invalid Login Details \n Please try again", Toast.LENGTH_SHORT ).show();}
                          else  if (responseCode != null && responseCode.equals( "409" )) {
                                Toast.makeText( signup.this, "User already Exists", Toast.LENGTH_SHORT ).show();
                        } else {
                            Toast.makeText( signup.this, "Welcome " + loginResponse.getFirstName(), Toast.LENGTH_SHORT ).show();
                        }
                    }
                }

                @Override
                public void onFailure(Call <SignupResponse> call, Throwable t) {
                    Toast.makeText( getApplicationContext(), "onFailure called ", Toast.LENGTH_SHORT ).show();
                    call.cancel();
                }
            } );
        }

      //  public boolean checkValidation () {
            //String userId = " gvkghyvg";
            //String password = "iytfygvg";

            //Log.e( "Keshav", "userId is -> " + userId );
            //  Log.e( "Keshav", "password is -> " + password );

       /* if (et_Email.getText().toString().trim().equals("")) {
            CommonMethod.showAlert("UserId Cannot be left blank", MainActivity.this);
            return false;
        } else if (et_Pass.getText().toString().trim().equals("")) {
            CommonMethod.showAlert("password Cannot be left blank", MainActivity.this);
            return false;
        }*/
       //     return true;
        //}
    }
    public static Retrofit getClient() {
        if (retrofit1 == null) {
            retrofit1 = new Retrofit.Builder()
                    .baseUrl( Api_userRegistration.BASE_URL_userlink )
                    .addConverterFactory( GsonConverterFactory.create() ) //Here we are using the GsonConverterFactory to directly convert json data to object
                    .build();
        }
        return retrofit1;
    }}


