package chapter6;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        String s = "";
        for(int i = 0; i < arr.length; i++) {
            switch(arr[i].toLowerCase()) {
                case "zero" : arr[i] = "0";
                    break;
                case "one" : arr[i] = "1";
                    break;
                case "two" : arr[i] = "2";
                    break;
                case "three" : arr[i] = "3";
                    break;
                case "four" : arr[i] = "4";
                    break;
                case "five" : arr[i] = "5";
                    break;
                case "six" : arr[i] = "6";
                    break;
                case "seven" : arr[i] = "7";
                    break;
                case "eight" : arr[i] = "8";
                    break;
                case "nine" : arr[i] = "9";
                    break;
            }
            s += arr[i] + " ";

        }
        System.out.println(s);
    }
}
