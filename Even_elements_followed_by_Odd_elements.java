import java.util.*;
public class evenodd{
    public static void main(String args[]){
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for( int i=0;i<n;i++){
            a[i]=ip.nextInt();
        }
        
        int k=0;
        for(int j=0;j<n;j++){
            if(a[j]%2==0){
                b[k]=a[j];
                k++;
            }
        }
        for(int z=0;z<n;z++){
            if(a[z]%2==1){
                b[k]=a[z];
                k++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
}
}