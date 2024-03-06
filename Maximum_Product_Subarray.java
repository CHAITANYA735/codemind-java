import java.util.*;
public class main{
    public static void main(String a[]){
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ip.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int p=1;
                for(int k=i;k<=j;k++){
                    p=p*arr[k];
                    if(p>max){
                        max=p;
                    }
                    
                }
            }
        }
        System.out.println(max);
    }
}