import java.util.Scanner;

public class rangeadd {
    public static void main(String[] args) {
        int j = 0, i = 0;
        int[][] arr = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of operations to be performed :");
        int ops = sc.nextInt();
        int b[][] = new int[ops][2];
        for (i = 0; i < ops; i++) {
            for (j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int a = 0; a < b.length; a++) {
            for (int a1 = 0; a1 < b[a][a]; a1++) {
                for (int c1 = 0; c1 < b[a][a]; c1++) {
                    arr[a1][c1]++;
                }
            }
        }
        int count = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; i++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] == arr[i][arr.length - 1]) {
                    count++;
                }
            }
            System.out.print("\n");
        }
        // else if (arr[i][j] == arr[i][j + 1]) {
        // count++;
        // }
        // }
        // }
        System.out.println(count);
    }
}
