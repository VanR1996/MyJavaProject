import java.util.Scanner;

/**
 * Created by lanouhn on 17/7/20.
 */
public class Retirement {
    public static void main(String[] args) {
        //read input
        Scanner in = new Scanner(System.in);

        /*System.out.println("How much money do you need to retire?");
        double goal = in.nextDouble();*/

        System.out.println("How much money will you contribute every year? ");
        double payment = in.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;

        String input;

        //update account balance while goal isn't reached
        /*while (balance <goal)
        {
            // add this year's payment and interest
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }

        System.out.println("You can retire in " + years + " years");*/
        do {
            balance += payment;
            double interest = balance * interestRate /100;
            balance += interest;

            year++;

            System.out.printf("After year %d, your balance is %,.2f%n",year,balance);

            System.out.println("Ready to retire?(Y/N)");
            input = in.next();
        }while(input.equalsIgnoreCase("N"));
    }
}
