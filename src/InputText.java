import java.io.Console;
import java.util.*;
/**
 * Created by lanouhn on 17/7/19.
 */
public class InputText {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        //get first input
        System.out.println("What is your name?");
        String name = in.nextLine();

        String firstName = in.next();

        //get second input
        System.out.println("How old are you?");
        int age = in.nextInt();

        //display output on console
        System.out.println("Hello, "+ name +". Next year, your'll be " +(age+1));


        Console cons = System.console();
        String username = cons.readLine("User name:");
        char[] passwd = cons.readPassword("Password:");
    }
}
