package chapter5;

import java.util.Scanner;

public class Task19 {
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

        for(int i = 0; i < numbers[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < numbers.length; j++) {
                if(numbers[j][i] > max) max = numbers[j][i];
            }
            System.out.println(max);
        }
    }
}
