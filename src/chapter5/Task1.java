package chapter5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = {{12,5,7,6},{4,0,2,7},{9,1,3,2},{10,-2,4,6}};
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(numbers[n][m]);
    }
}
