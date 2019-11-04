package com.example.lebazaarv1;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
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
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.lebazaarv1.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    ProgressDialog pd;
    RecyclerView recyclerView;
    public static TextView txtJson;
    static String s2;
    private StaggeredGridLayoutManager _sGridLayoutManager;
    List <Map <String, Object>> listnew2;
    final String URL_GET_DATA = "https://simplifiedcoding.net/demos/marvel/";
    RecyclerView recyclerView1;
    HeroAdapter adapter;
    List <Hero> heroList,heroList2;
    private RecyclerView.LayoutManager mLayoutManager;
    // ImageView image1 = (ImageView) findViewById(R.id.imageViewmain);
    // public static ListView mListView;
    Context context = this;
    // public static ListView mListView1;
    //ProgressDialog pd;
    // String x = "", y;
    private DrawerLayout drawer;
    List <String> info2;
    //String[]  info2={"1","2","3"};
    int i;

    // nameArray[] nameary=new nameArray[count1];
    // String[] info=myAsyncTaskObj.name;

   /* Retrofit MyAsyncTask myAsyncTaskObj = MyAsyncTask.getInstance();
    int count1 = myAsyncTaskObj.count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( activity_main );
        txtJson = (TextView) findViewById( R.id.textViewsearch );
   myAsyncTaskObj.execute();
       // info=myAsyncTaskObj.name;
        boolean checker = true;
        while (checker == true) {
            if (myAsyncTaskObj.singleParsed2 == "entered") {
                checker = false;
            }
        }
        recyclerView=findViewById( R.id.rv );

            LinearLayoutManager layoutManager=new LinearLayoutManager( this );
         //   _sGridLayoutManager = new StaggeredGridLayoutManager(2,
                //    StaggeredGridLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(layoutManager);
            customm( myAsyncTaskObj.listnew );   Retrofit */
       /* listview = (ListView) findViewById( R.id.listv );
      listview.setClickable( true );
*/

    // mListView = (ListView) findViewById( R.id.listv );
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


    //ListView myListView = (ListView)findViewById(R.id.listv);

    //   ArrayAdapter<String> arrayAdapter = new ArrayAdapter <String>(this, android.R.layout.simple_list_item_1,info2);
  /*   CustomList arrayAdapter = new CustomList(this, myAsyncTaskObj.listnew);
       // Picasso.get().load("http://www.letriobazaar.com/Images/Category/Farm.png").into(image1);
      //  myListView.setAdapter(arrayAdapter);
       // customAdapter adapter=new customAdapter(context,info2);//context,info2
       recyclerView.setAdapter( arrayAdapter);

      recyclerView.setClickable( true );*/
    // mListView1=(ListView)findViewById( R.id.listView1 );
    //CustomAdapter customAdapter1=new CustomAdapter(this);
    //  mListView1.setAdapter( customAdapter1 );
    //
    // Picasso.load("http://www.letriobazaar.com/Images/Category/Farm.png").into(image1);
    //Picasso.get().load("http://www.letriobazaar.com/Images/Category/Farm.png").into(image1);

    /*     recyclerView.setOnClickListener( new View.OnClickListener() {

             @Override
             public void onClick(View v) {
                int position= (int) recyclerView.getChildItemId( v );
                 if (position == 0) {
  //TextView txt=(TextView)findViewById( R.id.textView );
  //txt.setText( "ccc" );
                     Intent myIntent = new Intent( MainActivity.this, shopitems2.class );
                     startActivityForResult( myIntent, 0 );

                 }
                 if (position == 1) {


                     Intent myIntent = new Intent( MainActivity.this, showitems.class );
                     startActivityForResult( myIntent, 0 );
                 }

             }


         } );

  */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Toolbar toolbar1=findViewById( R.id.toolbar );
        setSupportActionBar( toolbar1 );
        drawer=findViewById( R.id.drawer_layout );
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle( this,drawer,toolbar1 ,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
       drawer.addDrawerListener( toggle );
       toggle.syncState();

        recyclerView = (RecyclerView) findViewById( R.id.recyclerView );
        recyclerView.setHasFixedSize( true );

        //mLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        //GridLayoutManager glm = new GridLayoutManager(this, );
       final GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
      gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {

//                if (position % 3 == 0) {
//                    Log.e("TAG", "Position: " + position +" position % 3= " + position % 3 + " return 2");
//                    return 2;
//                } else {
//                    Log.e("TAG", "Position: " + position +" position % 3= " + position % 3 + " return 1");
//                    return 1;
//                }

                    @Override
                    public int getSpanSize(int position) {

                        if (position == 0||position==1) {
                   Log.e("TAG", "Position: " + position +" position % 3= " + position % 3 + " return 2");

                   return 2;
              } else {
                            Log.e( "TAG", "Position: " + position + " position % 3= " + position % 3 + " return 1" );
                            return 1;
//                }
                        }
                        }
                });
        recyclerView.setLayoutManager(gridLayoutManager);
      // recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
       // recyclerView.setLayoutManager(mLayoutManager);

        // Initialize a new instance of RecyclerView Adapter instance
     //  ColorAdapter mAdapter = new ColorAdapter(this,colors);

        // Set the adapter for RecyclerView

        heroList2 = new ArrayList <>();

        loadHeroes();
    }

    private void loadHeroes() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl( Api_test.BASE_URL )
                .addConverterFactory( GsonConverterFactory.create() ) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();
        Api_test api = retrofit.create( Api_test.class );
        Call <List <Hero>> call = api.getHeroes();
        call.enqueue( new Callback <List <Hero>>() {
            @Override
            public void onResponse(Call <List <Hero>> call, Response <List <Hero>> response) {
                List <Hero> heroList = response.body();

                //Creating an String array for the ListView
                //String[] heroes = new String[heroList.size()];
            //    try {
              //     JSONArray jsonArray = (JSONArray) heroList;

                //looping through all the heroes and inserting the names inside the string array
                for (int i = 0; i < heroList.size(); i++) {
                  //  JSONObject obj = jsonArray.getJSONObject(i);
                  //  heroes[i] = heroList.get( i ).getRealname();
                   Hero hero = new Hero(
                           heroList.get( i ).getName(),
                           heroList.get( i ).getRealname(),
                           heroList.get( i ).getTeam(),
                           heroList.get( i ).getFirstappearance(),
                           heroList.get( i ).getCreatedby(),
                           heroList.get( i ).getPublisher(),
                           heroList.get( i ).getImageurl(),
                           heroList.get( i ).getBio()


                    );

             heroList2.add( hero );
                }

                adapter = new HeroAdapter( heroList2, getApplicationContext() );
                recyclerView.setAdapter( adapter );
              //  } catch (JSONException e) {
                  //  e.printStackTrace();
                //}

                    //ListView listView = (ListView) findViewById( R.id.recyclerView );
                //displaying the string array into listview
                 //listView.setAdapter( new ArrayAdapter <String>( getApplicationContext(), android.R.layout.simple_list_item_1, heroes ) );
            }

            @Override
            public void onFailure(Call <List <Hero>> call, Throwable t) {
                Toast.makeText( getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT ).show();


            }
        } );


