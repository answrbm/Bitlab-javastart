package bitlab.javastart.chapter3;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 3; i <= n * 3; i += 3) {
            sum += i;
        }
        System.out.println(sum);
    }
}
