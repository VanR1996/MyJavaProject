import java.util.Scanner;

/**
 * Created by lanouhn on 17/7/21.
 */
public class Continue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("sum = ");
        int sum = in.nextInt();
        System.out.println("goal = ");
        int goal = in.nextInt();
        while(sum < goal)
        {
            System.out.println("Enter a number: ");
            int n = in.nextInt();
            if(n < 0) continue;
            sum += n; //not executed if n < 0
        }
        System.out.printf("sum = %d",sum);
    }
}
