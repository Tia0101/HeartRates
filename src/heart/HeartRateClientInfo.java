package heart;
import java.util.Calendar;

public class HeartRateClientInfo {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int currentYear;

    public HeartRateClientInfo (String firstName,String lastName,int birthYear,int currentYear) {
        if (birthYear <= 1900 || birthYear > currentYear()) {
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

    public int currentYear() {
        Calendar thisYear = Calendar.getInstance();
        this.currentYear = thisYear.get(Calendar.YEAR);
        return currentYear;
    }
}
