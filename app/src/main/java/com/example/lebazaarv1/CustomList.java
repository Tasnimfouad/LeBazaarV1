package com.example.lebazaarv1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static android.media.CamcorderProfile.get;

import static com.example.lebazaarv1.R.layout.activity_main;

public class CustomList extends  RecyclerView.Adapter<CustomList.ViewHolder>  {
    //adapter for search
 //   MyAsyncTask myAsyncTaskObj = MyAsyncTask.getInstance();
    private Context mContext;
    List <? extends Map <String, ?>> map1;
    List<Map<String, Object>> listAsync;
    public CustomList(Context context, List<? extends Map<String, ?>> passedmap){
        mContext=context;
    map1=passedmap;
    }
   // public CustomList(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to){
     //   super(context, data, resource, from, to);
    //}
   @NonNull
   @Override
   public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

       LayoutInflater layoutInflater=LayoutInflater.from( mContext );
       View view=layoutInflater.inflate( R.layout.listrow,viewGroup,false );
       ViewHolder viewHolder=new ViewHolder( view );
       return viewHolder;
   }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        //ModelFood foodItem=mList.get( i );
     //   HashMap<String, Object> data1 =map;

        ImageView image=viewHolder.item_image;
        TextView name=viewHolder.item_name;
        TextView place=viewHolder.item_place;
        ImageView img = viewHolder.item_image;


        //String description1 = (String) ((Map)get(i)).get("description");
        String name1 = (String) map1.get( i ).get("name");
     String description1 = (String) map1.get( i ).get( "description");
        name.setText( name1 );
        place.setText( description1);
        //  String urllname = lineName;

        String urll = "http://www.letriobazaar.com/Images/Category/Farm.png";
       // String urll ="http://www.letriobazaar.com/Images/Category/"+name1+"2"+".png";
        // do Picasso
        Picasso.get().load(urll).into(image);

        // get the url from the data you passed to the `Map`
        // String url = ((Map)getItem(position)).get(TAG_IMAGE);
        // do Picasso

    }





    @Override
    public int getItemCount() {
        return map1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView item_image;
        TextView item_name,item_place;
        public ViewHolder(@NonNull View itemView) {
            super( itemView );
          //  String S= lineName;
            //String S1= "description";
            item_image=itemView.findViewById( R.id.imageViewmain);
            item_name=itemView.findViewById( R.id.textView );
            item_place=itemView.findViewById( R.id.textView1 );
           // item_name.setText( S );
           // item_place.setText( S1 );
          //  String urllname = lineName;

            //String urll ="http://www.letriobazaar.com/Images/Category/"+S+"2"+".png";
            // do Picasso
          //  Picasso.get().load(urll).into(item_image);



        }
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