package chapter5;

import java.util.Scanner;

public class Task14 {
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

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j] > max) max = numbers[i][j];
                if(numbers[i][j] < min) min = numbers[i][j];
            }
        }

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                int temp = numbers[i][j];
                if(numbers[i][j] == max) numbers[i][j] = min;
                if(temp == min) numbers[i][j] = max;
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
