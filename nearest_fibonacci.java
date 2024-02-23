import java.util.*;
import java.lang.Math;
public class sam{
    public static void main(String args[]){
        Scanner ip=new Scanner(System.in);
        int k=0,m=0;
        int n=ip.nextInt();
        int[] arr =new int[n];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        for(int i=0;i<n;i++){
            if(arr[i]>n){
                k=Math.abs(n-arr[i-1]);
                m=Math.abs(n-arr[i]);
                if(k<m){
                     System.out.println(arr[i-1]);
                     break;
                }
                else if(k==m){
                    System.out.print(arr[i-1]+" "+arr[i]);
                    break;
                }
                else{
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}