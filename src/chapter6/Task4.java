package chapter6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if(s.equalsIgnoreCase("java")) System.out.println("YES");
        else System.out.println("NO");
    }
}
