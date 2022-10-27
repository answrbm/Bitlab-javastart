package chapter4;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        int[] nums = new int[capacity];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        boolean isAlternated = true;
        for(int i = 0; i < nums.length - 1; i++) {
            if(!(nums[i] >= 0 && nums[i+1] < 0)
                    && !(nums[i] < 0 && nums[i+1] >= 0)) isAlternated = false;
        }
        if(isAlternated) System.out.println("YES");
        else System.out.println("NO");
    }
}
