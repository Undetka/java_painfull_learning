package Lesson_04;

public class Homework_srednearifmeticheskoe {
    public static void main(String[] args) {


        double a = 0;
        for (int n = 0; n <= 100; n++) {

            a = a + n;


            if (n == 100) {

                System.out.println( " Среднеарифметическое = " + a / n );
            }
        }


    }
}
