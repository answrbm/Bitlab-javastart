package bitlab.javastart.chapter3;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();
        for(int i = 1; i <= w; i++) {
            n -= i*k;
        }
        System.out.print(Math.abs(n));
    }
}
