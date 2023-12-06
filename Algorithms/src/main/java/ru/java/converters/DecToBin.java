package ru.java.converters;

public class DecToBin {
    public static void main(String[] args) {
        System.out.println(decToBin(23));
        System.out.println(binToDec(1011001));
    }

    public static int decToBin(int number) {
        if (number <= 0) {
            return 0;
        }
        int result = 0;
        int i = 0;
        while (number / 2 > 0) {
            result += (number % 2) * (int) Math.pow(10, i);
            number /= 2;
            i++;
        }
        result += (number % 2) * (int) Math.pow(10, i);
        return result;
    }

    public static int binToDec(int number) {
        if (number <= 0) {
            return 0;
        }
        int result = 0;
        int i = 0;
        while (number / 10 > 0) {
            result += (number % 10) * (int) Math.pow(2, i);
            number /= 10;
            i++;
        }
        result += (number % 10) * (int) Math.pow(2, i);
        return result;
    }
}
