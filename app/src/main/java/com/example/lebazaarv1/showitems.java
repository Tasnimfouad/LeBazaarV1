package com.example.lebazaarv1;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.viewpagerindicator.CirclePageIndicator;


import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class showitems extends AppCompatActivity {
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private static final Integer[] IMAGES = {R.drawable.ghee2, R.drawable.ezbetnaghee, R.drawable.ezbetnamenu};
    private ArrayList <Integer> ImagesArray = new ArrayList <Integer>();
    //public int counter;
    String counterstring;
    private Handler repeatUpdateHandler = new Handler();
    private boolean mAutoIncrement = false;
    private boolean mAutoDecrement = false;
    public int mValue;
    int counter=1;
    TextView txt;
    Button increment;
    Button decrement;
    EditText getno;
    String meh;
    // public EditText getno = (EditText) findViewById( R.id.itemsnumber );
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_showitems );

         txt = (TextView) findViewById( R.id.gheedisc2 );
        increment = (Button) findViewById( R.id.incrementbutton );
        decrement = (Button) findViewById( R.id.decrementbutton );
        getno = (EditText) findViewById( R.id.itemsnumber );
        getno.setText( "1" );

       // setno();
        init();


        //     EditText getno = (EditText) findViewById( R.id.itemsnumber );
        // String valueFromEditText=getno.getText().toString();
        //position=Integer.parseInt(valueFromEditText);
        //posit= position+1;
        //String value=String.valueOf( posit );*/

    }

  /*  public void setno() {

        getno.setText( "1" );
        increment.setOnClickListener( new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                meh=getno.getText().toString();
                mValue=Integer.parseInt( meh);
                //counter=mValue;
                mValue=mValue++;
                counterstring= String.valueOf( mValue );

                //posit= position+1;
                //String value=String.valueOf( posit );
            }
        } );
        getno.setText( counterstring );


*/
     //   TextView txt = (TextView) findViewById( R.id.gheedisc2 );
       // txt.setText( x );


    private void init() {
        for (int i = 0; i < IMAGES.length; i++)
            ImagesArray.add( IMAGES[i] );

        mPager = (ViewPager) findViewById( R.id.pager );


        mPager.setAdapter( new SlidingImage_Adapter( showitems.this, ImagesArray ) );


        CirclePageIndicator indicator = (CirclePageIndicator)
                findViewById( R.id.indicator );

        indicator.setViewPager( mPager );

        final float density = getResources().getDisplayMetrics().density;

//Set circle indicator radius
        indicator.setRadius( 5 * density );

        NUM_PAGES = IMAGES.length;

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem( currentPage++, true );
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule( new TimerTask() {
            @Override
            public void run() {
                handler.post( Update );
            }
        }, 3000, 3000 );

        // Pager listener over indicator
        indicator.setOnPageChangeListener( new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        } );

    }
    public void countIN (View view){

        counter++;
        getno.setText(Integer.toString( counter ));


    }
    public void countDE(View view){

        counter--;
       getno.setText(Integer.toString( counter ));


    }

}