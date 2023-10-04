package com.hotelrservation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Reservation {
    public void doReservation() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have account number? (y - yes / n - no):  ");
        String have = sc.nextLine();
        if (have.equalsIgnoreCase("y"))
        {
            System.out.println("Enter account number: ");
            String user_account = sc.nextLine();


            System.out.println("Choose your preference: ");
            System.out.println("1. Hotel\n2.Villa\n3. Apartment");
            int preference = sc.nextInt();
            System.out.println("How many members? ");
            int members = sc.nextInt();
            System.out.println("Enter number of days: ");
            int days = sc.nextInt();
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter preference for food (veg/non-veg): ");
            String food = sc1.nextLine();
            System.out.println("Any special arrangements: ");
            String arrangements = sc1.nextLine();
            String relativePath = user_account+"/rs_"+user_account+".json";
            File file = new File(relativePath);
            if(file.createNewFile()){
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("Preference:", preference);
                jsonObject.put("Members:", members);
                jsonObject.put("Days:", days);
                jsonObject.put("Food:", food);
                jsonObject.put("Special Arrangements:", arrangements);

                try {
                    FileWriter file1 = new FileWriter(relativePath);
                    file1.write(jsonObject.toString());
                    file1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                JSONParser parser = new JSONParser();
                try {
                    Object obj = parser.parse(new FileReader(user_account+"/acc_"+user_account+".json"));
                    JSONObject jo = (JSONObject) obj;
                    JSONArray reservations = (JSONArray) jo.get("Reservations");
                    List<String> res= new ArrayList<String>();
                    Iterator it;
                    it = reservations.iterator();

                    while (it.hasNext()) {
                        String r = (String)it.next();
                        res.add(r);
                    }
                    res.add(user_account);
                    String Email =  (String)jo.get("Email");
                    String Phone =  (String)jo.get("Phone");
                    String Location =  (String)jo.get("Location");
                    Account ac = new Account(Email, Phone, Location, res);
                    String path = user_account+"/acc_"+user_account+".json";
                    ac.WriteToFile(path);


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else System.out.println("Error in creating file");


        }
        else {
            System.out.println("Please create an account first.");
        }
    }
}
