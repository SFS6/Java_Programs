import java.util.Scanner;

public class togglenthbit {
    public static void main(String[] args) {
        int toggled;
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int nth=sc.nextInt();
        toggled=n^(nth<<1);
        System.out.println(toggled);       
    }
}
