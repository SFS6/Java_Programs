public class stockprices {
    public static void main(String[] args) {
        int i, j = 0, c = 0;
        int a[] = new int[] { 7, 6, 4, 3, 2, 1 };
        int b = a[0];
        for (i = 0; i < a.length; i++) {
            if (a[i] < b) {
                b = a[i];
                j = i;
            }
        }
        for (i = j; i < a.length; i++) {
            if (a[i] > c)
                c = a[i];
        }
        System.out.println(c - b);
    }
}
