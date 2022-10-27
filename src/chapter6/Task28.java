package chapter6;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");

        for(String s : arr) {
            System.out.print(new StringBuilder(s).reverse().toString() + " ");
        }
    }
}
