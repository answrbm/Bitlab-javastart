package bitlab.javastart.chapter2;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        if(i >= 0) i++;
        System.out.println(i);
    }
}
