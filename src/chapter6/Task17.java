package chapter6;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = new StringBuilder(scanner.nextLine()).reverse().toString();

        if(s1.equals(s2)) System.out.println("Yes");
        else System.out.println("No");
    }
}
