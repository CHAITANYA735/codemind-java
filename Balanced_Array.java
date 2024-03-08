import java.util.*;
public class charan{
    public static void main(String args[]){
        Scanner ip=new Scanner(System.in);
        int t=ip.nextInt();
        for (int i=0;i<t;i++){
            int n=ip.nextInt();
            int arr[]=new int[n];
            for (int j=0;j<n;j++){
                arr[j]=ip.nextInt();
            }
            chai(arr,n);
            
        }
        
    }
    static void chai(int arr[],int n){
        int c=0;
        for(int i=0;i<n;i++){
            int s1=0,s2=0;
            for(int j=i-1;j>=0;j--){
                s1=s1+arr[j];
            }
            for(int j=i+1;j<n;j++){
                s2=s2+arr[j];
            }
        
            if(s1==s2){
                c++;
                System.out.println("YES");
            
            }
        }
        if(c<1){
            System.out.println("NO");
        }
    }
    
}