import java.util.Scanner;
public class example {
    public static void main(String[] args) {
        int m,n;
        Scanner sc =new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        System.out.println("Enter the Elements for the first Matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the Elements for the second Matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                b[i][j]=sc.nextInt();
            }
        }
        int c[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                c[i][j]=0;
                for(int k=0;k<m;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
        
    }
    
}
