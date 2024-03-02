import java.util.*;
public class min{
    public static void main(String args[]){
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int t;
        for(int i=0;i<n;i++){
            t=ip.nextInt();
            int arr[]=new int[t];
            for(int j=0;j<t;j++){
                arr[j]=ip.nextInt();
            }
            int k,m,z=0;
            for(int r=0;r<t;r++){
                int c=0,o=0;
                k=r+1;
                while(k<t){
                    c=c+arr[k];
                    k++;
                }
                
                m=r-1;
                while(m>=0){
                    o=o+arr[m];
                    m--;
                    
                }
                if(o==c){
                    System.out.println(r);
                    z=1;
                    break;
                }
            }
            if(z==0){
                System.out.println(-1);
            }
            
        }
    }
}