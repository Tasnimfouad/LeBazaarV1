package com.example.lebazaarv1;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.UUID;

public class signinresponse {

    @SerializedName("UserID")
    public UUID UserID;
    @SerializedName("FirstName")
    public String FirstName;
    @SerializedName("MiddleName")
    public String MiddleName;
    @SerializedName("LastName")
    public String LastName;
    @SerializedName("Mobile")
    public String Mobile;
    @SerializedName("Email")
    public String Email;
    @SerializedName("Nationality")
    public String Nationality;
    @SerializedName("AdditionalPhone")
    public String AdditionalPhone;
    @SerializedName("UserName")
    public String UserName;
    @SerializedName("Password")
    public String Password;
    @SerializedName("IsSeller")
    public boolean IsSeller;
    @SerializedName("IsAdmin")
    public boolean IsAdmin;
    @SerializedName("FailedLoginCount")
    public int FailedLoginCount;
    @SerializedName("Active")
    public boolean Active;
    @SerializedName("LastLoginDate")
    public String LastLoginDate;
    @SerializedName("PasswordKey")
    public String PasswordKey;
    @SerializedName("SellerRequestID")
    public String SellerRequestID;
    @SerializedName("Address")
    public String Address;
    @SerializedName("City")
    public String City;
    @SerializedName("Street")
    public String Street;
    @SerializedName("ResponseCode")
    public String ResponseCode;
    @SerializedName("ResponseMessage")
    public String ResponseMessage;

    public signinresponse( String userName, String password) {

        UserName = userName;
        Password = password;


    }

    public UUID getUserID() {
        return UserID;
    }


    public String getFirstName() {
        return FirstName;
    }



    public String getMiddleName() {
        return MiddleName;
    }


    public String getLastName() {
        return LastName;
    }

    public String getMobile() {
        return Mobile;
    }

    public String getEmail() {
        return Email;
    }


    public String getNationality() {
        return Nationality;
    }

    public String getAdditionalPhone() {
        return AdditionalPhone;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }



    public boolean isSeller() {
        return IsSeller;
    }



    public boolean isAdmin() {
        return IsAdmin;
    }


    public int getFailedLoginCount() {
        return FailedLoginCount;
    }


    public boolean isActive() {
        return Active;
    }

    public String getLastLoginDate() {
        return LastLoginDate;
    }

    public String getPasswordKey() {
        return PasswordKey;
    }


    public String getSellerRequestID() {
        return SellerRequestID;
    }

    public String getAddress() {
        return Address;
    }



    public String getCity() {
        return City;
    }

    public String getStreet() {
        return Street;
    }


    public String getResponseCode() {
        return ResponseCode;
    }



    public String getResponseMessage() {
        return ResponseMessage;
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
