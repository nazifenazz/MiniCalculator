import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the calculator");
        System.out.println("The operation you want to perform: 1- Add, 2- Subtract, 3- Multiply, 4- Divide");

        int answer = scan.nextInt();

        switch (answer) {
            case 1:
                System.out.println("Give me two numbers:");
                int a1 = scan.nextInt();
                int b1 = scan.nextInt();
                System.out.println("Result: " + (a1 + b1));
                break;

            case 2:
                System.out.println("Give me two numbers:");
                int a2 = scan.nextInt();
                int b2 = scan.nextInt();
                System.out.println("Result: " + (a2 - b2));
                break;

            case 3:
                System.out.println("Give me two numbers:");
                int a3 = scan.nextInt();
                int b3 = scan.nextInt();
                System.out.println("Result: " + (a3 * b3));
                break;

            case 4:
                System.out.println("Give me two numbers:");
                int a4 = scan.nextInt();
                int b4 = scan.nextInt();
                if (b4 != 0) {
                    System.out.println("Result: " + ((double)a4 / b4));
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}