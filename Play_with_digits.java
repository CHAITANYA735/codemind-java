import java.util.*;
public class oo{
    public static void main(String args[]){
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int c=0,k,rem;
        int ashi[]=new int[n];
        for(int i=0;i<n;i++){
            ashi[i]=ip.nextInt();
            k=0;
            while(ashi[i]>0){
                rem=ashi[i]%10;
                ashi[i]=ashi[i]/10;
                k=k+rem;
            }
            c=c+k;
        }
    
        System.out.println(c);
        
        
    }
}