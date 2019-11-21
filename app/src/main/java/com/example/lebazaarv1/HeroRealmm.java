package com.example.lebazaarv1;




import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


public class HeroRealmm extends RealmObject  {

    private String CategoryID;
    private String Name;
    private String ImagePath;
    private String Description;
    @PrimaryKey
    private long id;

// constructor and getters


    public HeroRealmm() {
    }

    public long getID(){return id;}
    public void setID(long id){this.id=id;}

    public String getCategoryID() {
        return CategoryID;
    }
    public void setCategoryID(String categoryID) {
        CategoryID = categoryID;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImagePath() {
        return ImagePath;
    }
    public void setImagePath(String imagePath) {
        ImagePath = imagePath;
    }
    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }



}

/*

public class Hero {

    private String name;
    private String realname;
    private String team;
    private String firstappearance;
    private String createdby;
    private String publisher;
    private String imageurl;
    private String bio;


    public Hero(String name, String realname, String team, String firstappearance, String createdby, String publisher, String imageurl, String bio) {
        this.name = name;
        this.realname = realname;
        this.team = team;
        this.firstappearance = firstappearance;
        this.createdby = createdby;
        this.publisher = publisher;
        this.imageurl = imageurl;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }

    public String getTeam() {
        return team;
    }

    public String getFirstappearance() {
        return firstappearance;
    }

    public String getCreatedby() {
        return createdby;
    }
    public String getPublisher() {
        return publisher;
    }

    public String getImageurl() {
        return imageurl;
    }

    public String getBio() {
        return bio;
    }
}
*/
//import io.realm.RealmObject;


/*
public class Hero extends RealmObject {
    private ArrayList <items1> Items;
    private String CategoryID;
    private String Name;
    private String ImagePath;
    private String Description;
    private Boolean Active;
    private String CreatedOn;
    private String CreatedBy;
    private String ModifiedOn;
    private String ModifiedBy;
// constructor and getters


    public Hero(ArrayList <items1> items, String categoryID, String name, String imagePath, String description, Boolean active, String createdOn, String createdBy, String modifiedOn, String modifiedBy) {
        Items = items;
        CategoryID = categoryID;
        Name = name;
        ImagePath = imagePath;
        Description = description;
        Active = active;
        CreatedOn = createdOn;
        CreatedBy = createdBy;
        ModifiedOn = modifiedOn;
        ModifiedBy = modifiedBy;
    }

    public ArrayList <items1> getItems() {
        return Items;
    }

    public String getCategoryID() {
        return CategoryID;
    }

    public String getName() {
        return Name;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public String getDescription() {
        return Description;
    }

    public Boolean getActive() {
        return Active;
    }

    public String getCreatedOn() {
        return CreatedOn;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public String getModifiedOn() {
        return ModifiedOn;
    }

    public String getModifiedBy() {
        return ModifiedBy;
    }
}

class items1 {
    private ArrayList <itemsColors1> ItemColors;
    private ArrayList <itemsImages1> ItemImages;
    private ArrayList <itemsSizes1> ItemSizes;

    public ArrayList <itemsColors1> getItemColors() {
        return ItemColors;
    }

    public ArrayList <itemsImages1> getItemImages() {
        return ItemImages;
    }

    public ArrayList <itemsSizes1> getItemSizes() {
        return ItemSizes;
    }

// Getters setters
}
class itemsColors1 {
    private String ItemColorID;
    private String ItemID;
    private String Color;

    public String getItemColorID() {
        return ItemColorID;
    }

    public String getItemID() {
        return ItemID;
    }

    public String getColor() {
        return Color;
    }
// Getters setters
}
class itemsImages1 {
    private String ItemImageID;
    private String ItemID;
    private String Image;

    public String getItemImageID() {
        return ItemImageID;
    }

    public String getItemID() {
        return ItemID;
    }

    public String getImage() {
        return Image;
    }
    // Getters setters
}class itemsSizes1 {
    private String ItemSizeID;
    private String ItemID;
    private String Size;

    public String getItemSizeID() {
        return ItemSizeID;
    }

    public String getItemID() {
        return ItemID;
    }

    public String getSize() {
        return Size;
    }
// Getters setters
} */

