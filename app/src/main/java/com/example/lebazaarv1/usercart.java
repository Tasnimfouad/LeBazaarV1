package com.example.lebazaarv1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

public class usercart extends AppCompatActivity {
 ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_usercart );
        AdapterView.OnItemClickListener clickListener = null;
        String[] Productsnumbers = new String[10];
        Productsnumbers[0]="3";
        String[] ProductsNames = new String[10];
        ProductsNames[0] = "1 KG Ghee";

        String[] ShopNames = new String[10];
        ShopNames[0] = "Ezbetna";
        String[] itemspricess = new String[10];
        itemspricess[0] = "Price 365 L.E";
        Bitmap[] productsImages = new Bitmap[10];

        productsImages[0] = ((BitmapDrawable)getResources().getDrawable(R.drawable.ghee2)).getBitmap();
        lv = (ListView) findViewById(R.id.ListView_cartProducts);

        lv.setTextFilterEnabled(true);
        lv.setOnItemClickListener(clickListener);


        CustomListAdapter adapter = new CustomListAdapter(this,Productsnumbers, ProductsNames,ShopNames,itemspricess,productsImages);
        lv.setAdapter(adapter);

    }

}
