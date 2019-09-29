package com.example.lebazaarv1;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;

import android.app.SearchManager;

import android.support.v4.view.MenuItemCompat;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


import static com.example.lebazaarv1.MyAsyncTask.lineName;
import static com.example.lebazaarv1.MyAsyncTask.lineName2;
import static com.example.lebazaarv1.MyAsyncTask.listnew;

import static com.example.lebazaarv1.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    ProgressDialog pd;
    public static TextView txtJson;
    static String s2;
    // ImageView image1 = (ImageView) findViewById(R.id.imageViewmain);
    public static ListView mListView;
    Context context=this;
  // public static ListView mListView1;
    //ProgressDialog pd;
   // String x = "", y;

    List <String>  info2;
    //String[]  info2={"1","2","3"};
    int i;

   // nameArray[] nameary=new nameArray[count1];
   // String[] info=myAsyncTaskObj.name;

    MyAsyncTask myAsyncTaskObj = MyAsyncTask.getInstance();
    int count1 = myAsyncTaskObj.count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( activity_main );
        txtJson = (TextView) findViewById( R.id.textViewsearch );

       /* listview = (ListView) findViewById( R.id.listv );
      listview.setClickable( true );
*/
        myAsyncTaskObj.execute();
       // info=myAsyncTaskObj.name;
        boolean checker = true;
        while (checker == true) {
            if (myAsyncTaskObj.singleParsed2 == "entered") {
                checker = false;
            }
        }
        mListView = (ListView) findViewById( R.id.listv );
        //neww gett=new neww();
       //info=gett.getneww();
//info= new String[]{"1", "2", "3"};
  //      ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
    //            android.R.layout.simple_list_item_1, info);
       // mylistview.setAdapter(listAdapter);
       // nameArray[] namearmain=new nameArray[count1];
        //namearmain[2]=new nameArray();
    //   info2= namo();

        //nameArray namedata2=new nameArray();
       // info2=namedata2.getNamearray();
//info2= myAsyncTaskObj.tubeLines;
      //  ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                        //android.R.layout.simple_list_item_1, info2);

        ListView myListView = (ListView)findViewById(R.id.listv);

     //   ArrayAdapter<String> arrayAdapter = new ArrayAdapter <String>(this, android.R.layout.simple_list_item_1,info2);
       CustomList arrayAdapter = new CustomList(this, listnew, R.layout.listrow, new String[] {"name","description"}, new int[] {R.id.textView,R.id.textView1});
       // Picasso.get().load("http://www.letriobazaar.com/Images/Category/Farm.png").into(image1);
        myListView.setAdapter(arrayAdapter);
        //customAdapter adapter=new customAdapter(context,info2);//context,info2
       //mListView.setAdapter( adapter);

        mListView.setClickable( true );
        // mListView1=(ListView)findViewById( R.id.listView1 );
        //CustomAdapter customAdapter1=new CustomAdapter(this);
        //  mListView1.setAdapter( customAdapter1 );
        //
        // Picasso.load("http://www.letriobazaar.com/Images/Category/Farm.png").into(image1);
        //Picasso.get().load("http://www.letriobazaar.com/Images/Category/Farm.png").into(image1);

        mListView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {


                if (position == 0) {
//TextView txt=(TextView)findViewById( R.id.textView );
//txt.setText( "ccc" );
                    Intent myIntent = new Intent( view.getContext(), shopitems.class );
                    startActivityForResult( myIntent, 0 );

                }
                if (position == 1) {


                    Intent myIntent = new Intent( view.getContext(), showitems.class );
                    startActivityForResult( myIntent, 0 );
                }
            }
        } );


        ImageButton loginpress = (ImageButton) findViewById( R.id.signin );

        loginpress.setOnClickListener( new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent( MainActivity.this, signinpage.class );
                MainActivity.this.startActivity( intent2 );
            }
        } );

        ImageButton presscart = (ImageButton) findViewById( R.id.mycart );

        presscart.setOnClickListener( new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {

                Intent intent3 = new Intent( MainActivity.this, usercart.class );
                MainActivity.this.startActivity( intent3 );
            }
        } );

        SearchView sv = (SearchView) findViewById( R.id.searchview );
        sv.setOnQueryTextListener( new SearchView.OnQueryTextListener() {

            public boolean onQueryTextSubmit(String query) {


                return true;
            }

            public boolean onQueryTextChange(String newText) {
                s2 = "http://letriobazaar.com/api/Item/Search/" + newText;
                //sharedclass searchurl= new sharedclass();
                //  searchurl.setVar( s2);

                MyAsyncTasksearch process = new MyAsyncTasksearch( s2 );

                process.execute();


                return true;
            }
        } );
    }

        //   MyAsyncTask process = new MyAsyncTask();
        // process.execute();
       /*final customAdapter custom = new customAdapter( this );

        custom.list.add( new listrow("x","y"  ) );
        listview.setAdapter( custom );*/

        //listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
        //  public void onItemClick(AdapterView <? > arg0, View view, int position, long id) {
        // When clicked, show a toast with the TextView text




    /*class listrow {

        String Title;
        String Desc;


        listrow(String title, String desc) {

            this.Title = title;
            this.Desc = desc;

        }

    }

    public void buttonClicked(View view) {

        Intent intent = new Intent( MainActivity.this, shopitems.class );


        MainActivity.this.startActivity( intent );

    }
/*customAdapter
    //protected void onPostExecute(customAdapter result) {

        // pd.dismiss();

        // populate Listview here...
        //  populateList();
        //sA = new CustomAdapter(MainActivity.this, mListView);
        // songList.setAdapter(sA);
        //   sA.notifyDataSetChanged();
    //}*/
}