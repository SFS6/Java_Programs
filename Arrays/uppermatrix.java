package Arrays;

public class uppermatrix {
    public static void main(String[] args) {
        int sum = 0;
        int a[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // for (int i = 0; i < a.length; i++) {
        // for (int j = 0; j < a.length; j++) {
        // if (i + j >= 2) {
        // System.out.println(a[i][j]);
        // sum += a[i][j];
        // }
        // }
        // }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i + j <= 2) {
                    System.out.println(a[i][j]);
                    sum += a[i][j];
                }
            }
        }
        System.out.println(sum);
    }

}
