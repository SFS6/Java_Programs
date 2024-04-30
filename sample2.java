import java.util.Scanner;
public class sample2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String n=sc.next();
        int sum=0;
        for(int i=0;i<n.length();i+=2){
            int a= Character.valueOf(n.charAt(i));
            int b=Character.valueOf(n.charAt(i+1));
            if(a<b) sum+=(b-a);
            else sum+=(a-b); 
            // System.out.println(n.charAt(i));
        }
        System.out.println(sum);
    }
}
