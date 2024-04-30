package Arrays;

public class sodiag {
    public static void main(String[] args) {
        int a[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum += a[i][j];
                System.out.print(a[i][j] + " ");
            }
            System.out.print(" " + sum + "\n");
        }
        for (int j = 0; j < a.length; j++) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i][j];
            }
            System.out.print(sum);
        }

    }

}
