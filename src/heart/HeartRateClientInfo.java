// Name: Tia Vanderyacht
//Date: 04/15/2024
// Class: CS 145 9:30am face to face
// Assignment: Lab 3 HeartRates
// Purpose: Class for Heart rate user info
// Citation: This program references chapter 8 and 9 of the Deitel/Deitel-11th edition(Late Objects), w3schools.com,and youtube were use to find the information to write
// this program

//Extra credit: See line 11 I made this class a package. See line 22 created a throw exception for the birth year validation(not sure if the throw was actually extra credit)

package heart;
import java.util.Calendar;

public class HeartRateClientInfo {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int currentYear;
    // Constructor for HeartRateClientInfo class.
    public HeartRateClientInfo (String firstName,String lastName,int birthYear,int currentYear) {
        if (birthYear <= 1900 || birthYear > currentYear()) {
            throw new IllegalArgumentException("Invalid birth year");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.currentYear = currentYear;
    }
    //mutator method for first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //accessor method for first name
    public String getFirstName() {
        return firstName;
    }
    //mutator method for first name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //accessor method for last name
    public String getLastName() {
        return lastName;
    }
    //mutator method for birth year name
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    //accessor method for birthyear
    public int getBirthYear() {
        return birthYear;
    }
    // I made method for current year instead of making an accessor and mutator method,
    // because I thought that a program wouldn't ask the user what the current year was.
    //The user would expect the computer to know.
    public int currentYear() {
        Calendar thisYear = Calendar.getInstance();
        this.currentYear = thisYear.get(Calendar.YEAR);
        return currentYear;
    }
}
