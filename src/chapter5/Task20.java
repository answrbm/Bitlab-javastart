package chapter5;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] numbers = new int[n][n];

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                if(i == 0 || i == numbers.length - 1) {
                    int temp = numbers[i][j];
                    numbers[i][j] = numbers[numbers.length - 1][j];
                    numbers[numbers.length - 1][j] = temp;
                }
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
