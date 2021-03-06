package com.example.lebazaarv1;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
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
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;


import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.RealmQuery;
import io.realm.RealmResults;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static android.widget.SearchView.*;

import android.app.SearchManager;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    ListView listview;
    ProgressDialog pd;
    RecyclerView recyclerView;
    List <Hero> heroList;
    List <Item_ModelDeclaration> List_Items;
    List <Item_ModelDeclaration> List_itempreview;
    public static TextView txtJson;
    static String s2;
    private StaggeredGridLayoutManager _sGridLayoutManager;
    List <Map <String, Object>> listnew2;
    final String URL_GET_DATA = "https://simplifiedcoding.net/demos/marvel/";
    RecyclerView recyclerView1;
    HeroAdapter adapter;
    ItemAdapter itemadapter;
    String BASE_URL_main="http://letriobazaar.com/api/Category/";
    List <Hero> heroList2,heroList_search,heroList3;
    List<HeroRealmm> herorealmmm=new ArrayList <>();
    private RecyclerView.LayoutManager mLayoutManager;
 //   RealmChangeListener realmChangeListener;
    FloatingActionButton myFab;
    MyAdapter myAdapter;
    Realm realmfab1;
    Realm realm=Realm.getDefaultInstance();
    Realm realmstore;
   // Realm realmfab;
    String BASE_URL_Item="http://www.letriobazaar.com/api/Item/";
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
    //RealmList <HeroRealmm> realmList = new RealmList<>();
    public ArrayList<HeroRealmm> latest=new ArrayList <>(  );

    // Realm realm;
    RealmResults <HeroRealmm> heroRealmResults;
  //Realm realm=Realm.getDefaultInstance();


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




    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Toolbar toolbar1=findViewById( R.id.toolbar );
        setSupportActionBar( toolbar1 );
        drawer=findViewById( R.id.drawer_layout );
        NavigationView navigationView=findViewById( R.id.nav_view );
        navigationView.setNavigationItemSelectedListener( this );
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle( this,drawer,toolbar1 ,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
       drawer.addDrawerListener( toggle );
       toggle.syncState();
     //  if(savedInstanceState==null) {
          // getSupportFragmentManager().beginTransaction().replace( R.id.fragment_container, new MessageFragment() ).commit();
         //  navigationView.setCheckedItem( R.id.nav_message );
      // }
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
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(context, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        if(position==0){
                        //    Toast.makeText( getApplicationContext(), "hello", Toast.LENGTH_SHORT ).show();
                            loadHeroesItem();
                           // Intent intent2 = new Intent( MainActivity.this, signinpage.class );
                          //  MainActivity.this.startActivity( intent2 );
                        }
                        // do whatever
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );
      // recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
       // recyclerView.setLayoutManager(mLayoutManager);

        // Initialize a new instance of RecyclerView Adapter instance
     //  ColorAdapter mAdapter = new ColorAdapter(this,colors);

        // Set the adapter for RecyclerView

      //  heroList2 = new ArrayList <>();
        heroList_search=new ArrayList <>(  );

       /* Realm realm=Realm.getDefaultInstance();
        //.executeTransactionAsync(new Realm.Transaction() {
        realm.executeTransaction(new Realm.Transaction() {
                                     @Override
                                     //  public void execute(Realm bgRealm) {
                                     public void execute(@NonNull Realm realm) {
                                         Number currentIDNum = realm.where( Hero.class ).max( "id" );
                                         int nextId;
                                         if (currentIDNum == null) {
                                             nextId = 1;
                                         } else {
                                             nextId = currentIDNum.intValue() + 1;
                                         }*/
        loadHeroes();
//storegrealm=Realm.getDefaultInstance();
        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);

        final android.support.v7.widget.SearchView sv = findViewById( R.id.searchview );
        sv.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));
        //   final Realm realmfab=Realm.getDefaultInstance();
        //sv.setOnQueryTextListener( new OnQueryTextListener() {
        sv.setOnQueryTextListener( new android.support.v7.widget.SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String s) {

                boolean myreturn=true;
                //  realm=Realm.getDefaultInstance();
                //  final Realm realmfab=Realm.getDefaultInstance();
                if (sv.getQuery().length()!= 0) {

                    myreturn=true;
                    heroList3 = new ArrayList <>();
                    heroList3.clear();

                    //   final RealmHelper helper=new RealmHelper( realm );
                    Retrofit retrofit = new Retrofit.Builder()
                            .baseUrl( BASE_URL_main )
                            .addConverterFactory( GsonConverterFactory.create() ) //Here we are using the GsonConverterFactory to directly convert json data to object
                            .build();
                    Api_test api = retrofit.create( Api_test.class );

                    Call <List <Hero>> call = api.getHeroes();


                    call.enqueue( new Callback <List <Hero>>() {
                        @Override
                        //   public void onResponse(Call <List <Hero>> call, Response <List <Hero>> response) {
                        public void onResponse(Call <List <Hero>> call, Response <List <Hero>> response) {
                            heroList = response.body();
                            heroList3.clear();
                            //realm=Realm.getDefaultInstance();
                            RealmHelper helper1=new RealmHelper( realm );

                            // add response to realm database

                            for (int i = 0; i < heroList.size(); i++) {


                                //  JSONObject obj = jsonArray.getJSONObject(i);
                                //  heroes[i] = heroList.get( i ).getRealname();

                                Hero hero = new Hero(

                                        heroList.get( i ).getCategoryID(),
                                        heroList.get( i ).getName(),
                                        heroList.get( i ).getImagePath(),
                                        heroList.get( i ).getDescription()


                                );

                                HeroRealmm herorealmm = new HeroRealmm();
                                herorealmm.setID( i );
//                            herorealmm = realm.createObject(HeroRealmm.class);

                                herorealmm.setCategoryID( heroList.get( i ).getCategoryID() );
                                herorealmm.setName( heroList.get( i ).getName() );
                                herorealmm.setImagePath( heroList.get( i ).getImagePath() );
                                herorealmm.setDescription( heroList.get( i ).getDescription() );

                                // realmList.add( herorealmm );
                                heroList3.add( hero );
                                helper1.storeHeroes( herorealmm );
                                //   realm.beginTransaction();
                                // helper.save( herorealmm );
                                //  realm.commitTransaction();
                            }

                            //   storeRealm( realmList );
                            //  recyclerView = (RecyclerView) findViewById( R.id.recyclerView );

                            // recyclerView.setLayoutManager( new LinearLayoutManager( MainActivity.this ) );

                            //  recyclerView.setHasFixedSize( true );

                            //   recyclerView.forceLayout();


                        }

                        @Override
                        public void onFailure(Call <List <Hero>> call, Throwable t) {
                            Toast.makeText( getApplicationContext(), "Please Check Your Internet Connectivity", Toast.LENGTH_SHORT ).show();


                        }
                    } );
                    //         RealmRecyclerViewAdapter realmadapter= new RealmRecyclerViewAdapter( MainActivity.this, realmList ) ;
                    recyclerView = (RecyclerView) findViewById( R.id.recyclerView );
                    // recyclerView.removeAllViewsInLayout();
                    recyclerView.setLayoutManager( new LinearLayoutManager( MainActivity.this ) );

                    recyclerView.setHasFixedSize( true );
                    adapter = new HeroAdapter( heroList3, getApplicationContext() );
                    recyclerView.setAdapter( adapter );
//realm.close();
                    myFab = (FloatingActionButton) findViewById( R.id.myFAB );

                    myFab.show();

                    myFab.setOnClickListener( new View.OnClickListener() {
                        public void onClick(View v) {
//Realm realmfab=Realm.getDefaultInstance();
                          //  realm=Realm.getDefaultInstance();

                  final RealmHelper helper = new RealmHelper( realm );
                            myAdapter = new MyAdapter( MainActivity.this, helper.justRefresh() );
                            recyclerView.setAdapter( myAdapter );
                          RealmChangeListener  realmChangeListener = new RealmChangeListener() {
                                @Override
                                public void onChange(Object o) {
//realm=Realm.getDefaultInstance();
                                    //  RealmHelper helper = new RealmHelper( realmfab );
                                    // helper.latest.clear();
                                    //  helper.retrieveFromDB();
                                    myAdapter = new MyAdapter( MainActivity.this,helper.justRefresh() );
                                    recyclerView.setAdapter( myAdapter );

                                }
                            };
                            realm.addChangeListener( realmChangeListener );
                            //  myFab.setEnabled( false );
                        }
                      //  realm.removeChangeListener( realmChangeListener );
                    } );
realm.close();
                }else  if (sv.getQuery().length()== 0) {
                    myreturn=false;

                }

                //realmfab.close();
                //realm.close();

                return myreturn;
            }
        } );
