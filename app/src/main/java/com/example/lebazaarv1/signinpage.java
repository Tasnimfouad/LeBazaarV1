package com.example.lebazaarv1;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.annotation.TargetApi;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


@RequiresApi(api = Build.VERSION_CODES.KITKAT)
public class signinpage extends AppCompatActivity {
    private static Retrofit retrofit = null;
    Api_signin api_signin;
    int flag = 1;
    String hashed = Hashing.sha256()
            .hashString( "1234", StandardCharsets.UTF_8 ).toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_signinpage );
        Toolbar toolbar = findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );
        // final EditText getpassword=(EditText)findViewById( R.id.enterpassword );
        //TextView pass=(TextView)findViewById( R.id.password );

        //final String hashed = Hashing.sha256()
        //   .hashString("1234", StandardCharsets.UTF_8).toString();
        //pass.setText(hashed);
        Button activsignup = (Button) findViewById( R.id.signup );
        activsignup.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signupbtn = new Intent( signinpage.this, signup.class );
                signinpage.this.startActivity( signupbtn );
            }
        } );
        Button sellerbutton = (Button) findViewById( R.id.becomeseller );
        sellerbutton.setOnClickListener( new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                Intent sellersignuppage = new Intent( signinpage.this, sellersignup.class );
                signinpage.this.startActivity( sellersignuppage );

            }
        } );
        EditText user = (EditText) findViewById( R.id.enterusename );
        //  String userName=user.getText().toString();
        EditText Pass = (EditText) findViewById( R.id.enterpassword );
        //    String password=Pass.getText().toString();
        final Button signinbtn = (Button) findViewById( R.id.login );
        api_signin = getClient().create( Api_signin.class );

        // final   UUID uid=UUID.fromString( "aa8125a9-d4b9-4ac1-9946-9f45079f1250" );
        //  Log.d( "Tag",UUID.randomUUID().toString() );
        signinbtn.setOnClickListener( new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)


            @Override
            public void onClick(View v) {


                //your code here
                if (flag == 1) {
                    signinbtn.setEnabled( true );
                    signinbtn.setClickable( true );
                }
                if (CommonMethod.isNetworkAvailable( signinpage.this )) {
                    //  signintodb signdb=new signintodb( "Tasnim",hashed );
                    loginRetrofit2Api( );
                    // loginRetrofit2Api(
                    //       UUID.randomUUID(), "Ashraf", "Saiedi",
                    //         "Tota", "01111", "tatatag", "egyptian", "0101",
                    //          "Tasnim", hashed, false, false, 0, true, ""
                    //     , "", null,"","","" );
                    flag = 0;
                    signinbtn.setEnabled( false );
                    signinbtn.setClickable( false );

                } else
                    CommonMethod.showAlert( "Internet Connectivity Failure", signinpage.this );
            }

        } );
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

    //  private void loginRetrofit2Api(UUID userID, String firstName, String middleName, String lastName, String mobile, String email, String nationality, String additionalPhone, String userName, String password, boolean isSeller, boolean isAdmin, int failedLoginCount, boolean active, String lastLoginDate, String passwordKey, String sellerRequestID, String address, String city, String street) {
    //private void loginRetrofit2Api(UUID userID, String firstName, String middleName, String lastName, String mobile, String email, String nationality, String additionalPhone, String userName, String password, boolean isSeller, boolean isAdmin, int failedLoginCount, boolean active, String lastLoginDate, String passwordKey, String sellerRequestID, String address, String city, String street) {
    private void loginRetrofit2Api() {

      //  final signinresponse login = new signinresponse( userName, password );

//signintodb send=new signintodb( userName,password );

        Call <signinresponse> call1 = api_signin.login(  );
        call1.enqueue( new Callback <signinresponse>() {
            @Override
            public void onResponse(Call <signinresponse> call, Response <signinresponse> response) {
                signinresponse loginResponse = response.body();

                Log.e( "keshav", "loginResponse 1 --> " + loginResponse );

                Log.d( "TAG", "onResponse - Status : " + response.code() );

                Log.d( "TAG", "onResponse - Status : " + response.errorBody() );

                if (loginResponse != null) {


                    Log.e( "keshav", "getUserName          -->  " + loginResponse.getFirstName() );
                    Log.e( "keshav", "getPassword       -->  " + loginResponse.getPassword() );

                    String responseCode = loginResponse.getResponseCode();
                    Log.e( "ResponeCode", "getResponseCode  -->  " + loginResponse.getResponseCode() );
                    Log.e( "ResponseMessage", "getResponseMessage  -->  " + loginResponse.getResponseMessage() );
                    if (responseCode != null && responseCode.equals( "500" )) {
                        Toast.makeText( signinpage.this, "Please try again", Toast.LENGTH_SHORT ).show();
                    } else if (responseCode != null && responseCode.equals( "404" )) {
                        Toast.makeText( signinpage.this, "Invalid Login Details \n Please try again", Toast.LENGTH_SHORT ).show();
                    } else if (responseCode != null && responseCode.equals( "409" )) {
                        Toast.makeText( signinpage.this, "User already Exists", Toast.LENGTH_SHORT ).show();
                    }
                }
            }

            @Override
            public void onFailure(Call <signinresponse> call, Throwable t) {
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

    public static Retrofit getClient() {

   if (retrofit == null) {
              retrofit = new Retrofit.Builder()
                    .baseUrl( Api_signin.BASE_URL_signin )
                    .addConverterFactory( GsonConverterFactory.create() ) //Here we are using the GsonConverterFactory to directly convert json data to object
                    .build();
        }
        return retrofit;

 }
}
