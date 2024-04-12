import java.util.Scanner;

import heart.HeartRateCalc;
import heart.HeartRateClientInfo;

public class HeartRateTestApp {
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
        
        do{
            System.out.println("Please enter your birth date in dd/mm/yyyy format:");
            date = input.next();
            if (date.length() != 10 || date.charAt(2) != '/' || date.charAt(5) != '/') {
                System.out.printf("%n%s%n%n","Please enter valid format(Example: 09/09/1999)");
            } else {
                validated = true;
            }
        } while (!validated);

        clientBirthYear = Integer.parseInt(date.substring(6,10));
        
        if (clientBirthYear < 1900) {
            System.out.println("Please enter the year you were born (example 1985)");
            clientBirthYear = input.nextInt();
        }

        HeartRateClientInfo client = new HeartRateClientInfo(clientFristName,clientLastName,clientBirthYear,0000);
        HeartRateCalc clientCalc = new HeartRateCalc(clientBirthYear);
        
        System.out.printf("%n%s%s%n","Client's first name is: ", client.getFirstName());
        System.out.printf("%n%s%s%n","Client's last name is: ", client.getLastName());
        System.out.printf("%n%s%s%n","Client's age is: ", clientCalc.getAge());
        System.out.printf("%n%s%s%s%n","Your client's heart rate should not exceed ", clientCalc.maxHeartRate(), " BPM!");
        System.out.printf("%n%s%n","Your client's target heart range is:");
        System.out.println("Minimum: " + clientCalc.getMinTarget());
        System.out.println("Maximum: " + clientCalc.getMaxTarget());
    }
}