public class mino {
    public static void main(String[] args) {
        int a[] = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print(a[0]);
        // for (int i = 0; i < a.length; i++) {
        // System.out.print(a[i] + " ");
        // }
    }

}
