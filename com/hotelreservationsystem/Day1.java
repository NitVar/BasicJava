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
                    Account account = new Account();
                    account.getData();


                    long acc = (long) Math.floor(Math.random() * 9000_000_000L) + 1_000_000_000L;
                    String acc_num = acc + "";
                    File f = new File(acc_num);

                    if (f.mkdir()) {
                        String relativePath = acc_num+"/acc_"+acc_num+".txt";
                        File file = new File(relativePath);
                        if(file.createNewFile()){
                            account.WriteToFile(relativePath);

                        }else System.out.println("Error in creating file");
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
