package chapter6;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String newS = "";
        for(char c : s.toCharArray()) {
            String l = String.valueOf(c);
            if(l.equalsIgnoreCase("a")) newS += "o";
            else newS += l;
        }
        System.out.println(newS);
    }
}
