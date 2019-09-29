package com.example.lebazaarv1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.lebazaarv1.R.layout.activity_main;

public class CustomList extends SimpleAdapter {
 //   MyAsyncTask myAsyncTaskObj = MyAsyncTask.getInstance();

    public CustomList(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to){
        super(context, data, resource, from, to);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        // here you let SimpleAdapter built the view normally.
        View v = super.getView(position, convertView, parent);

        // Then we get reference for Picasso
        ImageView img = (ImageView) v.getTag();
        if(img == null){
            img = (ImageView) v.findViewById(R.id.imageViewmain);
            v.setTag(img); // <<< THIS LINE !!!!
        }
        // get the url from the data you passed to the `Map`
       // String url = ((Map)getItem(position)).get(TAG_IMAGE);
        // do Picasso
       String urllname = (String) ((Map)getItem(position)).get("name");

        String urll ="http://www.letriobazaar.com/Images/Category/"+urllname+"2"+".png";
        // do Picasso
        Picasso.get().load(urll).into(img);
       // Picasso.get().load("http://www.letriobazaar.com/Images/Category/Farm.png").into(img);

        // return the view
        return v;
    }

    //int count1 = myAsyncTaskObj.count;


       /* listview = (ListView) findViewById( R.id.listv );
      listview.setClickable( true );
*/
/*
    private Context mContext;
    public LayoutInflater inflater=null;
    public CustomList(Context context, List <? extends Map <String, ?>> data, int resource, String[] from, int[] to) {

        super(context, data, resource, from, to);
        mContext = context;
        inflater = (LayoutInflater)mContext.getSystemService( Context.LAYOUT_INFLATER_SERVICE);
        myAsyncTaskObj.execute();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //View vi=convertView;
        View vi = super.getView(position, convertView, parent);
        if(convertView==null) {
            vi = inflater.inflate( R.layout.listrow, null );
        }
        HashMap<String, String> data1 = (HashMap <String, String>) getItem(position);
        TextView text = (TextView)vi.findViewById(R.id.textView);
        String name = (String) data1.get("name");
        text.setText(name);
      //  ImageView image=(ImageView)vi.findViewById(R.id.imageViewmain);
       // String image_url = (String) data.get("image_url");
      //  Picasso.get().load("http://www.letriobazaar.com/Images/Category/Farm.png").into(image);
        return vi;
    } */
}