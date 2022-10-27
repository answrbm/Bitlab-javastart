package chapter6;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");

        int sum = 0;
        if(arr[arr.length - 2].equals("*") || arr[arr.length - 2].equals("/")) {
            if(arr[3].equals("*")) sum += (Integer.parseInt(arr[4]) * Integer.parseInt(arr[2]));
            else sum += (Integer.parseInt(arr[4]) / Integer.parseInt(arr[2]));
            switch (arr[1]) {
                case "*" : sum *= Integer.parseInt(arr[0]);
                    break;
                case "/" : sum /= Integer.parseInt(arr[0]);
                    break;
                case "+" : sum += Integer.parseInt(arr[0]);
                    break;
                case "-" : sum -= Integer.parseInt(arr[0]);
                    break;
            }
        } else {
            switch (arr[1]) {
                case "*" : sum += (Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]));
                    break;
                case "/" : sum += (Integer.parseInt(arr[0]) / Integer.parseInt(arr[2]));
                    break;
                case "+" : sum += (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]));
                    break;
                case "-" : sum += (Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]));
                    break;
            }

            switch (arr[3]) {
                case "*" : sum *= Integer.parseInt(arr[4]);
                    break;
                case "/" : sum /= Integer.parseInt(arr[4]);
                    break;
                case "+" : sum += Integer.parseInt(arr[4]);
                    break;
                case "-" : sum -= Integer.parseInt(arr[4]);
                    break;
            }
        }
        System.out.println(sum);
    }
}
