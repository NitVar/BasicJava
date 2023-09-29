package com.hotelreservationsystem;

import java.util.Scanner;
import java.io.*;
public class Day1 {
    public static int displayMenu()
    {
        String choice;
        do{
            System.out.println("***********************************");
            System.out.println("Welcome to Hotel Reservation System");
            System.out.println("***********************************");
            System.out.println("1: create an account");
            System.out.println("2.: start your reservation");
            System.out.println("3: cancel your reservation");
            System.out.println("4: display all my reservations");
            System.out.println("5: please print my total bill");
            System.out.println("0. Exit");
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your option: ");
            choice = sc.nextLine();
        }
        while (!(choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") || choice.equals("5") || choice.equals("0") ));
        return Integer.parseInt(choice);

    }

    public static void main(String[] args) throws IOException{
        int ch = displayMenu();
        while (ch != 0) {
            switch (ch) {
                case 1: {
                    String email, phone, location;
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter user email address: ");
                    email = sc.nextLine();
                    System.out.println("Enter phone number: ");
                    phone = sc.nextLine();
                    System.out.println("Enter location: ");
                    location = sc.nextLine();

                    long acc = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
                    String acc_num = acc + "";
                    File f = new File(acc_num);

                    if (f.mkdir()) {
                        System.out.println("Folder has been created successfully");
                        String relativePath = acc_num+"/"+acc_num+".txt";
                        File file = new File(relativePath);
                        if(file.createNewFile()){
                            System.out.println(relativePath+" File Created in Project root directory");
                            BufferedWriter writer = new BufferedWriter(new FileWriter(relativePath));
                            writer.write("Email: " + email+"\n");
                            writer.write("Phone: " + phone+"\n");
                            writer.write("Location: "+ location+"\n");

                            writer.close();
                        }else System.out.println("File "+relativePath+" already exists in the project root directory");
                    }
                    else {
                        System.out.println("Folder cannot be created");
                    }

                }
                break;

                case 2:
                    System.out.println("Option 2");
                    break;
                case 3:
                    System.out.println("Option 3");
                    break;
                case 4:
                    System.out.println("Option 4");
                    break;
                case 5:
                    System.out.println("Option 5");
            }
            ch = displayMenu();
        }
    }
}
