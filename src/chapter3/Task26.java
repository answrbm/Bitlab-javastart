package bitlab.javastart.chapter3;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        for(int i = a; i <= b; i++) {
            if(i % d == c) System.out.print(i + " ");
        }
    }
}
