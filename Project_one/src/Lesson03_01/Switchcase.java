package Lesson03_01;

import java.util.Scanner;

public class Switchcase  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1 - 3: ");

        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            default:
                System.out.println("Eat my number");
                break;
        }

        scanner.close();
    }
}
