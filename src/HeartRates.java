import java.util.Calendar;
public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int currentYear;

    public HeartRates (String firstname,String lastName,int birthYear,int currentYear) {
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

    /*public int currentYear(){
        Calendar thisYear = Calendar.getInstance();
        this.currentYear = thisYear.get(Calendar.YEAR);
        return currentYear;
    }*/

    public int age() {
        Calendar thisYear = Calendar.getInstance();
        this.currentYear = thisYear.get(Calendar.YEAR);

        int age = currentYear - birthYear;
        return age;
    }

    public int maxHeartRate() {
    int maxHeartRate =  220 - age();
    return maxHeartRate;
    }

    public int minTarget() {
        int minTarget = (int)(maxHeartRate() * 0.5);
        return minTarget;
    }

    public int maxTarget() {
        int maxTarget = (int)(maxHeartRate() * 0.85);
        return maxTarget;
    }
}

    

