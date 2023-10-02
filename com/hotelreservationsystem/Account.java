package com.hotelreservationsystem;

import java.util.Scanner;


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
        System.out.println("Enter user email address: ");
        email = sc.nextLine();
        System.out.println("Enter phone number: ");
        phone = sc.nextLine();
        System.out.println("Enter location: ");
        location = sc.nextLine();
    }
    public void WriteToFile(String filename)
    {
       /* JSONObject jsonObject = new JSONObject();
        //Inserting key-value pairs into the json object
        jsonObject.put("ID", "1");
        jsonObject.put("First_Name", "Shikhar");
        jsonObject.put("Last_Name", "Dhawan");
        jsonObject.put("Date_Of_Birth", "1981-12-05");
        jsonObject.put("Place_Of_Birth", "Delhi");
        jsonObject.put("Country", "India");
        try {
            FileWriter file = new FileWriter("E:/output.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(relativePath));
        writer.write("Email: " + account.getEmail()+"\n");
        writer.write("Phone: " + account.getPhone()+"\n");
        writer.write("Location: "+ account.getLocation()+"\n");

        writer.close();*/
    }

}
