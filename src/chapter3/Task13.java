package bitlab.javastart.chapter3;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.print(sum);
    }
}
