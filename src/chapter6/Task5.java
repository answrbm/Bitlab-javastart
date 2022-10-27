package chapter6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        if(s1.equalsIgnoreCase(s2)) System.out.println("THEY ARE EQUAL");
        else System.out.println("THEY ARE NOT EQUAL");
    }
}
