import java.util.*;
public class samvenky{
    public static void main(String chaii[]){
        Scanner sc =  new Scanner(System.in);
        int n=sc.nextInt();
        int ven[]=new int[n];
        int ven1[]=new int[n];
        int i;
        for(i=0;i<n;i++){
            ven[i]=sc.nextInt();
        }
        
        int j=0;
        for(i=0;i<n;i++){
            if(ven[i]==0){
                ven1[j]=0;
                j+=1;
            }
        }
        for(i=0;i<n;i++){
            if(ven[i]!=0){
                ven1[j]=1;
                j+=1;
            }
        }
        for(i=0;i<n;i++){
            System.out.print(ven1[i]+" ");
        }
    }
}