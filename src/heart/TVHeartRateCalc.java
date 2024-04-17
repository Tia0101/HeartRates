// Assignment: Lab 3 HeartRates
// Purpose: Test app for heart rate classes
// Citation: This program references chapter 8 and 9 of the Deitel/Deitel-11th edition(Late Objects), w3schools.com,and youtube were use to find the information to write
// this program

//Extra credit:This was an extra class created to do the calculation for the heart rate application. See line 7 I made this class a package.
package heart;
import java.util.Calendar;

public class TVHeartRateCalc {
  private int birthYear;
  //constructor for HeartRateCalc class.
  public TVHeartRateCalc(int birthYear) {
    this.birthYear = birthYear;
  
  }
  //Method to calculate the the age of the client.
  public int getAge() {
    Calendar thisYear = Calendar.getInstance();
    int currentYear = thisYear.get(Calendar.YEAR);
    return currentYear - birthYear;
}
  //Method to calculate clients maximum heart rate.
  public int getMaxHeartRate() {
      return 220 - getAge();
  }
  //Method to calculate clients target maximum heart rate.
  public int getMinTarget() {
      return (int)(getMaxHeartRate() * 0.5);
  }
  //Method to calculate clients minimum target heart rate.
  public int getMaxTarget() {
      return (int)(getMaxHeartRate() * 0.85);
  }
}