package chapter6;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();

        char[] letters = {'a', 'e', 'i', 'o', 'u','y'};

        int counter = 0;
        for(char c : s1.toCharArray()) {
            for(char l : letters) {
                if(String.valueOf(c).equalsIgnoreCase(String.valueOf(l))) counter++;
            }
        }

        System.out.println(counter);
    }
}
