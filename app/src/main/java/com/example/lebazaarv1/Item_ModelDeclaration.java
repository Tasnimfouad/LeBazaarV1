package com.example.lebazaarv1;

import java.util.ArrayList;
import java.util.UUID;

public class Item_ModelDeclaration {


        private UUID ItemID;
        private String Name;
        private double Price;
        private String Description;
    private UUID ShopID;
    private UUID CategoryID;
    private int SortingOrder;
    private ArrayList<String> Images;
    private ArrayList<String> Sizes;
    private ArrayList<String> Colours;

    public Item_ModelDeclaration(UUID itemID, String name, double price, String description, UUID shopID, UUID categoryID, int sortingOrder, ArrayList <String> images, ArrayList <String> sizes, ArrayList <String> colours) {
        ItemID = itemID;
        Name = name;
        Price = price;
        Description = description;
        ShopID = shopID;
        CategoryID = categoryID;
        SortingOrder = sortingOrder;
        Images = images;
        Sizes = sizes;
        Colours = colours;
    }

    public UUID getItemID() {
        return ItemID;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }

    public String getDescription() {
        return Description;
    }

    public UUID getShopID() {
        return ShopID;
    }

    public UUID getCategoryID() {
        return CategoryID;
    }

    public int getSortingOrder() {
        return SortingOrder;
    }

    public ArrayList <String> getImages() {
        return Images;
    }

    public ArrayList <String> getSizes() {
        return Sizes;
    }

    public ArrayList <String> getColours() {
        return Colours;
    }
}
