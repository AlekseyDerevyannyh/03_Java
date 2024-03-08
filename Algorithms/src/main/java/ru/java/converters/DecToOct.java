package ru.java.converters;

public class DecToOct {
    
    public static void main(String[] args) {
        System.out.println(decToOct(753));
        System.out.println(octToDec(10));
    }

    public static int decToOct(int number) {
        if (number <= 0) {
            return 0;
        }
        int result = 0;
        int i = 0;
        while (number > 0) {
            result += (number % 8) * (int) Math.pow(10, i);
            number /= 8;
            i++;
        }
        return result;
    }

    public static int octToDec(int number) {
        if (number <= 0) {
            return 0;
        }
        int result = 0;
        int i = 0;
        while (number > 0) {
            result += (number % 10) * (int) Math.pow(8, i);
            number /= 10;
            i++;
        }
        return result;
    }
}
