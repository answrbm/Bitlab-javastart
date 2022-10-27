package chapter5;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] numbers = new int[n][m];

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j] % k == 0) numbers[i][j] = numbers[i][j] / k;
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
