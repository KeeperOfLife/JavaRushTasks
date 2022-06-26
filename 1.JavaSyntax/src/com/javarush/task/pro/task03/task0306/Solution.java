package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();
        boolean isTrue = (a < (b + c) && b < (a + c) && c < (a + b));
        boolean isFalse = (a >= (b + c) || b >= (a + c) || c >= (a + b));
        if (isTrue) {
            System.out.println(TRIANGLE_EXISTS);
        } else if (isFalse) {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }


    }
}

