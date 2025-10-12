import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][2];
        int timeA=0; int timeB=0;
        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
            timeA += A[i][1];
        }
        int[][] B = new int[m][2];
        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
            timeB += B[i][1];
        }
        // Please write your code here.
        char head='0';
        int cnt=0;
        int[] AtimeLine = new int[timeA+1];
        int[] BtimeLine = new int[timeB+1];
        int idx=1;
        for(int i=0; i<n; i++){
            int u=A[i][0];  int t=A[i][1];
            for(int j=0; j<t; j++){
                AtimeLine[idx] = AtimeLine[idx-1]+u;
                idx++;
            }
        }

        idx=1;
        for(int i=0; i<m; i++){
            int u=B[i][0];  int t=B[i][1];
            for(int j=0; j<t; j++){
                BtimeLine[idx] = BtimeLine[idx-1]+u;
                idx++;
            }
        }

        for(int i=1; i<=timeA; i++){
            char h;
            if(AtimeLine[i]>BtimeLine[i]) h='A';
            if(AtimeLine[i]<BtimeLine[i]) h='B';
            else h='0';

            if(head!=h && h!='0') cnt++;
            head=h;
            //System.out.println(AtimeLine[i]+" "+BtimeLine[i]+" "+head+" "+cnt);
        }
        System.out.println(cnt);
    }
}