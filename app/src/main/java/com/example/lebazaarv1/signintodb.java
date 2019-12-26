package com.example.lebazaarv1;

import com.google.gson.annotations.SerializedName;

import java.util.UUID;

public class signintodb {

    @SerializedName("UserName")
    public String UserName;
    @SerializedName("Password")
    public String Password;

    public signintodb(String userName, String password) {

        UserName = userName;
        Password = password;

    }




    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

}

/*
class RandomStringUUID {
    public RandomStringUUID() {
    }

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        //System.out.println("UUID=" + uuid.toString() );
    } */
