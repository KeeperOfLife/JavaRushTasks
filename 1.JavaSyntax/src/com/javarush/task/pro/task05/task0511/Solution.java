package com.javarush.task.pro.task05.task0511;

import java.util.Arrays;
import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        multiArray = new int[N][];
        for (int i = 0; i < N; i++) {
            int a = console.nextInt();
            multiArray[i] = new int[a];
        }
        System.out.println(Arrays.deepToString(multiArray));
    }
}









