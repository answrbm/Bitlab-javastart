package bitlab.javastart.chapter3;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n;
        while(true) {
            n = scanner.nextInt();
            if(n == 0) break;
            if(n % 2 != 0) sum += n;
        }
        System.out.println(sum);
    }
}
