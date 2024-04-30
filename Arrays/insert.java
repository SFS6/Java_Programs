package Arrays;

import java.util.*;

public class insert {
    public static void main(String[] args) {
        int i = 0, e = 17;
        int a[] = new int[] { 5, 2, 3, 6, 8, 0, 1, 2, 3, 5, 6 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position where the element has to be inserted:");
        int p = sc.nextInt();
        int b[] = new int[a.length + 1];
        for (i = 0; i < a.length; i++) {
            if (i < p - 1)
                b[i] = a[i];
            else if (i == p - 1) {
                b[i] = e;
                b[i + 1] = a[i];
            } else if (i > p - 1)
                b[i + 1] = a[i];
            // System.out.print(a[i] + " ");
        }
        for (i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }

}
