package Arrays;

public class merge {
    public static void main(String[] args) {
        int n = 0, i;
        int a[] = new int[] { 5, 2, 2, 1, 7 };
        int b[] = new int[] { 3, 2, 56, 7, 89 };
        int c[] = new int[a.length + b.length];
        for (i = 0; i < a.length; i++) {
            c[i] = a[i];
            n++;
        }
        for (i = 0; i < b.length; i++) {
            c[n] = b[i];
            n++;
        }
        for (i = 0; i < c.length; i++) {
            for (int j = i; j < c.length; j++) {
                if (c[i] > c[j]) {
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        for (i = 0; i < c.length; i++)
            System.out.print(c[i] + " ");
    }

}