//realm.close();

    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void loadHeroes() {
heroList2=new ArrayList <>(  );
      //  final RealmHelper helper=new RealmHelper( realm );
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl( BASE_URL_main )
                .addConverterFactory( GsonConverterFactory.create() ) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();
        Api_test api = retrofit.create( Api_test.class );

        Call <List <Hero>> call = api.getHeroes();


        call.enqueue( new Callback <List <Hero>>() {
            @Override
         //   public void onResponse(Call <List <Hero>> call, Response <List <Hero>> response) {
            public void onResponse(Call <List <Hero>> call, Response <List <Hero>> response) {
                 heroList = response.body();


                for (int i = 0; i < heroList.size(); i++) {



                    Hero hero = new Hero(

                            heroList.get( i ).getCategoryID(),
                            heroList.get( i ).getName(),
                            heroList.get( i ).getImagePath(),
                            heroList.get( i ).getDescription()


                    );

                    heroList2.add( hero );

                }
                adapter = new HeroAdapter( heroList2, getApplicationContext());
                recyclerView.setAdapter( adapter );

            }

            @Override
            public void onFailure(Call <List <Hero>> call, Throwable t) {
                Toast.makeText( getApplicationContext(), "Please Check your Internet Connection", Toast.LENGTH_SHORT ).show();


            }
        } );

    }



           /* public boolean onQueryTextChange(String newText) {

                heroList3 = new ArrayList <>();
                heroList3.clear();
                //final RealmHelper helper=new RealmHelper( realm );
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl( BASE_URL_main )
                        .addConverterFactory( GsonConverterFactory.create() ) //Here we are using the GsonConverterFactory to directly convert json data to object
                        .build();
                Api_test api = retrofit.create( Api_test.class );

                Call <List <Hero>> call = api.getHeroes();


                call.enqueue( new Callback <List <Hero>>() {
                    @Override
                    //   public void onResponse(Call <List <Hero>> call, Response <List <Hero>> response) {
                    public void onResponse(Call <List <Hero>> call, Response <List <Hero>> response) {
                        heroList = response.body();
heroList3.clear();


                        // add response to realm database

                        for (int i = 0; i < heroList.size(); i++) {


                            //  JSONObject obj = jsonArray.getJSONObject(i);
                            //  heroes[i] = heroList.get( i ).getRealname();

                            Hero hero = new Hero(

                                    heroList.get( i ).getCategoryID(),
                                    heroList.get( i ).getName(),
                                    heroList.get( i ).getImagePath(),
                                    heroList.get( i ).getDescription()


                            );

          HeroRealmm herorealmm =new  HeroRealmm();
herorealmm.setID(i );
//                            herorealmm = realm.createObject(HeroRealmm.class);

                            herorealmm.setCategoryID(   heroList.get( i ).getCategoryID());
                            herorealmm.setName(   heroList.get( i ).getName());
                            herorealmm.setImagePath( heroList.get( i ).getImagePath());
                            herorealmm.setDescription(heroList.get( i ).getDescription());

                           // realmList.add( herorealmm ) ;
                            heroList3.add( hero );
                            storeHeroes( herorealmm);
                         //   realm.beginTransaction();
                          // helper.save( herorealmm );
                          //  realm.commitTransaction();
                        }

                    //   storeRealm( realmList );
                        recyclerView = (RecyclerView) findViewById( R.id.recyclerView );
                       // recyclerView.removeAllViewsInLayout();
                        recyclerView.setLayoutManager( new LinearLayoutManager( MainActivity.this ) );

                        recyclerView.setHasFixedSize( true );

                     //   recyclerView.forceLayout();




                    }

                    @Override
                    public void onFailure(Call <List <Hero>> call, Throwable t) {
                        Toast.makeText( getApplicationContext(), "hello", Toast.LENGTH_SHORT ).show();


                    }
                } );
       //         RealmRecyclerViewAdapter realmadapter= new RealmRecyclerViewAdapter( MainActivity.this, realmList ) ;
                adapter = new HeroAdapter( heroList3, getApplicationContext());
                recyclerView.setAdapter( adapter );


                FloatingActionButton myFab = (FloatingActionButton)findViewById(R.id.myFAB);
                myFab.show();
                myFab.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                        // Initialize Realm
                //    realm=Realm.getDefaultInstance();
//realm.beginTransaction();
                        //Retrieve Data

                        //Adapter
                  //      final HeroRealmm herorealmm =new  HeroRealmm();
                        myAdapter=new MyAdapter( MainActivity.this,helper.justRefresh() );
                        recyclerView.setAdapter( myAdapter );
                        realmChangeListener= new RealmChangeListener() {
                            @Override
                            public void onChange(Object o) {
                           //   Realm  realm=Realm.getDefaultInstance();
                                RealmHelper helper=new RealmHelper( realm );
                               // helper.latest.clear();
                              //  helper.retrieveFromDB();
                                myAdapter=new MyAdapter( MainActivity.this,helper.justRefresh() );
                                recyclerView.setAdapter( myAdapter );

                            }
                        };
realm.addChangeListener( realmChangeListener );

                    }
                });


                return true;
            }
        } );
//        realm.removeChangeListener( realmChangeListener );
        sv.clearFocus();
        sv.onActionViewCollapsed();*/

        //  sharingclass.sharedValue=s2;


    private void loadHeroesItem() {

        List_itempreview=new ArrayList <>(  );
        Retrofit retrofit_Items = new Retrofit.Builder()
                .baseUrl( BASE_URL_Item)
                .addConverterFactory( GsonConverterFactory.create() ) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();
        Api_items api_items = retrofit_Items.create(Api_items.class );

        Call <List <Item_ModelDeclaration>> callitems = api_items.get_Items();


        callitems.enqueue( new Callback <List <Item_ModelDeclaration>>() {
            @Override
            public void onResponse(Call <List <Item_ModelDeclaration>> call, Response <List <Item_ModelDeclaration>> response) {
                List_Items = response.body();

                for (int i = 0; i < List_Items.size(); i++) {

                    Item_ModelDeclaration itemModelDeclaration= new Item_ModelDeclaration(

                          List_Items.get( i ).getItemID(),
                            List_Items.get( i ).getName(),
                            List_Items.get( i ).getPrice(),
                          List_Items.get( i ).getDescription(),
                            List_Items.get( i ).getShopID(),
                            List_Items.get( i ).getCategoryID(),
                            List_Items.get( i ).getSortingOrder(),
                           List_Items.get( i ).getImages(),
                           List_Items.get( i ).getSizes(),
                            List_Items.get( i ).getColours()

                    );


                   List_itempreview.add(itemModelDeclaration );
                }
                itemadapter = new ItemAdapter( List_itempreview, getApplicationContext() );
                recyclerView.setAdapter( itemadapter );
            }

            @Override
            public void onFailure(Call <List <Item_ModelDeclaration>> call, Throwable t) {
                Toast.makeText( getApplicationContext(), "hello", Toast.LENGTH_SHORT ).show();


            }
        } );

    }
