package com.example.lebazaarv1;

import android.graphics.Bitmap;

public class arraylist {



    String name;
    //static  String[] name3;
    Bitmap image;
    String description;
    // and many more fields ...

    public arraylist() {  // constructor

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setDescription(String description) {
        this.description =description;
    }

    public String getDescription() {
        return description;
    }

}
