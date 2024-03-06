import java.util.*;
public class chaii{
    public static void main(String a[]){
        Scanner ip=new Scanner(System.in);
        int t=ip.nextInt();
        for(int i=0;i<t;i++){
            int n=ip.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=ip.nextInt();
            }
            int sum,co=0;
            for(int j=0;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    sum=arr[j]+arr[k];
                    for(int m=0;m<n;m++){
                        if(sum==arr[m]){
                            co=co+1;
                        }
                    }
                    
                }
            }
            if(co>0)
            System.out.println(co);
            else
            System.out.println(-1);
        }
    }
}