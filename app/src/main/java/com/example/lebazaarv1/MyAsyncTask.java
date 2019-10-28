package com.example.lebazaarv1;


import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.DebugUtils;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import static com.example.lebazaarv1.MainActivity.mListView;

public class MyAsyncTask extends AsyncTask<Void,Void,Void> {

    String data="";
    static String dataParsed="";
    public static Bitmap bmp;
    String dataParsed2="";
    String singleParsed="";
    //  Bitmap img;
    // static String parseop;
    String singleParsed2="FLAG";
    TextView inlist;
    arraylist [] parsedarray ,parseop;
    public nameArray[] namear;
   static String x1,x3,p1,p2,p3;
    public static  Bitmap x2,dataParsed1;
    public static List <String> list,listname;
    static RequestCreator myimage=null;

//ImageView here=MainActivity.image1;
   // static ArrayList<String> tubeLines = new ArrayList<String>();
    //static ArrayList<String> tubeLines2 = new ArrayList<String>();
  public List<Map<String, Object>> listnew = new ArrayList<Map<String, Object>>();
    HashMap map = new HashMap <String,Object>();
    int[] imagepath;
  static String[] name,name2;
    ArrayList<String> names;
    String[] description;
    private static MyAsyncTask single_instance = null;
    public int count;
    RequestCreator image;
   String lineName,lineName2;
//MainActivity mainActivity=new MainActivity();
    // public int[] images={R.drawable.homedesign,R.drawable.homedesign,R.drawable.ic_launcher_background,R.drawable.homedesign};
    // public String[] names={"Ya nass","leather","Sofia","Bazooka"};
int i=0;
    private MyAsyncTask(){}
    public static MyAsyncTask getInstance()
    {
        if (single_instance == null)
            single_instance = new MyAsyncTask();

        return single_instance;
    }
    @Override
    protected Void doInBackground(Void... voids) {
        try {

            URL url = new URL( "http://www.letriobazaar.com/api/Category/GetCategory" );
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( inputStream ) );
            String line = "";

            while (line != null) {
                line = bufferedReader.readLine();
                data = data + line;
            }
            // parsedarray = new arraylist[x];

            //ONObject  JO = JA.getJSONObject(  )
          //  Log.i("MyAsyncTask","Data input");
                JSONArray JA = new JSONArray( data );
                count = JA.length();

           // ArrayList<String> tubeLines = new ArrayList<String>();
          //  list = new ArrayList<String>();
            for (int i=0; i<JA.length(); i++) {
                //x1=JA.get( "Name" );
               // list.add( x1);

            //}

        //    for(int i=0;i<response.length();i++) {
               // HashMap map = new HashMap <String,String>();
                // Get current json object
                JSONObject linee = JA.getJSONObject(i);
            //    Log.i("MyAsyncTask","Json OK");
                // Get the current line (json object) data
                // To avoid crash use optString
                lineName = linee.optString("Name" );
               lineName2 = linee.optString("Description","N/A");
               // myimage=Picasso.get().load("http://www.letriobazaar.com/Images/Category/Farm.png");

                map.put("name", lineName);
               map.put("description", lineName2);
            //   URL urll = new URL("http://www.letriobazaar.com/Images/Category/"+lineName+".png");
             //  HttpURLConnection con = (HttpURLConnection) urll.openConnection();
              //  con.setDoInput(true);
                //con.connect();
                //InputStream input = con.getInputStream();
                //Bitmap bitmap = BitmapFactory.decodeStream(input);
              // map.put( "photo",bitmap );
              // image=Picasso.get().load("http://www.letriobazaar.com/Images/Category/Farm.png");
                //map.put( "photo",image);



                listnew.add(map);
                // add all items
               // tubeLines.add(1,lineName);
               // tubeLines.add(lineName);
               //tubeLines2.add( lineName2 );
              // tubeLines.addAll( tubeLines2 );
              //  Log.i("MyAsyncTask","map done");
            }

          /*  ListView myListView = (ListView)findViewById(R.id.listv);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter <String>(this, android.R.layout.simple_list_item_1, tubeLines);
            myListView.setAdapter(arrayAdapter);
*/
       /* list = new ArrayList<String>();
        for (int i=0; i<JA.length(); i++) {
            //x1=JA.get( "Name" );
            list.add( x1);

            } */
// Note that these may throw several exceptions
                ;//mear=new nameArray[count];
                //    parsedarray = new arraylist[count];
              //  while (i<count){
                     //   x = JA.length();
                     //   parsedarray[i] = new arraylist();

                     // parseop = new arraylist[x];
                     // parseop[i] = new arraylist();
                //     JSONObject JO = (JSONObject) JA.get( i );
                  //   JO.optJSONArray( "Name" );
                  //   x1 = JO.get( "Name" ).toString();
                    // list.add( x1 );
             //        i++;
                  //   list.add( x1 );
                     //  namear[i]=new nameArray();
                     // namear[i].setNamearray( x1 );
                     //dataParsed=x1;
                     // name[i]=dataParsed;
                     // mainActivity.info[i]=name[i];
                     // name[i]=x1;
                     //put it in a name array
//                x2 = (Bitmap) JO.get( "ImagePath" );
                     //put in image array
                     // x3 = JO.get( "Description" ).toString();
                     // parsedarray[i].setName( x1 );
                     //  parsedarray[i].setImage( x2 );
                     //parsedarray[i].setDescription( x3 );

                     //dataParsed = x1 + dataParsed;
                     //  MainActivity.txtJson.setText( dataParsed);
                     //dataParsed1=x2;
                     // dataParsed1 = x2 + dataParsed1;
                     //  dataParsed2 = x3 + dataParsed2;
                     //  p1=dataParsed+dataParsed2;
                     singleParsed2 = "entered";
                 //}
                // parseop[i]=parsedarray[i].getName().toString()+parsedarray[i].getImage().toString()+parsedarray[i].getDescription().toString();
                /*InputStream in = new URL("http://homepages.cae.wisc.edu/~ece533/images/fruits.png").openStream();
                bmp = BitmapFactory.decodeStream(in);*/

                /*JSONObject JO= (JSONObject) JA.get( i );
                singleParsed=  JO.get( "Name" ).toString();
                        //put it in a name array
                      singleParsed1= JO.get( "ImagePath" ).toString();
                       //put in image array
                    singleParsed2= JO.get( "Description").toString();
                //3 different arrays
                dataParsed=singleParsed+dataParsed;

                dataParsed1=singleParsed1+dataParsed1;
                dataParsed2=singleParsed2+dataParsed2;*/
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (JSONException e1) {
                e1.printStackTrace();
            }
            //  name2=name;
            //    neww send=new neww();
            //  send.setneww( name);


            // log error


            return null;
        }


  //  public String[] sendname{return name;}

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute( aVoid );
//MainActivity mainActivity=new MainActivity();
//mainActivity.customm(listnew);
        //if (bmp != null)
        //MainActivity.mImageView.setImageBitmap(bmp);

       // MainActivity.txtJson.setText( "p" );


    }
}