package com.example.lebazaarv1;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class imageLoader {
    public static void downloadImage(Context c, String imageurl, ImageView img){
        if(imageurl!=null && imageurl.length()>0){
            Picasso.get().load( imageurl).placeholder( R.drawable.bazarwhite).into( img );

        }else {
            Picasso.get().load( R.drawable.books).into( img );
        }

    }
}
