package ru.java.converters;

public class HexToBin {
    
    public static final String HEX = "0123456789abcdef";
    public static final String[] BIN = {"0000", "0001", "0010", "0011", "0100", "0101",
    "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

    public static void main(String[] args) {
        System.out.println(hexToBin("3b2f"));
        System.out.println(binToHex("11101100101111"));
    }
    
    public static String hexToBin(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty()) {
            return "";
        }
        String result = "";

        for (int i = 0; i < hexNumber.length(); i++) {
            for (int j = 0; j < HEX.length(); j++) {
                if (hexNumber.charAt(i) == HEX.charAt(j)) {
                    result += BIN[j];
                }
            }
        }
        return result;
    }

    public static String binToHex(String binNumber) {
        if (binNumber == null || binNumber.isEmpty()) {
            return "";
        }
        String result = "";
        int i = binNumber.length();
        while (i > 0) {
            String subresult = "";
            if (i > 3) {
                subresult = binNumber.substring(i - 4, i);
            } else if (i == 3) {
                subresult = "0" + binNumber.substring(0, i);
            } else if (i == 2) {
                subresult = "00" + binNumber.substring(0, i);
            } else {
                subresult = "000" + binNumber.substring(0, i);
            }
            for (int j = 0; j < BIN.length; j++) {
                if (subresult.equals(BIN[j])) {
                    result = HEX.charAt(j) + result;
                }
            }
            i -= 4;
        }
        return result;
    }
}
