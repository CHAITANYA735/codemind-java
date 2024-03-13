import java.util.*;
public class waste{
    public static void main(String arg[]){
        Scanner ip=new Scanner(System.in);
        int t=ip.nextInt();
        for(int i=0;i<t;i++){
            int a=ip.nextInt();
            int b=ip.nextInt();
            int c=a+b;
            if(c==2 || c==5||c==7||c==11||c==3){
                System.out.println("tevitt");
            }
            else{
                System.out.println("Satya");
            }
        }
    }
}