package bitlab.javastart.chapter1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int a3 = (int)Math.pow(a,3);
        int b2 = (int)Math.pow(b,2);
        int c3 = (int)Math.pow(c,3);

        System.out.println(a3 + 2*b2 - 3*a*b + c3);
    }
}
