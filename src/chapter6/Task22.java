package chapter6;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        char[] arr = scanner.nextLine().toCharArray();

        String s = "";
        for(int i = 0; i < arr.length; i++) {
            String l = String.valueOf(arr[i]);
            if(Character.isDigit(arr[i])) arr[i] = '0';
        }
        System.out.println(arr);
    }
}
