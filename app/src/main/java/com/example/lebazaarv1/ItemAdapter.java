package com.example.lebazaarv1;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Random;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder>{




        private Random mRandom = new Random();
        private List <Item_ModelDeclaration> itemList;
        private Context context;
        CardView cardView1;
        private static int currentPosition = 0;

        public ItemAdapter(List <Item_ModelDeclaration> itemList, Context context) {
            this.itemList = itemList;
            this.context = context;
        }

        @Override
        public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from( parent.getContext() ).inflate( R.layout.list_layout_heroes3, parent, false );
            return new com.example.lebazaarv1.ItemAdapter.ItemViewHolder( v );
        }

        @Override
        public void onBindViewHolder(final com.example.lebazaarv1.ItemAdapter.ItemViewHolder holder, final int position) {
            Item_ModelDeclaration item= itemList.get( position );
            holder.textViewName.setText( item.getName() );
            holder.textViewPrice.setText( Double.toString( item.getPrice()));
            // holder.textViewName.getLayoutParams().height = getRandomIntInRange(250,75);
            // holder.linearLayout.getLayoutParams().height = getRandomIntInRange(250,75);
            // Set a random color for TextView background
            // holder.linearLayout.setBackgroundColor(getRandomHSVColor());
            // Glide.with(context).load(hero.getImageUrl()).into(holder.imageView);
         //   Picasso.get().load( "http://www.letriobazaar.com/Images/Category/" + item.getImages()).into( holder.imageView );
          Picasso.get().load( "http://tineye.com/images/widgets/mona.jpg").into( holder.imageView );
//        holder.linearLayout.setVisibility( View.GONE );

            //if the position is equals to the item position which is to be expanded
            if (position == 0 || position == 3) {

//holder.itemView.findViewById( R.id.cardView ).setBackgroundColor( Color.parseColor( "#009688" ));
                holder.itemView.findViewById( R.id.cardView ).setBackgroundColor( Color.parseColor( "#009688" ) );
                // holder.textViewName.setBackgroundColor( Color.BLUE );
                //creating an animation
                //Animation slideDown = AnimationUtils.loadAnimation(context, R.anim.slide_down);

                //toggling visibility
//            holder.linearLayout.setVisibility( View.VISIBLE );
                // holder.linearLayout.startAnimation(slideDown);
            } else if (position == 1 || position == 4) {
                holder.itemView.findViewById( R.id.cardView ).setBackgroundColor( Color.parseColor( "#673AB7" ) );
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
            return itemList.size();
        }

    class ItemViewHolder extends RecyclerView.ViewHolder {
            TextView textViewName;
        TextView textViewPrice;                        //, textViewRealName, textViewTeam, textViewFirstAppearance, textViewCreatedBy, textViewPublisher, textViewBio;
            ImageView imageView;
           // LinearLayout linearLayout;

            ItemViewHolder(View itemView) {
                super( itemView );

                textViewName = (TextView) itemView.findViewById( R.id.textViewitem2);
                textViewPrice = (TextView) itemView.findViewById( R.id.textViewitem);
                imageView = (ImageView) itemView.findViewById( R.id.imageViewitem );
                cardView1=(CardView)itemView.findViewById( R.id.cardView );
                // linearLayout = (LinearLayout) itemView.findViewById( R.id.linearLayout );
            }}}

