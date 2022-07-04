package Lesson_04;

import java.util.Scanner;

public class Homework_interval {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число от 1 до 100");
        int n = scanner.nextInt();


        if (n >= 0 && n <= 14)
        {
            System.out.println(n + " попадает в интервал 0 - 14 ");
        }
        else if(n > 14 && n <= 35)
            {
                System.out.println(n + " попадает в интервал 15 - 35 ");
            }
        else if(n > 35 && n <= 50)
            {
                System.out.println(n + " попадает в интервал 36 - 50 ");
            }
        else if(n > 50 && n <= 100)
            {
                System.out.println(n + " попадает в интервал 50 - 100 ");
            }
        else
            {
                System.out.println(" Число не попадает ни в один из заданных интервалов");
            }
        }
    }

