import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int a[]=new int[n];
        int b[]=new int[n*2];
        for(int i=0;i<n;i++){
            a[i]=ip.nextInt();
        }
        int j=0;
        for (int i=0;i<n;i++){
            if(a[i]!=0){
    
                b[j]=a[i];
                j+=1;
                
            }
            else{
                
                b[j]=0;
                b[j+1]=0;
                j+=2;
                
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}