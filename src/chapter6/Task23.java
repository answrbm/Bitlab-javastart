package chapter6;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        char[] arr = scanner.nextLine().toCharArray();

        int counter = 0;
        for(char c : arr) {
            String s = String.valueOf(c);
            if(s.matches("[a-zA-Z]")) counter++;
        }
        System.out.println(counter);
    }
}