/*public void readrealm(RealmList<HeroRealmm> heroRealmmlist2){

        Realm realm1=Realm.getDefaultInstance();
 //  RealmQuery <HeroRealmm> query = realm1.where(HeroRealmm.class);
    RealmResults<HeroRealmm> contacts = realm1.where(HeroRealmm.class).findAll();

  //  int size = contacts.size();
   // for (int i = 0;i<size;i++){
      // HeroRealmm contact = contacts.get(i);
        RealmList<HeroRealmm> eMails = heroRealmmlist2;
    Log.e( "Tag", eMails.toString());
// Add query conditions:
 // query.equalTo("Name", "Books");
   // query.or().equalTo("name", "Peter");

// Execute the query:
  // RealmResults<HeroRealmm> result1 = query.findAll();
  //  RealmResults<HeroRealmm> list= realm1.where(HeroRealmm.class).sort("Name").findAll();
    //  RealmResults <HeroRealmm> list = realm1.where( HeroRealmm.class ).equalTo("ImagePath", "Furniture2.png").findAll();
        if(realm1 != null) {
        realm1.close();
        }


    // RealmResults<HeroRealmm> result32 = query.equalTo( "Name","Fashion" ).findAll();
// Or alternatively do the same all at once (the "Fluent interface"):
    // RealmResults<HeroRealmm> result1 = realm1.where(HeroRealmm.class).findAll();
    //  RealmResults <HeroRealmm> result1 = realm1.where( HeroRealmm.class ).equalTo("name", "Fashion").findAll();
    // HeroRealmm[] resultArray = result1.toArray(new HeroRealmm[result1.size()]);
//    HeroRealmm[] resultArray = (HeroRealmm[]) result1.toArray();
//    String[] stringArray = Arrays.copyOf(resultArray, resultArray.length, String[].class);
    //String str = Arrays.toString(stringArray);

}*/

  /*     public void storeHeroes( HeroRealmm heroRealmm) {
    // realmstore=Realm.getDefaultInstance();
      realm.beginTransaction();


                realm.copyToRealmOrUpdate( heroRealmm );
              // HeroRealmm heroRealmm1 = realm.createObject(HeroRealmm.class); // Create managed objects directly
realm.commitTransaction();
//realmstore.close();

    } */
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_message:
                Toast.makeText( this, "Send", Toast.LENGTH_SHORT ).show();
            //    getSupportFragmentManager().beginTransaction().replace( R.id.fragment_container, new MessageFragment() ).commit();
              //
                //
                //  readrealm( realmList );
                break;
            case R.id.nav_smile:
                Toast.makeText( this, "Send", Toast.LENGTH_SHORT ).show();
              //  getSupportFragmentManager().beginTransaction().replace( R.id.fragment_container, new ChatFragment() ).commit();
                break;
            case R.id.nav_menu:
                Toast.makeText( this, "Send", Toast.LENGTH_SHORT ).show();
                break;
        }
        drawer.closeDrawer( GravityCompat.START );
        return true;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onBackPressed() {

        if (drawer.isDrawerOpen( GravityCompat.START )) {
            drawer.closeDrawer( GravityCompat.START );
            loadHeroes();
        } else {
            loadHeroes();
       //   super.onBackPressed();
        }
    }
    @Override
    protected void onDestroy() {
    super.onDestroy();
//Realm realmdelete=Realm.getDefaultInstance();
      //  realmdelete.removeChangeListener( realmChangeListener );
      //  realm.removeChangeListener( realmChangeListener );
        Realm.deleteRealm( realm.getConfiguration() );
realm.close();
  //  realmdelete.close();
  }

}

