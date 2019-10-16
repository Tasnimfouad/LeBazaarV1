package com.example.lebazaarv1;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class shopListAdapter extends ArrayAdapter <String>  {




        private final Activity context;
        private final String[] itemname;
        private final String[] itemnum;

        private final Bitmap[] imgid;

        public shopListAdapter(Activity context,String[] itemnum,String[] itemname,  Bitmap[] imgid) {
            super(context, R.layout.shopitemsrow, itemname);
            // TODO Auto-generated constructor stub

            this.context=context;
            this.itemname=itemname;
            this.itemnum=itemnum;

            this.imgid=imgid;
        }

        public View getView(int position, View view, ViewGroup parent) {
            LayoutInflater inflater=context.getLayoutInflater();
            View rowView=inflater.inflate(R.layout.shopitemsrow, null,true);

            TextView txtTitle1 = (TextView) rowView.findViewById(R.id.itemsnum1);
            TextView txtTitle2 = (TextView) rowView.findViewById(R.id.item1);

            ImageView imageView = (ImageView) rowView.findViewById( R.id.icon1);

            txtTitle1.setText(itemnum[position]);
            txtTitle2.setText(itemname[position]);

            imageView.setImageBitmap(imgid[position]);
            return rowView;

        };




}
