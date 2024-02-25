import java.util.*;
public class man{
    public static void main(String args[]){
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int arr[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            arr[i]=ip.nextInt();
            if(arr[i]==1 || arr[i]==0){
                c+=1;
            }
        }
        if(arr.length==c){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}