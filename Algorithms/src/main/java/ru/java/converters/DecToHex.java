package ru.java.converters;

public class DecToHex {
    
    public static void main(String[] args) {
        System.out.println(decToHex(586));
        System.out.println(hexToDec("24A"));
    }

    public static String decToHex(int number) {
        if (number <= 0) {
            return "";
        }
        String result = "";

        while (number > 0) {
            String symbol = "";
            int value = number % 16;
            if (value < 10) {
                symbol = number % 16 + "";
            } else if (value == 10)
                symbol = "A";
            else if (value == 11)
                symbol = "B";
            else if (value == 12)
                symbol = "C";
            else if (value == 13)
                symbol = "D";
            else if (value == 14)
                symbol = "E";
            else
                symbol = "F";
            result = symbol + result;
            number /= 16;
        }
        return result;
    }

    public static int hexToDec(String number) {
        if (number == null || number.isEmpty()) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            result += Character.getNumericValue(number.charAt(number.length() - 1 - i)) * (int) Math.pow(16, i);
        }
        return result;
    }
}
