package com.example.lebazaarv1;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmResults;
import io.realm.exceptions.RealmException;

public class RealmHelper {
Realm realm=Realm.getDefaultInstance();
    public ArrayList<HeroRealmm> latest=new ArrayList <>(  );
    public RealmHelper(Realm realm) {

       this.realm= realm;
    }

    // Realm realm;
RealmResults <HeroRealmm> heroRealmResults;
Boolean saved=null;

    //Retrieve
  /*  public void retrieveFromDB(){
  //realm=Realm.getDefaultInstance();
  realm.beginTransaction();
        heroRealmResults=Realm.getDefaultInstance().where( HeroRealmm.class ).findAll();
 realm.commitTransaction();

    }*/
//Refresh
    public ArrayList<HeroRealmm> justRefresh(){

        latest.clear();
      //  realm.deleteRealm( Realm.getDefaultConfiguration() );
        realm.beginTransaction();
      //  realm.deleteRealm( Realm.getDefaultConfiguration() );
        heroRealmResults=realm.where( HeroRealmm.class ).equalTo( "Name","Stationary" ).findAll();
    //    latest.clear();
        for(HeroRealmm saveherotoRealm:heroRealmResults){

            latest.add( saveherotoRealm );
        }

        realm.commitTransaction();
//realm.close();
        return latest;
    }

    public void storeHeroes( HeroRealmm heroRealmm) {
        // realmstore=Realm.getDefaultInstance();
        realm.beginTransaction();


        realm.copyToRealmOrUpdate( heroRealmm );
        // HeroRealmm heroRealmm1 = realm.createObject(HeroRealmm.class); // Create managed objects directly
        realm.commitTransaction();
//realmstore.close();

    }

}
