package com.example.lebazaarv1;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

public class signinpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_signinpage );
        Toolbar toolbar = findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );
       // final EditText getpassword=(EditText)findViewById( R.id.enterpassword );
        //TextView pass=(TextView)findViewById( R.id.password );

      //  final String hashed = Hashing.sha256()
        //        .hashString(getpassword.getText(), StandardCharsets.UTF_8)
          //      .toString();
        //pass.setText(hashed);
        Button activsignup=(Button)findViewById(R.id.signup);
        activsignup.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signupbtn = new Intent(signinpage.this, signup.class);
                signinpage.this.startActivity(signupbtn);
            }
        } );
        Button sellerbutton=(Button)findViewById( R.id.becomeseller );
        sellerbutton.setOnClickListener( new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
            Intent sellersignuppage=new Intent( signinpage.this, sellersignup.class );
            signinpage.this.startActivity(sellersignuppage);

            }
        } );
    }

}
