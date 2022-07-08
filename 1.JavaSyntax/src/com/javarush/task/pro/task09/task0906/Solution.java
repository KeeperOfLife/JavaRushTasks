package com.javarush.task.pro.task09.task0906;

/*
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //напишите тут ваш код
        String toBinary = "";
        // Если входящий параметр меньше или равен 0, метод toBinary(int) возвращает пустую строку
        if (decimalNumber <= 0) {
            return toBinary;
        }
        while (decimalNumber != 0) {
            toBinary = decimalNumber % 2 + toBinary;
            decimalNumber /= 2;
        }
        return toBinary;
    }

    public static int toDecimal(String binaryNumber) {
        //напишите тут ваш код
        int toDecimal = 0;
        if (binaryNumber == null) {
            return toDecimal;
        }

        for (int i = 0; i < binaryNumber.length(); i++) {
            int index = binaryNumber.length() - 1 - i;
            int value = Character.getNumericValue(binaryNumber.charAt(index));
            toDecimal += value * Math.pow(2, i);
        }
        return toDecimal;
    }
}
