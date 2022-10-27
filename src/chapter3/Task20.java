package bitlab.javastart.chapter3;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n;
        while((n = scanner.nextInt()) != 0) {
            sum += n;
        }
        System.out.println(sum);
    }
}
