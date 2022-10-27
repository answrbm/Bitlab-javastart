package chapter6;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String l = scanner.nextLine();

        int counter = 0;
        for(char c : s.toCharArray()) {
            if(String.valueOf(c).equalsIgnoreCase(l)) counter++;
        }
        System.out.println(counter);
    }
}
