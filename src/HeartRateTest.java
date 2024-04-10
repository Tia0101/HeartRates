import java.util.Scanner;

public class HeartRateTest {
    public static void main (String [] args ) {
        Scanner input = new Scanner(System.in);
        HeartRates client = new HeartRates("","",0000);

        System.out.println("Please Enter your first name:");
        String clientFristName = input.next();
        client.setFirstName(clientFristName);
        System.out.println();

        System.out.println("Please Enter your last name:");
        String clientLastName = input.next();
        client.setLastName(clientLastName);
        System.out.println();

       /*  System.out.println("Please Enter your birthday in yyyy format:");
        int clientBirthYear = input.nextInt();
        client.setBirthYear(clientBirthYear);
        System.out.println();*/

        System.out.printf("%n%s%s%n","Client's first name is: ", client.getFirstName());
        System.out.printf("%n%s%s%n","Client's last name is: ", client.getLastName());

        System.out.println("Testing for github");


    }



}
