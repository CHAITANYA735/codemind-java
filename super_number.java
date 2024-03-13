import java.util.*;
public class min{
    public static void main(String a[]){
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int s1=div(n);
        int s2=pri(n);
        if(s1==s2){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        
        
    }
    public static int pri(int n){
        int s=0;
        while(n>1){
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    n=n/i;
                    if(i<10){
                        s=s+i;
                    }
                    else{
                        s=s+div(i);
                    }
                    break;
                }
            }
        }
        return s;
    }
    public static int div(int n){
        int s=0,r;
        while(n>0){
            r=n%10;
            n=n/10;
            s=s+r;
        }
        return s;
        
    }
    
}