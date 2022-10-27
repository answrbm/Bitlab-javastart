package bitlab.javastart.chapter3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i <= n; i++) {
            if(i % 2 == 0) System.out.print(i + " ");
        }
    }
}
