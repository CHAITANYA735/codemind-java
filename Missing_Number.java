import java.util.*;
public class ss{
    public static void main(String args[]){
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int arr[]=new int[n];
        int c=0;
        for(int i=0;i<n-1;i++){
            arr[i]=ip.nextInt();
            c=c+arr[i];
        }
        int k=(n*(n+1))/2;
        System.out.println(k-c);
        
    }
}