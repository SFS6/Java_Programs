public class prodofsubarr {
    public static void main(String[] args) {
        int prod = 0;
        int a[] = new int[] { 2, 3, -2, 4 };
        for (int i = 0; i < a.length; i++) {
            if (i + 1 == a.length)
                break;

            else if ((a[i] * a[i + 1]) > prod)
                prod = a[i] * a[i + 1];
        }
        System.out.println(prod);
    }

}
