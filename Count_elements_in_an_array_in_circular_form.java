import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int c=0;
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=ip.nextInt();
        }
        for (int i=1;i<n-1;i++){
            if((arr[i-1]%2==0 && arr[i+1]%2==1) || (arr[i-1]%2==1 && arr[i+1]%2==0)) 
            {
                c+=1;
            }
        }
        if((arr[1]%2==0 && arr[n-1]%2==1) || (arr[1]%2==1 && arr[n-1]%2==0)){
            c+=1;
        }
        if((arr[n-2]%2==0 && arr[0]%2==1) || (arr[n-2]%2==1 && arr[0]%2==0)){
            c+=1;
        }
        
        System.out.println(c);
}
}