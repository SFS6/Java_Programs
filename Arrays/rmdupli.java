package Arrays;

public class rmdupli {
    public static void main(String[] args) {
        int a[] = new int[] { 5, 2, 4, 6, 9, 7, 6, 4, 2, 1, 0 };
        int b[] = new int[a.length];
        int n = a.length, visited = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    b[j] = visited;
                }
            }
            if (b[i] != visited)
                b[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            if (b[i] == 1)
                System.out.print(a[i] + " ");
        }
    }

}
