public class ex{
    public static void main(String[] args) {
        for(char c='a';c<='f';c++){
            for(int j=1;j<=(c-'a')*2+1;j++){
                System.out.print(c+""+j);
            }
            System.out.println();
        }
    }
}