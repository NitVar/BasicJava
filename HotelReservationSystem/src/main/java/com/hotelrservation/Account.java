package com.hotelrservation;


import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.validator.routines.EmailValidator;
public class Account {
    private String email, phone, location;

    public Account() {
    }

    public Account(String email, String phone, String location) {
        this.email = email;
        this.phone = phone;
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user email: ");
        email = sc.nextLine();
       while(!EmailValidator.getInstance().isValid(email))
        {
            System.out.println("Error: Invalid email address. Enter again: ");
            email = sc.nextLine();

        }
        System.out.println("Enter phone number: ");
        phone = sc.nextLine();
        System.out.println("Enter location: ");
        location = sc.nextLine();
    }
    public void WriteToFile(String filename)
    {
       JSONObject jsonObject = new JSONObject();
        jsonObject.put("Email", getEmail());
        jsonObject.put("Phone", getPhone());
        jsonObject.put("Location", getLocation());

        try {
            FileWriter file = new FileWriter(filename);
            file.write(jsonObject.toString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
