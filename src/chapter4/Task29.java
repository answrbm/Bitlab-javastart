package chapter4;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        int[] nums = new int[capacity];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        boolean isStarted = false;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            boolean temp = isStarted;
            if(nums[i] == 0 && !isStarted) isStarted = true;
            if(nums[i] == 0 && temp) isStarted = false;

            if(isStarted) sum += nums[i];
        }
        System.out.println(sum);
    }
}
