package com.example.lebazaarv1;


import android.app.Application;
import io.realm.Realm;
import io.realm.RealmConfiguration;

public class TaskListApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder().schemaVersion(2) // Must be bumped when the schema changes
                .migration(new MyMigration()).deleteRealmIfMigrationNeeded()// Migration to run
                .build();
Realm.deleteRealm( config );
       // Realm.deleteRealm( config );
     //   Realm.removeDefaultConfiguration();
        Realm.setDefaultConfiguration(config);

// This will automatically trigger the migration if needed
        //Realm realm = Realm.getDefaultInstance();
      /*  RealmConfiguration config = new RealmConfiguration.Builder()
                .name("myrealm.realm")
                .encryptionKey(getKey())
                .schemaVersion(42)
                .modules(new MySchemaModule())
                .migration(new MyMigration())
                .build()
 RealmConfiguration config = new RealmConfiguration
                .Builder().name( "elkhan.realm" )
                .deleteRealmIfMigrationNeeded()
                .build();
 Realm.setDefaultConfiguration(config);*/


    }
}
