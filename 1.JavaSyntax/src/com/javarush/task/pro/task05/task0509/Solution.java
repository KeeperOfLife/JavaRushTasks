package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишите тут ваш код
        //1. В методе main массив MULTIPLICATION_TABLE должен быть заполнен таблицей умножения.
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1);
                //2. Выведенный текст должен содержать 10 строк.
                //3. Каждая выведенная строка должна содержать 10 чисел, разделенных пробелом.
                //4. Выведенные числа должны быть таблицей умножения.
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}