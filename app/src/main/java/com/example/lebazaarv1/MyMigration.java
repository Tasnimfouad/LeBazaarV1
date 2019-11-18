package com.example.lebazaarv1;

import io.realm.DynamicRealm;
import io.realm.FieldAttribute;
import io.realm.RealmMigration;
import io.realm.RealmSchema;

public class MyMigration implements RealmMigration {
    @Override
    public void migrate(DynamicRealm realm, long oldVersion, long newVersion) {

        // DynamicRealm exposes an editable schema
        RealmSchema schema = realm.getSchema();

        // Migrate to version 1: Add a new class.
        // Example:
        // public Person extends RealmObject {
        //     private String name;
        //     private int age;
        //     // getters and setters left out for brevity
        // }
        if (oldVersion == 0) {
            schema.create("Hero_Realm")
                    .addField("CategoryID1", String.class)
                    .addField("Name1", String.class)
                    .addField("ImagePath1",String.class  )
                    .addField( "Description1",String.class );

            oldVersion++;
        }

        // Migrate to version 2: Add a primary key + object references
        // Example:
        // public Person extends RealmObject {
        //     private String name;
        //     @PrimaryKey
        //     private int age;
        //     private Dog favoriteDog;
        //     private RealmList<Dog> dogs;
        //     // getters and setters left out for brevity
        // }
        if (oldVersion == 1) {
            schema.create("HeroRealmm")
                    .addField("CategoryID", String.class)
                    .addField("Name", String.class)
                    .addField("ImagePath",String.class  )
                    .addField( "Description",String.class );
            oldVersion++;
        }
    }
}