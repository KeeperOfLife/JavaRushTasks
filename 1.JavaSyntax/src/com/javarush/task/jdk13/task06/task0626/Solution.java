package com.javarush.task.jdk13.task06.task0626;

import java.util.Scanner;

/* 
Первая база данных
*/

public class Solution {
    public static String[][] array = new String[][]{{"123", "Иванов", "Богдан"},
            {"1425", "Петрова", "Марина"},
            {"37", "Богдан", "Андрей"},
            {"98", "Богданова", "Марина"},
            {"6285", "Прутко", "Сергей"},
            {"8", "Клочкова", "Елена"},
            {"754", "Котов", "Иван"}};

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String id = console.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (array[i][0].equals(id) || array[i][1].equals(id) || array[i][2].equals(id)){
                System.out.print(array[i][0] + " " + array [i][1] + " " + array[i][2]);
                System.out.println();
            }
        }
    }
}