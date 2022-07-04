package Lesson_05.ClassTasks;

import java.util.Random;

public class MaxGrade {
    public static void main(String[] args) {

        int[] arrayint = new int[5];
        Random random = new Random();

        for (int i = 0; i < arrayint.length; i++) {
            arrayint[i] = random.nextInt(6);
        }


                String[] arrayname = new String[5];
                arrayname[0] = "Ivanoff";
                arrayname[1] = "Petroff";
                arrayname[2] = "Sidoroff";
                arrayname[3] = "Golovach";
                arrayname[4] = "Smirnoff";

                for (int i1 = 0; i1 < 5; i1++) {
                    System.out.println(arrayname[i1] + "  " + arrayint[i1]);
                }

                for (int i2 = 0; i2 < 5; i2++) {
                    if (arrayint[i2] == 5) {
                        System.out.println(arrayname[i2] +  "   Большой молодец");
                    }
                }

        }
    }


