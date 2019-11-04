package com.example.lebazaarv1;


import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Random;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.HeroViewHolder> {

    private Random mRandom = new Random();
    private List <Hero> heroList;
    private Context context;
 CardView cardView1;
    private static int currentPosition = 0;

    public HeroAdapter(List <Hero> heroList, Context context) {
        this.heroList = heroList;
        this.context = context;
    }

    @Override
    public HeroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from( parent.getContext() ).inflate( R.layout.list_layout_heroes2, parent, false );
        return new HeroViewHolder( v );
    }

    @Override
    public void onBindViewHolder(final HeroViewHolder holder, final int position) {
        Hero hero = heroList.get( position );
        holder.textViewName.setText( hero.getName() );

       // holder.textViewName.getLayoutParams().height = getRandomIntInRange(250,75);
       // holder.linearLayout.getLayoutParams().height = getRandomIntInRange(250,75);
        // Set a random color for TextView background
       // holder.linearLayout.setBackgroundColor(getRandomHSVColor());
        // Glide.with(context).load(hero.getImageUrl()).into(holder.imageView);
        Picasso.get().load( hero.getImageurl() ).into( holder.imageView );
//        holder.linearLayout.setVisibility( View.GONE );

        //if the position is equals to the item position which is to be expanded
        if (position==0||position==3) {

//holder.itemView.findViewById( R.id.cardView ).setBackgroundColor( Color.parseColor( "#009688" ));
            holder.itemView.findViewById( R.id.cardView ).setBackgroundColor(Color.parseColor( "#009688" ));
            // holder.textViewName.setBackgroundColor( Color.BLUE );
            //creating an animation
            //Animation slideDown = AnimationUtils.loadAnimation(context, R.anim.slide_down);

            //toggling visibility
//            holder.linearLayout.setVisibility( View.VISIBLE );
            // holder.linearLayout.startAnimation(slideDown);
        }
        else if (position==1||position==4) {
            holder.itemView.findViewById( R.id.cardView ).setBackgroundColor(Color.parseColor( "#673AB7" ));
        }

        holder.textViewName.setOnClickListener( new View.OnClickListener() {
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
        return heroList.size();
    }

    class HeroViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;    //, textViewRealName, textViewTeam, textViewFirstAppearance, textViewCreatedBy, textViewPublisher, textViewBio;
        ImageView imageView;
        LinearLayout linearLayout;

        HeroViewHolder(View itemView) {
            super( itemView );

            textViewName = (TextView) itemView.findViewById( R.id.textView1);

            imageView = (ImageView) itemView.findViewById( R.id.imageView1 );
cardView1=(CardView)itemView.findViewById( R.id.cardView );
           // linearLayout = (LinearLayout) itemView.findViewById( R.id.linearLayout );
        }
    }
   /* protected int getRandomIntInRange(int max, int min){
        return mRandom.nextInt((max-min)+min)+min;
    }

    // Custom method to generate random HSV color
    protected int getRandomHSVColor(){
        // Generate a random hue value between 0 to 360
        int hue = mRandom.nextInt(361);
        // We make the color depth full
        float saturation = 1.0f;
        // We make a full bright color
        float value = 1.0f;
        // We avoid color transparency
        int alpha = 255;
        // Finally, generate the color
        int color = Color.HSVToColor(alpha, new float[]{hue, saturation, value});
        // Return the color
        return color;
    } */

}


/*
public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.HeroViewHolder> {


    private List <Hero> heroList;
    private Context context;

    private static int currentPosition = 0;

    public HeroAdapter(List<Hero> heroList, Context context) {
        this.heroList = heroList;
        this.context = context;
    }

    @Override
    public HeroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout_heroes, parent, false);
        return new HeroViewHolder(v);
    }
    @Override
    public void onBindViewHolder(final HeroViewHolder holder, final int position) {
        Hero hero = heroList.get(position);
        holder.textViewName.setText(hero.getName());
        holder.textViewRealName.setText(hero.getRealname());
        holder.textViewTeam.setText(hero.getTeam());
        holder.textViewFirstAppearance.setText(hero.getFirstappearance());
        holder.textViewCreatedBy.setText(hero.getCreatedby());
        holder.textViewPublisher.setText(hero.getPublisher());
        holder.textViewBio.setText(hero.getBio().trim());

       // Glide.with(context).load(hero.getImageUrl()).into(holder.imageView);
        Picasso.get().load(hero.getImageurl()).into(holder.imageView);
        holder.linearLayout.setVisibility(View.GONE);

        //if the position is equals to the item position which is to be expanded
        if (currentPosition == position) {
            //creating an animation
            //Animation slideDown = AnimationUtils.loadAnimation(context, R.anim.slide_down);

            //toggling visibility
            holder.linearLayout.setVisibility(View.VISIBLE);
           // holder.linearLayout.startAnimation(slideDown);
        }

        holder.textViewName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //getting the position of the item to expand it
                currentPosition = position;

                //reloding the list
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return heroList.size();
    }

    class HeroViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName, textViewRealName, textViewTeam, textViewFirstAppearance, textViewCreatedBy, textViewPublisher, textViewBio;
        ImageView imageView;
        LinearLayout linearLayout;

        HeroViewHolder(View itemView) {
            super(itemView);

            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            textViewRealName = (TextView) itemView.findViewById(R.id.textViewRealName);
            textViewTeam = (TextView) itemView.findViewById(R.id.textViewTeam);
            textViewFirstAppearance = (TextView) itemView.findViewById(R.id.textViewFirstAppearance);
            textViewCreatedBy = (TextView) itemView.findViewById(R.id.textViewCreatedBy);
            textViewPublisher = (TextView) itemView.findViewById(R.id.textViewPublisher);
            textViewBio = (TextView) itemView.findViewById(R.id.textViewBio);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);

            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);
        }
    }}} */

