package Arrays;

public class mulmatrix {
    public static void main(String[] args) {
        int a[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int b[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int c[][] = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                int sum = 0,count=0;
                for(int k=0;k<a.length;k++){
                sum += a[i][j] * b[j][i];
                count++;
            }
                c[i][j] = sum;
                System.out.print(c[i][j] + " ");
            }

            System.out.print("\n");
        }

    }
}
