package com.javarush.task.jdk13.task06.task0627;

import java.util.Arrays;
import java.util.Scanner;

/* 
Вот это переворот!
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[j][i] = console.nextInt();
            }
        }
        System.out.println(array[0][0] + " " + array [0][1] + " " + array[0][2]);
        System.out.println(array[1][0] + " " + array [1][1] + " " + array[1][2]);
        System.out.println(array[2][0] + " " + array [2][1] + " " + array[2][2]);
    }
}
