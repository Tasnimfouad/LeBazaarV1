package com.example.lebazaarv1;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;



public class customAdapter extends SimpleAdapter {

        public customAdapter(Context context, List<? extends Map <String, ?>> data, int resource, String[] from, int[] to){
            super(context, data, resource, from, to);
        }

        public View getView(int position, View convertView, ViewGroup parent){
            // here you let SimpleAdapter built the view normally.
            View v = super.getView(position, convertView, parent);
          //  Map.put("name", lineName);
        //    Map.put("description", lineName2);
            // Then we get reference for Picasso
            ImageView img = (ImageView) v.getTag();
            if(img == null){
                img = (ImageView) v.findViewById(R.id.imageViewmain);
                v.setTag(img); // <<< THIS LINE !!!!
            }
            // get the url from the data you passed to the `Map`
          String urllname = (String) ((Map)getItem(position)).get("Name");
             String urll ="http://www.letriobazaar.com/Images/Category/"+urllname+".png";
            // do Picasso
            Picasso.get().load(urll).into(img);

            // return the view
            return v;
        }
    }
  /*  String[] broughtdata,users;
    MyAsyncTask myAsyncTaskObj = MyAsyncTask.getInstance();
    int count3=myAsyncTaskObj.count;
nameArray namedata=new nameArray();
Context context,c;

public customAdapter(Context context,String[] users) {
   // c=context;
        // ArrayList<String> users
        //users=getBroughtdata();
       // getBroughtdata();
       super(context,R.layout.listrow);
    this.context=context;
    this.users=users;
    }
    public String[] getBroughtdata() {
        MyAsyncTask myAsyncTaskObj = MyAsyncTask.getInstance();
        int count3=myAsyncTaskObj.count;
        nameArray namedata=new nameArray();
        broughtdata= namedata.getNamearray();
        return broughtdata;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position

      //  nameArray user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listrow, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.textView);
        // Populate the data into the template view using the data object
        tvName.setText("U");
        // Return the completed view to render on screen
        return convertView;
    }*/
