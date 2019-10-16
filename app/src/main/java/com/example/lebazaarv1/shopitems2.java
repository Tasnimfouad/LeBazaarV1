package com.example.lebazaarv1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

public class shopitems2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_shopitems2 );

            ListView lv1;

                AdapterView.OnItemClickListener clickListener = null;
                String[] Productsnumbers1 = new String[10];
                Productsnumbers1[0]="3";
                String[] ProductsNames1 = new String[10];
                ProductsNames1[0] = "1 KG Ghee";


                Bitmap[] productsImages1 = new Bitmap[10];

                productsImages1[0] = ((BitmapDrawable)getResources().getDrawable(R.drawable.ghee2)).getBitmap();
                lv1 = (ListView) findViewById(R.id.ListView_shopitems);

                lv1.setTextFilterEnabled(true);
                lv1.setOnItemClickListener(clickListener);


                shopListAdapter adapter = new shopListAdapter(this,Productsnumbers1, ProductsNames1,productsImages1);
                lv1.setAdapter(adapter);

            }


        }

