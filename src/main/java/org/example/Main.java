package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-12221));
        System.out.println(isPerfectNumber(28));
        System.out.println(numberToWords(94710032));
    }
    public static boolean isPalindrome(int num) {
        boolean sonuc = false;
        String numString = String.valueOf(num);
        numString = numString.replaceAll("-", "");
        char[] array = numString.toCharArray();
        for(int i=0; i<array.length; i++) {
            if(array[i] == array[array.length-1-i]) {
                sonuc = true;
            } else {
                sonuc = false;
                break;
            }
        }
        return sonuc;
    }
    public  static  boolean isPerfectNumber(int num) {
        boolean sonuc = false;
        int toplam = 0;
        for(int i=1; i<num; i++) {
            if(num % i == 0 && num>0) {
                toplam = toplam + i;
            }
        }
        if (toplam == num) {
            sonuc = true;
        }
        return sonuc;
    }
    public  static String numberToWords(int num) {
        String string = String.valueOf(num);
        char[] array = string.toCharArray();
        String words = "";
        for(int i=0; i<array.length; i++) {
            switch (String.valueOf(array[i])) {
                case ("-"):
                    return "Invalid Value";
                case ("0"):
                    words = words + "Zero ";
                    break;
                case ("1"):
                    words = words + "One ";
                    break;
                case ("2"):
                    words = words + "Two ";
                    break;
                case ("3"):
                    words = words + "Three ";
                    break;
                case ("4"):
                    words = words + "Four ";
                    break;
                case ("5"):
                    words = words + "Five ";
                    break;
                case ("6"):
                    words = words + "Six ";
                    break;
                case ("7"):
                    words = words + "Seven ";
                    break;
                case ("8"):
                    words = words + "Eight ";
                    break;
                case ("9"):
                    words = words + "Nine ";
                    break;
            }
        }

        return words.trim();
    }
}

