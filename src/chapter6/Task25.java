package chapter6;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        System.out.println(s1.replaceAll("(?i)" + s2,s3));
    }
}