//  Hero hero = new Hero();

//hero.setName( "tsh" );
//hero.setImagePath( "yyy" );
//hero.setDescription( "ffff" );
//  realm.insertOrUpdate( hero );
//save_into_database();
//  realm=Realm.]=-09kjhgInstance();
//   realm.beginTransaction();
// storeNewsList(heroList2);
//  realm.copyToRealmOrUpdate(heroList2);
// String notesCount = String.valueOf( realm.where( Hero.class).findAll() );

//Log.d("my first",notesCount);
//   realm.commitTransaction();


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
//   RealmResults <Hero_Realm> realmCities= realm.where(Hero_Realm.class).findAll();
//fetching the data
//  realmCities.load();
//Log.e( "Tag",realmCities.toString() );

  /*  private void save_into_database() {
       Realm realm=Realm.getDefaultInstance();
        //.executeTransactionAsync(new Realm.Transaction() {
        realm.executeTransaction(new Realm.Transaction() {
            @Override
          //  public void execute(Realm bgRealm) {
            public void execute(@NonNull Realm realm) {
                Number currentIDNum = realm.where( Hero.class ).max( "id" );
                int nextId;
                if (currentIDNum == null) {
                    nextId = 1;
                } else {
                    nextId = currentIDNum.intValue() + 1;
                }
                Hero hero = new Hero();
                hero.setCategoryID( "9292" );
                hero.setName( "tsh" );
                hero.setImagePath( "yyy" );
                hero.setDescription( "ffff" );
                realm.insertOrUpdate( hero );
                // Hero shop = bgRealm.createObject(Hero.class);
                // shop.setTitle(title);
                //    shop.setType(type);
          /*  }
        }, new Realm.Transaction.OnSuccess() {
            @Override
            public void onSuccess() {
                Log.v("Database", "saved!");
            }
        }, new Realm.Transaction.OnError() {
            @Override
            public void onError(Throwable error) {
                Log.v("Database", error.getMessage());
}
            }   });
    }*/


    /*
    public void storeHeroes(final List<Hero> bookings) {
        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.insertOrUpdate(bookings);
            }
        });
    } */
  /* public void storeHeroes(final List<Hero> heroRealm) {
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
              Hero student = realm.createObject(Hero.class);
                realm.insertOrUpdate( heroRealm );
            }
        });
    }
   private void readData(){

        RealmResults <Hero> students = realm.where( Hero.class ).findAll();
        //   RealmQuery<Student> students=realm.where( Student.class ).equalTo( "name","tasnim" );
     //   txtJson.setText( "" );
      //  String data="";
//String data=students.toString();
     //   for (Hero_Realm student:students){
      //      try {
            //    data=data+students.toString();

           // }catch (NullPointerException e) {
             //   e.printStackTrace();
           // }
        //}
        txtJson.setText( (CharSequence) students );

    }*/
    /*
    private void loadHeroes_search() {
        Retrofit retrofit_search = new Retrofit.Builder()
                .baseUrl( Api_search.BASE_URL_SEARCH)
                .addConverterFactory( GsonConverterFactory.create() ) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();
        Api_search api_Search = retrofit_search.create( Api_search.class );
        Call <List <Hero>> call_search = api_Search.getHeroes_Search();
        call_search.enqueue( new Callback <List <Hero>>() {
            @Override
            public void onResponse(Call <List <Hero>> call_search, Response <List <Hero>> response_search) {
                List <Hero> heroList_search = response_search.body();

                //Creating an String array for the ListView
                //String[] heroes = new String[heroList.size()];
                //    try {
                //     JSONArray jsonArray = (JSONArray) heroList;

                //looping through all the heroes and inserting the names inside the string array
       for (int i = 0; i < heroList_search.size(); i++) {
                    //  JSONObject obj = jsonArray.getJSONObject(i);
                    //  heroes[i] = heroList.get( i ).getRealname();
                    Hero hero_search = new Hero(
                            heroList_search.get( i ).getName(),
                            heroList_search.get( i ).getRealname(),
                            heroList_search.get( i ).getTeam(),
                            heroList_search.get( i ).getFirstappearance(),
                            heroList_search.get( i ).getCreatedby(),
                            heroList_search.get( i ).getPublisher(),
                            heroList_search.get( i ).getImageurl(),
                            heroList_search.get( i ).getBio()


                    );

                    heroList_search.add( hero_search );//lazem y3raf hy3ml el bl list dy badal ma ydrab
                }
                Toast.makeText( getApplicationContext(),"works", Toast.LENGTH_SHORT ).show();
                //  adapter = new HeroAdapter( heroList_search, getApplicationContext() );
                //  recyclerView.setAdapter( adapter );
                //  } catch (JSONException e) {
                //  e.printStackTrace();
                //}

                //ListView listView = (ListView) findViewById( R.id.recyclerView );
                //displaying the string array into listview
                //listView.setAdapter( new ArrayAdapter <String>( getApplicationContext(), android.R.layout.simple_list_item_1, heroes ) );
            }

            @Override
            public void onFailure(Call <List <Hero>> call_search, Throwable t) {



            }
        } );

    }

*/

