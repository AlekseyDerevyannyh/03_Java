package ru.java.converters;

public class DecToBin {
    public static void main(String[] args) {
        System.out.println(decToBin(23));
        System.out.println(decToBin1(23));
        System.out.println(binToDec(1011001));
        System.out.println(binToDec("1011001"));
    }

    public static int decToBin(int number) {
        if (number <= 0) {
            return 0;
        }
        int result = 0;
        int i = 0;
        while (number > 0) {
            result += (number % 2) * (int) Math.pow(10, i);
            number /= 2;
            i++;
        }
        return result;
    }

    public static String decToBin1(int number) {
        if (number <= 0) {
            return "";
        }
        String result = "";
        while (number > 0) {
            result = number % 2 + result;
            number /= 2;
        }
        return result;
    }

    public static int binToDec(int number) {
        if (number <= 0) {
            return 0;
        }
        int result = 0;
        int i = 0;
        while (number > 0) {
            result += (number % 10) * (int) Math.pow(2, i);
            number /= 10;
            i++;
        }
        return result;
    }

    public static int binToDec(String number) {
        if (number == null || number.isEmpty()) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            result += Character.getNumericValue(number.charAt(number.length() - 1 - i)) * (int) Math.pow(2, i);
        }
        return result;
    }
}
