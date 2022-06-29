package Hometask;

import java.util.Arrays;

public class Hometask_01 {
    public static void main(String[] args) {


        int i1 = 5;
        int i2 = 11;

        double d1 = 5.5;
        double d2 = 1.3;

        long l = 20L;

        double result;

        int a = 5;
        int b = 8;
        int x = 10;
        int y = 12;
        int z = 3;

        double r1;
        double r2;
        double r3;

        r1 = a-- - --a + ++a + a++ + a;
        r2 = ( i2 / d1 ) + ( d2 % i1 ) - l;
        r3 = ++b - b++ + ++b - --b;
        System.out.println("( i2 / d1 ) + ( d2 % i1 ) - l = " + r2);
        System.out.println("a-- - --a + ++a + a++ + a = " + r1);
        System.out.println("++b - b++ + ++b - --b = " + r3);
        System.out.println(x += y - x++ * z);
        System.out.println(z = --x - y * 5);

        System.out.println(y /= x + 5 % z);
        System.out.println(z = x++ + y * 5);
        System.out.println(x = y - x++ * z);
    }
}
