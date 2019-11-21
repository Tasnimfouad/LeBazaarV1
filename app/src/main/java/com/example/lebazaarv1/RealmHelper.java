package com.example.lebazaarv1;

import io.realm.Realm;
import io.realm.RealmList;

public class RealmHelper {

    Realm realm;

    public RealmHelper(Realm realm) {
        this.realm = realm;
    }

    public void save(RealmList<HeroRealmm> herorealmlist) {
Realm.getDefaultInstance();
        try {
            realm.beginTransaction();
          //  HeroRealmm hero_realm = realm.createObject( HeroRealmm.class ,19 );

            realm.copyToRealmOrUpdate( herorealmlist);
            realm.commitTransaction();




            // body of executeTransaction
          //  realm.commitTransaction();
        } catch(Exception e) {
            if(realm.isInTransaction()) {
                realm.cancelTransaction();
           }
            throw new RuntimeException(e);
        }
       // int N=10;   // whatever value you want
        //Realm mRealm=Realm.getDefaultInstance();

       // RealmResults<Example> list= mRealm.where(Example.class).findAll();
      //  list.subList(0,N); Ascending Sorting
    }

    public void read(HeroRealmm herorealmm) {


    }


}
