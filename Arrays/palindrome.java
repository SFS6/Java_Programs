package Arrays;

import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        int flag = 0;
        String ch, ch1 = "";
        Scanner sc = new Scanner(System.in);
        ch = sc.next();
        for (int i = ch.length() - 1; i >= 0; i--) {
            ch1 += ch.charAt(i);
        }
        System.out.println(ch1);
        if (ch.equals(ch1))
            System.err.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }

}
