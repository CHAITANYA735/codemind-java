import java.util.*;
public class min{
    public static void main(String a[]){
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ip.nextInt();
        }
        int c=0,c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                c=c+arr[i];
                
            }
            else{
                c1=c1+arr[i];
            }
        
        }
        int i=0,j=1;
        while(i<n && j<n){//1 2 3 1
            if(arr[i]>arr[j]){
                c2=c2+arr[i];
                i+=2;
                j+=2;
            }
            else{
                c2=c2+arr[j];
                i+=3;
                j+=2;
            }
        }
        int d=(c>c1&&c>c2)?c:(c1>c&&c1>c2)?c1:c2;
        System.out.println(d);
    }
}
