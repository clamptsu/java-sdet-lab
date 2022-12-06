package Lab.Lab02;
/*
    Check user input is even or odd
 */
import java.util.Scanner;

public class Lab02_2 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int num = scanner.nextInt();
        String s = num%2 == 0? "even":"odd";
        System.out.printf("Your integer is: %s number",s );
    }
}
