package chapter6;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();

        int sum = 0;
        for(char c : s1.toCharArray()) {
            if(Character.isDigit(c)) sum += Integer.parseInt(String.valueOf(c));
        }

        System.out.println(sum);
    }
}
