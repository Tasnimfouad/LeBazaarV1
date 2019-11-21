package com.example.lebazaarv1;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.UUID;

public class SignupResponse {

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
    public String  LastLoginDate;
    @SerializedName("PasswordKey")
    public String PasswordKey;
    @SerializedName("SellerRequestID")
    public String SellerRequestID;
    @SerializedName("ResponseCode")
    public String ResponseCode;
    @SerializedName("ResponseMessage")
    public String ResponseMessage;

    public SignupResponse(UUID userID, String firstName, String middleName, String lastName, String mobile, String email, String nationality, String additionalPhone, String userName, String password, boolean isSeller, boolean isAdmin, int failedLoginCount, boolean active, String lastLoginDate, String passwordKey, String sellerRequestID) {
        UserID = userID;
        FirstName = firstName;
        MiddleName = middleName;
        LastName = lastName;
        Mobile = mobile;
        Email = email;
        Nationality = nationality;
        AdditionalPhone = additionalPhone;
        UserName = userName;
        Password = password;
        IsSeller = isSeller;
        IsAdmin = isAdmin;
        FailedLoginCount = failedLoginCount;
        Active = active;
        LastLoginDate = lastLoginDate;
        PasswordKey = passwordKey;
        SellerRequestID = sellerRequestID;
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
