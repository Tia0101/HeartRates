package heart;
import java.util.Calendar;

public class HeartRateCalc {
    private int birthYear;
    
    public HeartRateCalc(int birthYear) {
      this.birthYear = birthYear;
    
    }

    public int getAge() {
      Calendar thisYear = Calendar.getInstance();
      int currentYear = thisYear.get(Calendar.YEAR);
      return currentYear - birthYear;
  }

  public int maxHeartRate() {
      return 220 - getAge();
  }

  public int getMinTarget() {
      return (int)(maxHeartRate() * 0.5);
  }

  public int getMaxTarget() {
      return (int)(maxHeartRate() * 0.85);
  }
}