package com.example.lebazaarv1;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {
    Context c;
    ArrayList<HeroRealmm> herorealmArray;
    CardView cardView1;
    private static int currentPosition = 0;


    public MyAdapter(Context c, ArrayList <HeroRealmm> herorealmArray) {
        this.c = c;
        this.herorealmArray = herorealmArray;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from( c ).inflate( R.layout.list_layout_heroes2, viewGroup, false );
        return new MyHolder( v );
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder,final int position) {
HeroRealmm h=herorealmArray.get(position );
        myHolder.textViewName.setText( h.getName());
        //Picasso.get().load( "https://tineye.com/images/widgets/mona.jpg");
String imgurl="http://www.letriobazaar.com/Images/Category/" +h.getImagePath();
imageLoader.downloadImage( c,imgurl,myHolder.imageView );
        if (position==0||position==3) {

            myHolder.itemView.findViewById( R.id.cardView ).setBackgroundColor( Color.parseColor( "#009688" ));
            // holder.textViewName.setBackgroundColor( Color.BLUE );
            //creating an animation
            //Animation slideDown = AnimationUtils.loadAnimation(context, R.anim.slide_down);

            //toggling visibility
//            holder.linearLayout.setVisibility( View.VISIBLE );
            // holder.linearLayout.startAnimation(slideDown);
        }
        else if (position==1||position==4) {
            myHolder.itemView.findViewById( R.id.cardView ).setBackgroundColor(Color.parseColor( "#673AB7" ));
        }

        myHolder.textViewName.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //getting the position of the item to expand it
                currentPosition = position;

                //reloding the list
                notifyDataSetChanged();
            }
        } );
    }



    @Override
    public int getItemCount() {
        return herorealmArray.size();
    }
}
class MyHolder extends RecyclerView.ViewHolder {
    TextView textViewName;    //, textViewRealName, textViewTeam, textViewFirstAppearance, textViewCreatedBy, textViewPublisher, textViewBio;
    ImageView imageView;
    LinearLayout linearLayout;
    CardView cardView1;

    public MyHolder(@NonNull View itemView) {
        super( itemView );

        textViewName = (TextView) itemView.findViewById( R.id.textView1);

        imageView = (ImageView) itemView.findViewById( R.id.imageView1 );
        cardView1=(CardView)itemView.findViewById( R.id.cardView );
    }
}


