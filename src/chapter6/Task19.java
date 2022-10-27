package chapter6;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        char[] arr = scanner.nextLine().toCharArray();
        int i = Integer.parseInt(String.valueOf(arr[0]));
        System.out.println(arr[1] + "" + (i*2));
    }
}
