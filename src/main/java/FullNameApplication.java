package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fullName;
        System.out.println("Please enter your name");

        System.out.print("First Name: ");
        String firstName = scan.nextLine();

        System.out.print("Middle Name: ");
        String middleName = scan.nextLine();

        System.out.print("Last Name: ");
        String lastName = scan.nextLine();

        System.out.print("Suffix: ");
        String suffix = scan.nextLine();

        if(middleName.isBlank() && suffix.isBlank()){
            fullName = firstName.trim() + " " + lastName.trim();
        } else if(middleName.isBlank() && (!suffix.isBlank())){
            fullName = firstName.trim() + " " + lastName.trim() + ", " + suffix.toUpperCase().trim();
        } else if((!middleName.isBlank() && suffix.isBlank())){
            fullName = firstName.trim() + " " + middleName.substring(0, 1).toUpperCase().trim() + ". " + lastName.trim();
        } else {
            fullName = firstName.trim() + " " + middleName.substring(0, 1).toUpperCase().trim() + ". " + lastName.trim() + ", " + suffix.toUpperCase().trim();
        }

        System.out.println("Your full name is: " + fullName);
        scan.close();
    }
}