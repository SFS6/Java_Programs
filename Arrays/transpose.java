package Arrays;

public class transpose {
    public static void main(String[] args) {
        int a[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

}
