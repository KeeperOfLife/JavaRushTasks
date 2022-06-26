package com.javarush.task.pro.task04.task0413;

/* 
Рисуем треугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 1; i <= 10; i++) {
            int theEight = 1 + i;
            for (int j = 1; j < theEight ; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}