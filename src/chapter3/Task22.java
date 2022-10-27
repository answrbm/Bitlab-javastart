package bitlab.javastart.chapter3;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int n;
        while((n = scanner.nextInt()) != 0) {
            if(n > max) max = n;
        }
        System.out.println(max);
    }
}
