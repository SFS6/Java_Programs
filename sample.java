import java.util.Scanner;
public class sample{
public static void main(String[] args) {
    int n;
    Scanner sc =new Scanner(System.in);
    n = sc.nextInt();
    if(n>0){
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>=0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=((2*(i))-1);j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
    else{
        int a=-n;
        for(int i=a;i>0;i--){
            for(int k=0;k<(a-i);k++)
                System.out.print(" ");
            for(int j=(2*i-1);j>=1;j--)
                System.out.print("*");
            System.out.print("\n");
        }

    }
}
}