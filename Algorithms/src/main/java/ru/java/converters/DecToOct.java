package ru.java.converters;

public class DecToOct {
    public static void main(String[] args) {
        System.out.println(decToOct(753));
    }

    public static int decToOct(int number) {
        int result = 0;
        int i = 0;
        while (number / 8 > 0) {
            result += (number % 8) * (int) Math.pow(10, i);
            number /= 8;
            i++;
        }
        result += (number % 8) * (int) Math.pow(10, i);
        return result;
    }
}
