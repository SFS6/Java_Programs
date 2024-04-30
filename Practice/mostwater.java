public class mostwater {
    public static void main(String[] args) {
        int max = 0, pos = 0, j = 0, pos1 = 0, max1 = 0;
        int a[] = new int[] { 1, 8, 6, 2, 5, 4, 3, 7, 8 };
        int b[] = a.clone();
        for (int i = 0; i < b.length; i++) {
            for (j = 0; j < b.length; j++) {
                if (b[i] < b[j]) {
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        for (int i = b.length - 1; i > 0; i--) {
            if (a[i] == b[i - 1])
                max1 = b[i - 1];
            else
                max1 = b[i];
        }

        for (int i = 0; i < a.length; i++) {
            if (max1 == a[i])
                pos = i;
            if (max < a[i])
                max = a[i];
            pos1 = j;
        }
        int prod = pos1 - pos;

        System.out.println(prod * prod);
    }
}
