import java.util.Scanner;
public class diamondstars {
    public static void main(String[] args) {
        int row;
        Scanner sc =new Scanner(System.in);
        row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int spc=1;spc<=row-i;spc++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(int i=row-1;i>0;i--){
            for(int spc=row-i;spc>=1;spc--){
                System.out.print("  ");
            }
            for(int j=2*i-1;j>=1;j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    
}