/* RETROFIT
                        Retrofit retrofit = new Retrofit.Builder()
              .baseUrl(Api_test.BASE_URL)
              .addConverterFactory( GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
              .build();

      //creating the api interface
      Api_test api = retrofit.create(Api_test.class);

      //now making the call object
      //Here we are using the api method that we created inside the api interface
      Call <List<Hero>> call = api.getHeroes();

      //then finallly we are making the call using enqueue()
      //it takes callback interface as an argument
      //and callback is having two methods onRespnose() and onFailure
      //if the request is successfull we will get the correct response and onResponse will be executed
      //if there is some error we will get inside the onFailure() method
      call.enqueue(new Callback <List<Hero>>() {
          @Override
          public void onResponse(Call<List<Hero>> call, Response <List<Hero>> response) {
              List <Hero> heroList = response.body();

              //Creating an String array for the ListView
              String[] heroes = new String[heroList.size()];

              //looping through all the heroes and inserting the names inside the string array
              for (int i = 0; i < heroList.size(); i++) {
                  heroes[i] = heroList.get( i ).getName();
              }

              ListView listView = (ListView) findViewById( R.id.recyclerView );
              //displaying the string array into listview
              listView.setAdapter( new ArrayAdapter <String>( getApplicationContext(), android.R.layout.simple_list_item_1, heroes ) );
          } @Override
          public void onFailure(Call<List<Hero>> call, Throwable t) {
              Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();


          }
      });      RETROFIT */
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


                Intent myIntent = new Intent( MainActivity.this, showitems.class );
                startActivityForResult( myIntent, 0 );
                return true;
            }
        } );

        //  sharingclass.sharedValue=s2;


    }
    @Override
    public void onBackPressed( ){

        if(drawer.isDrawerOpen( GravityCompat.START )){
            drawer.closeDrawer( GravityCompat.START );
        }
        else {
        super.onBackPressed();
        }
    }
}

/*Retrofit public void customm(List<Map <String, Object>> listnew1){
    CustomList arrayAdapter = new CustomList(this,listnew1);
     recyclerView.setAdapter( arrayAdapter);

    recyclerView.setClickable( true );}    Retrofit*/

    // Picasso.get().load("http://www.letriobazaar.com/Images/Category/Farm.png").into(image1);
    //  myListView.setAdapter(arrayAdapter);
    // customAdapter adapter=new customAdapter(context,info2);//context,info2


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
