// Name: Tia Vanderyacht
//Date: 04/15/2024
// Class: CS 145 9:30am face to face
// Assignment: Lab 3 HeartRates
// Purpose: Test app for heart rate classes
// Citation: This program references chapter 8 and 9 of the Deitel/Deitel-11th edition(Late Objects), w3schools.com,and youtube were use to find the information to write
// this program

//Extra credit: See lines 14 and 15,They are the imports for the packages I created for the this lab.


import java.util.Scanner;

import heart.TVHeartRateCalc;
import heart.TVHeartRateClientInfo;

public class TVHeartRateTestApp {
    public static void main (String [] args ) {
        Scanner input = new Scanner(System.in);
        String date;
        int clientBirthYear;
        boolean validated = false;

        System.out.println("Please enter client's first name:");
        String clientFristName = input.next();
        System.out.println();

        System.out.println("Please enter client's last name:");
        String clientLastName = input.next();
        System.out.println();
        
        //Do while to ensure the date format is entered correctly
        do {
            System.out.println("Please enter your birth date in mm/dd/yyyy format:");
            date = input.next();
            
            if (date.length() != 10 || date.charAt(2) != '/' || date.charAt(5) != '/') {
                System.out.printf("%n%s%n%n","Invalid format: Please use mm/dd/yyyy (Example: 09/09/1999)");
            } else {
                validated = true;
            }
        } while (!validated);

        clientBirthYear = Integer.parseInt(date.substring(6,10));
        //If statement to ensure that the year entered is a valid birth year
        if (clientBirthYear < 1900) {
            System.out.println("Please enter the year you were born (Example: 1985)");
            clientBirthYear = input.nextInt();
        }
        //Client object created from the HeartRateClientInfo class
        TVHeartRateClientInfo client = new TVHeartRateClientInfo(clientFristName,clientLastName,clientBirthYear,0000);
        //Calculation object created from clientCalc class
        TVHeartRateCalc clientCalc = new TVHeartRateCalc(clientBirthYear);
        //print outs to show data collected by each class, using accseors methods
        System.out.printf("%n%s%s%n","Client's first name is: ", client.getFirstName());
        System.out.printf("%n%s%s%n","Client's last name is: ", client.getLastName());
        System.out.printf("%n%s%s%n","Client's age is: ", clientCalc.getAge());
        System.out.printf("%n%s%s%s%n","Your client's heart rate should not exceed ", clientCalc.getMaxHeartRate(), " BPM!");
        System.out.printf("%n%s%n","Your client's target heart rate range is:");
        System.out.println("Minimum: " + clientCalc.getMinTarget());
        System.out.println("Maximum: " + clientCalc.getMaxTarget());
    }
}