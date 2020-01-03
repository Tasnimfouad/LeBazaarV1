package com.example.lebazaarv1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.UUID;

public class signinresponse {

    @SerializedName("UserID")
    @Expose
    public UUID UserID;
    @SerializedName("FirstName")
    @Expose
    public String FirstName;
    @SerializedName("MiddleName")
    @Expose
    public String MiddleName;
    @SerializedName("LastName")
    @Expose
    public String LastName;
    @SerializedName("Mobile")
    @Expose
    public String Mobile;
    @SerializedName("Email")
    @Expose
    public String Email;
    @SerializedName("Nationality")
    @Expose
    public String Nationality;
    @SerializedName("AdditionalPhone")
    @Expose
    public String AdditionalPhone;
    @SerializedName("UserName")
    @Expose
    public String UserName;
    @SerializedName("Password")
    @Expose
    public String Password;
    @SerializedName("IsSeller")
    @Expose
    public boolean IsSeller;
    @SerializedName("IsAdmin")
    @Expose
    public boolean IsAdmin;
    @SerializedName("FailedLoginCount")
    @Expose
    public int FailedLoginCount;
    @SerializedName("Active")
    @Expose
    public boolean Active;
    @SerializedName("LastLoginDate")
    @Expose
    public String LastLoginDate;
    @SerializedName("PasswordKey")
    @Expose
    public String PasswordKey;
    @SerializedName("SellerRequestID")
    @Expose
    public String SellerRequestID;
    @SerializedName("Address")
    @Expose
    public String Address;
    @SerializedName("City")
    @Expose
    public String City;
    @SerializedName("Street")
    @Expose
    public String Street;
    @SerializedName("ResponseCode")
    @Expose
    public String ResponseCode;
    @SerializedName("ResponseMessage")
    @Expose
    public String ResponseMessage;

   // public signinresponse( String userName, String password) {
   public signinresponse( ) {
      //  UserName = userName;
      //  Password = password;


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
