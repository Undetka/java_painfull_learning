package Lesson_04;

import java.util.Scanner;

public class Homework_loginpass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.next();

        System.out.println("Введите пароль");
        String pass = scanner.next();

        String loginET = "Undetka";
        String passET = "qwerty1";

        if (login.equals(loginET) && pass.equals(passET)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Incorrect login information");
        }

    }
}