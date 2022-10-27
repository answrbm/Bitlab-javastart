package bitlab.javastart.chapter3;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int count = 1;
        int i = 0;
        while(true) {
            if(i == n) break;
            if(count % 2 != 0) {
                sum += count;
                i++;
            }
            count++;
        }
        System.out.println(sum);
    }
}
