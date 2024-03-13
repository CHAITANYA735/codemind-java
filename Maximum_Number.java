import java.util.*;
public class min{
    public static void main(String a[]){
        Scanner ip = new Scanner(System.in);
        String s1=ip.nextLine();
        char c[]=s1.toCharArray();
        for(int i=0;i<s1.length();i++){
            if(c[i]=='6'){
                c[i]='9';
                break;
            }
        }
        System.out.println(c);
        
    }
}