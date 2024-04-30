public class duplicate {
    public static void main(String[] args) {
        int flag = 0;
        int a[] = new int[] { 1, 2, 3, 4 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    flag = 1;
                }
            }
        }
        if (flag == 1)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
