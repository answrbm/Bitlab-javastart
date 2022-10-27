package bitlab.javastart.chapter3;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int mult = 1;
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++) {
            mult *= i;
        }
        System.out.println(mult);
    }
}
