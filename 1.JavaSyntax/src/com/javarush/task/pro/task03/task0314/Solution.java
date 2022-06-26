package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String secretWord = keyboard.nextLine();
        if (secret.equalsIgnoreCase(secretWord)) {
            System.out.println("доступ разрешен");
        }else
            System.out.println("доступ запрещен");
    }
}
