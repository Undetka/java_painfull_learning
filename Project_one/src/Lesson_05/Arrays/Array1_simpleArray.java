package Lesson_05.Arrays;

public class Array1_simpleArray {
    public static void main(String[] args) {



        int number = 5;


        int[] array1 = new int[5];
        array1[0] = 5;
        array1[1] = 10;

        System.out.println("array1.length = " + array1.length); // array.length.soutv
        System.out.println(array1.length);

        for (int i = 0; i < array1.length; i++) {

            System.out.println(array1[i]);
            int i1 = array1[i];

        }


    }
}
