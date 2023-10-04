package com.hotelrservation;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.validator.routines.EmailValidator;
public class Account {
    private String email, phone, location;
    private List<String> reservations= new ArrayList<String>();

    public Account() {
    }

    public Account(String email, String phone, String location) {
        this.email = email;
        this.phone = phone;
        this.location = location;
    }
    public Account(String email, String phone, String location, List<String> reservation) {
        this.email = email;
        this.phone = phone;
        this.location = location;
        for (int i=0; i<reservation.size(); i++)
            reservations.add(reservation.get(i));
    }
    public void addReservation(String reservation)
    {
        reservations.add(reservation);
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
        JSONArray res = new JSONArray();
        for (int i=0; i< reservations.size(); i++)
        {
            //System.out.println((i+1) + " - " + reservations.get(i));
            res.put(reservations.get(i));
        }
        jsonObject.put("Reservations", res);

        try {
            FileWriter file = new FileWriter(filename);
            file.write(jsonObject.toString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
