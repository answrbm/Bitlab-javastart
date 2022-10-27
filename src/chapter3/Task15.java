package bitlab.javastart.chapter3;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sum = 0;
        for(int i = n; i <= m; i++) {
            if(i % 2 == 0) sum += i;
        }
        System.out.println(sum);
    }
}