// programmatically check : data is inserted in to realm or not

//  String notesCount = String.valueOf( realm.where( Hero.class).findAll() );
//readData();

//  Log.d("my first",notesCount);


//  storeHeroes( hero_list_realm );
//readData();


//  } catch (JSONException e) {
//  e.printStackTrace();
//}

//ListView listView = (ListView) findViewById( R.id.recyclerView );
//displaying the string array into listview
//listView.setAdapter( new ArrayAdapter <String>( getApplicationContext(), android.R.layout.simple_list_item_1, heroes ) );
   /* @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void storeNewsList(final List<Hero> newsList) {


        try(Realm realm = Realm.getDefaultInstance()) {
            realm.executeTransaction(new Realm.Transaction() {
                @Override
                public void execute(Realm realm) {
                    RealmList<Hero> _newsList = new RealmList<>();
                    _newsList.addAll(newsList);
                    realm.insertOrUpdate(_newsList); // <-- insert unmanaged to Realm
                    realm.close();
                }
            });
        } */

        /*try(Realm realm = Realm.getDefaultInstance()) {
            realm.executeTransaction(new Realm.Transaction() {
                @Override
                public void execute(Realm realm) {
                    NewsList newsListObj = new NewsList(); // <-- create unmanaged
                    RealmList<News> _newsList = new RealmList <>();
                    _newsList.addAll(newsList);
                    newsListObj.setNewsList(_newsList);
                    newsListObj.setCategoryId(categoryId);
                    realm.insert(newsListObj); // <-- insert unmanaged to Realm
                }
            });
        } */

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
//    storeRealm( herorealmmm );
//realm1.close();
//  Log.e( "Tag", realmList.where().toString());

