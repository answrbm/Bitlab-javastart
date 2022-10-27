package bitlab.javastart.chapter2;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        if(i > 0) i++;
        else if(i == 0) i = 10;
        else i -= 2;
        System.out.println(i);
    }
}
