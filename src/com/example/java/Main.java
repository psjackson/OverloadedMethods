package com.example.java;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //a variable to hold the selection from the user
        int option;
        //do-while loop to only allow user to enter 1 or 2 to show if they are a business or residential customer
        do {
            System.out.println("-----------------------------------");
            System.out.println("Please select the type of customer:");
            System.out.println("-----------------------------------");
            System.out.println("1: Business Customer.");
            System.out.println("2: Residential Customer.");
            //get menu option from the user
            option = input.nextInt();
        }while(option != 1 && option != 2);
        //an if statement to get details if they are a business customer
        if (option == 1){
            //use the scanner to get the business name
            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter the name of your business: ");
            String businessName = input1.nextLine();
            //use the scanner to get the contact name
            System.out.println("Enter the contact name for your business: ");
            String name = input1.nextLine();
            //use the scanner to get the business phone number
            System.out.println("Enter the phone number of your business: ");
            String phone = input1.nextLine();
            //call contactDetails method and pass the 3 string variables
            contactDetails(businessName, name, phone);
        }
        //else statement to get details if they are a residential customer
        else{
            //use the scanner to get the name
            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = input1.nextLine();
            //use the scanner to get the phone number
            System.out.println("Enter your phone number: ");
            String phone = input1.nextLine();
            //call contactDetails method and pass the 2 string variables
            contactDetails(name, phone);
        }
    }

    //contactDetails method that accepts 2 Strings
    private static void contactDetails(String name, String phone){
        //display the name and phone number
        System.out.println("\n\n--------------------------------------");
        System.out.println("Your residential contacts details are:");
        System.out.println("--------------------------------------");
        System.out.println("Name:\t" + name);
        System.out.println("Phone Number:\t" + phone);
    }

    //contactDetails method that accepts 3 Strings
    private static void contactDetails(String businessName, String name, String phone){
        //display the business name, contact name and business phone number
        System.out.println("\n\n-----------------------------------");
        System.out.println("Your business contacts details are:");
        System.out.println("-----------------------------------");
        System.out.println("Business Name:\t" + businessName);
        System.out.println("Contact Name:\t" + name);
        System.out.println("Phone Number:\t" + phone);
    }
}