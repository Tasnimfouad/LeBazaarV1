package com.example.lebazaarv1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

public class usercart extends AppCompatActivity {
 ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_usercart );
        AdapterView.OnItemClickListener clickListener = null;
        String[] ProductsNames = new String[10];
        ProductsNames[0] = "ma4ea";
        int[] productsImages = new int[10];
        productsImages[0] =  R.drawable.beauty;
        lv = (ListView) findViewById(R.id.ListView_cartProducts);

        lv.setTextFilterEnabled(true);
        lv.setOnItemClickListener(clickListener);


        CustomListAdapter adapter = new CustomListAdapter(this, ProductsNames,productsImages);
        lv.setAdapter(adapter);

    }

}
