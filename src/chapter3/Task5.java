package bitlab.javastart.chapter3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for(int i = n; i <= m; i++) {
            System.out.print(i + " ");
        }
    }
}
