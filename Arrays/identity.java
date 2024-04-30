package Arrays;

public class identity {
    public static void main(String[] args) {
        int flag = 0, count = 0;
        int a[][] = new int[][] { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j)
                    if (a[i][j] == 1)
                        count++;
                    else
                        count--;
            }
        }
        if (count == a.length)
            System.out.println("Identity Matrix");
        else
            System.out.println("Not a Identity Matrix");
    }

}
