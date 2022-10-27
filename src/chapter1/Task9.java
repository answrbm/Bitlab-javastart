package bitlab.javastart.chapter1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt() * 2;
        int b = scanner.nextInt() - 3;
        int c = scanner.nextInt();
        int sqr = c * c;

        int sum = a + b + sqr;
        System.out.println(sum);
    }
}
