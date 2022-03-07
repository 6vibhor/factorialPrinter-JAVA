import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = scan.nextInt();
        factorialNumber(number);
    }

    public static void factorialNumber(int number) {
        int product = 1;
        System.out.println("The factorial of " + number + " = ");
        for(int i = number; i >= 1; i--) {
            product *= i;
            if(i == 1) {
                System.out.print(i + "!");
            } else{
                System.out.print(i + "! * ");
            }
        }
        System.out.print(" = " + product);
    }
}
