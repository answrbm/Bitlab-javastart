package bitlab.javastart.chapter1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("a=" + (a+b));
        System.out.println("b=" + (c-a));
        System.out.println("c=" + (a+b+c));
    }
}
