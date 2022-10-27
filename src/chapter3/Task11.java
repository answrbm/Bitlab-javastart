package bitlab.javastart.chapter3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) System.out.print(i + " ");
        }
    }
}