//   adapter = new HeroAdapter( heroList2, getApplicationContext() );
//recyclerView.setAdapter( adapter );



//  Realm realm = Realm.getDefaultInstance();

              /*  try {
                    RealmConfiguration config2 = new RealmConfiguration.Builder()
                            .deleteRealmIfMigrationNeeded()
                            .build();


                    realm = Realm.getInstance(config2);
                } catch (RealmMigrationNeededException r) {
                    Realm.deleteRealm( realm.getConfiguration() );
                    realm = Realm.getInstance(realm.getConfiguration());
                }*/

//      realm.delete( HeroRealmm.class ); // Remove older values first




//Creating an String array for the ListView
//String[] heroes = new String[heroList.size()];
//    try {
//     JSONArray jsonArray = (JSONArray) heroList;

//looping through all the heroes and inserting the names inside the string array
//   realm.beginTransaction();
//   HeroRealmm hero_realm = realm.createObject( HeroRealmm.class, "10" );


//realm.insertOrUpdate( hero_realm );
                 /*   Hero hero = new Hero(
                            heroList.get( i ).getItems(),
                            heroList.get( i ).getCategoryID(),
                            heroList.get( i ).getName(),
                            heroList.get( i ).getImagePath(),
                            heroList.get( i ).getDescription(),
                            heroList.get( i ).getActive(),
                            heroList.get( i ).getCreatedOn(),
                            heroList.get( i ).getCreatedBy(),
                            heroList.get( i ).getModifiedOn(),
                            heroList.get( i ).getModifiedBy()


                    ); */
      /*     Hero hero = new Hero(
                            heroList.get( i ).getName(),
                            heroList.get( i ).getRealname(),
                            heroList.get( i ).getTeam(),
                            heroList.get( i ).getFirstappearance(),
                            heroList.get( i ).getCreatedby(),
                            heroList.get( i ).getPublisher(),
                            heroList.get( i ).getImageurl(),
                            heroList.get( i ).getBio()


                    );  */

// hero_list_realm.add(herotoRealm );

//   realm.close();

//txtJson.setText( "tasnim" );

// realm.insertOrUpdate( hero );
    /*      Realm.init( getApplicationContext() );
                RealmConfiguration config=new RealmConfiguration.Builder().build();
                Realm.setDefaultConfiguration( config );



                // add response to realm database
                Realm realm = Realm.getInstance(config);
                realm.beginTransaction();
                realm.copyToRealmOrUpdate(heroList);
                realm.commitTransaction();
                realm.close();*/

