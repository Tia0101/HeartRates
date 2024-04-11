package heart;
import java.util.Calendar;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int currentYear;

    public HeartRates (String firstName,String lastName,int birthYear,int currentYear) {
        if (birthYear <= 1900 || birthYear > getCurrentYear()) {
            throw new IllegalArgumentException("Invalid birth year");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.currentYear = currentYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        Calendar thisYear = Calendar.getInstance();
        this.currentYear = thisYear.get(Calendar.YEAR);
        this.currentYear = currentYear;
    }
}


