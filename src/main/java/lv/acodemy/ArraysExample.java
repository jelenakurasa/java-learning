package lv.acodemy;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        int[] numbers;
        String[] names;

        numbers = new int[5];
        names = new String[3];

        int[] numberz = {1, 2, 3, 4, 5};
        String[] namez = {"John", "Alex", "Mary", "Bob"};

        System.out.println(namez[2]);
        namez[2] = "Jerry";
        System.out.println(Arrays.toString(namez));



        String myName = "John";
        System.out.println(myName.charAt(0));
    }
}
