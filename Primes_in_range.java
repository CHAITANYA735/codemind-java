import java.util.*;
public class prime{
    public static void main(String args[]){
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int m=ip.nextInt();
        int s=0;
        for(int i=n;i<=m;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    c++;
                }
            }
            if(c==2){
                s++;
            }
        }
        System.out.println(s);
        
        
        
    }
}