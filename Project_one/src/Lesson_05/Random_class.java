package Lesson_05;

import java.util.Random;

public class Random_class {
    public static void main(String[] args) {

        Random random = new Random();
        int  randomN = random.nextInt(100);
        System.out.println("Random number " + randomN);

        double randomN_double = random.nextDouble();
        System.out.println("Random double " + randomN_double);

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {  // itar
            array[i] = random.nextInt();

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }
}
