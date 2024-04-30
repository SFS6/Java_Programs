public class sample1 {
    public static void main(String[] args){
        String dir[] = new String[]{"N","E","N","W","S"};
        int val[] = new int[]{10,20,30,40,50};
        int N=0,E=0;
        for(int i=0;i<dir.length;i++){
            if(dir[i]=="N") N+=val[i];
            if(dir[i]=="S") N-=val[i];
            if(dir[i]=="E") E+=val[i];
            if(dir[i]=="W") E-=val[i];
        }
        int a=(N*N)+(E*E);
        double c = Math.sqrt(a);
        System.out.println(c);
    }
    
}
