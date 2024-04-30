public class profarsel {
    public static void main(String[] args) {
        int prod = 1;
        int a[] = new int[] { -1, 1, 0, -3, 3 };
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j])
                    continue;
                else {
                    prod *= a[j];
                    b[i] = prod;
                }
            }
            prod = 1;
        }
        for (int k = 0; k < b.length; k++) {
            System.out.print(b[k] + " ");
        }
    }
}
