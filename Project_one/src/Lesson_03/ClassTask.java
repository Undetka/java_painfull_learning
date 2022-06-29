package Lesson_03;

import java.util.Scanner;

public class ClassTask {
    public static void main(String[] args) {


        int age;
        String name;

        System.out.println("Hello World");
        //Scanner initialization
        Scanner Input = new Scanner(System.in);

        System.out.println("Whats your name");
       name = Input.nextLine();



        System.out.println("Whats your age");
        age = Input.nextInt();

        System.out.println("name = " + name);
        System.out.println("age = " + age);


    }
}
