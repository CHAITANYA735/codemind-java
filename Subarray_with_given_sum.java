import java.util.*;

public class chii {
    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        /*
         * for(int i=0;i<n;i++){
         * System.out.println(a[i]);
         * }
         */
        int t = ip.nextInt();
        for (int u = 0; u < t; u++) {
            int n = ip.nextInt();
            int n1 = ip.nextInt();
            int a[] = new int[n + 1];
            for (int m = 1; m <= n; m++) {
                a[m] = ip.nextInt();
            }
            int c = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    int s = 0;
                    for (int k = i; k <= j; k++) {
                        // System.out.print(k + " ");
                        s = s + a[k];
                    }
                    if (s == n1) {
                        System.out.println(i + " " + j);
                        c = 1;
                        break;

                    }
                    if (c == 1) {
                        break;
                    }
                }
                if (c == 1) {
                    break;
                }

            }
             if (c == 0) {
                System.out.println(-1);
            }
        }
    }
}