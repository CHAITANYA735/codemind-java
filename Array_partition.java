import java.util.*;
public class dd{
    public static void main(String args[]){
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ip.nextInt();
        }
        Arrays.sort(arr);
        int j=1,s=0;
        for(int i=0;i<n-1;){
            
            if(arr[i]<arr[j]){
                s=s+arr[i];
                i=i+2;
                j=j+2;
            }
            else{
                s=s+arr[j];
                i=i+2;
                j=j+2;
            }
        }
        System.out.println(s);
    }
}