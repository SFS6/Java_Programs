import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        int flag = 0;
        int a[] = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (b == a[i]) {
                System.out.println(i);
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println(-1);
    }
}
