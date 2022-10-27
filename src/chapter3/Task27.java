package bitlab.javastart.chapter3;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i*i;
        }
        System.out.print(sum);
    }
}
