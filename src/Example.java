import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.*;

import static java.lang.Math.*;
/**
 * Created by lanouhn on 17/7/19.
 */
public class Example {
    public static void main(String[] args) throws IOException {
        /*int age = 13;
        String rating = "PG" + age;
        String greeting = "Hello";
        String s = greeting.substring(0,3);
        double n = 9.997;
        int fourthBitFromRight = (int) round(n);
        System.out.println(fourthBitFromRight);
        System.out.println(rating);
        System.out.println(s);
        String greeting = "hello ";
        int cpCount = greeting.codePointCount(0,greeting.length());
        char first = greeting.charAt(0);
        char last = greeting.charAt(4);
        int index = greeting.offsetByCodePoints(0,2);
        int cp = greeting.codePointAt(index);
        int example1 = greeting.indexOf("hel");*/

        //构建一个空的字符串构建器
        StringBuilder builder = new StringBuilder();
        String ch = "Hello ";
        String str = "Java";
        //当每次需要添加一部分内容就调用append方法
        /*builder.append(ch);
        builder.append(str);
        String completedString = builder.toString();
        int n = completedString.length();
        System.out.println(n);
        System.out.println(builder);
        System.out.println(completedString);*/

        /*String lowercase = greeting.toLowerCase();
        String uppercase = greeting.toUpperCase();
        String trim = greeting.trim();
        System.out.println(trim);
        System.out.println(lowercase);
        System.out.println(uppercase);
        System.out.println(example1);
        System.out.println(index +"  "+ cp);
        System.out.println(first+"  " + last);
        System.out.println(cpCount);*/

        /*Scanner in = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = in.nextLine();
        System.out.println("hello" + name);*/

        /*double x = 100000.0 / 3.0;
        System.out.printf("%,.2f",x);
        System.out.printf("%tc",new Date());*/
        /*String name = new String();
        name = "Rex";
        int age = 16;
        String message = String.format("Hello, %s. Next year, you'll be %d",name,age);
        System.out.println(message);*/
        //System.out.printf("%1$s %2$tB %2$te,%2$tY","Due date",new Date());
        //System.out.printf("%.2s",100000000.0/3.0);
        //Scanner in = new Scanner(Paths.get("Users/lanouhn/Desktop/myfile.rtf"));
        //PrintWriter out = new PrintWriter("myfile.txt");

        int[] smallPrimes = {2,3,5,7,11,13};
        smallPrimes = new int[]{17,19,23,29,31,37};

        int[] luckyNumbers = smallPrimes;
        luckyNumbers[5] = 12;

        int[] copiedLuckyNumber = Arrays.copyOf(luckyNumbers,luckyNumbers.length);
        luckyNumbers = Arrays.copyOf(luckyNumbers,2 * luckyNumbers.length);

    }
}
