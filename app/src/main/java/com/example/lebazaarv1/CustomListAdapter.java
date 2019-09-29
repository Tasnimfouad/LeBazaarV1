package com.example.lebazaarv1;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lebazaarv1.R;

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final String[] itemnum;
    private final String[] shopname;
    private final String[] itemprices;
    private final Bitmap[] imgid;

    public CustomListAdapter(Activity context,String[] itemnum,String[] itemname, String[] shopname,String[] itemprices, Bitmap[] imgid) {
        super(context, R.layout.mylist, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.itemnum=itemnum;
        this.shopname=shopname;
        this.itemprices=itemprices;
        this.imgid=imgid;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView txtTitle1 = (TextView) rowView.findViewById(R.id.itemsnum);
        TextView txtTitle2 = (TextView) rowView.findViewById(R.id.item);
        TextView txtTitle3 = (TextView) rowView.findViewById(R.id.shopname);
        TextView txtTitle4 = (TextView) rowView.findViewById(R.id.itemsprice);
        ImageView imageView = (ImageView) rowView.findViewById( R.id.icon);

        txtTitle1.setText(itemnum[position]);
        txtTitle2.setText(itemname[position]);
        txtTitle3.setText(shopname[position]);
        txtTitle4.setText(itemprices[position]);
        imageView.setImageBitmap(imgid[position]);
        return rowView;

    };
}


