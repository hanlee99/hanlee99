import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][2];
        int dist=0; int dist2=0;
        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
            dist += A[i][0] * A[i][1];
        }
        int[][] B = new int[m][2];
        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
            dist2 += B[i][0] * B[i][1];
        }
        // Please write your code here.
        char head='0';
        int cnt=0;
        int[] AtimeLine = new int[dist+1];
        int[] BtimeLine = new int[dist+1];
        int idx=1;
        for(int i=0; i<n; i++){
            int u=A[i][0];
            int t=A[i][1];
            for(int j=0; j<t; j++){
                AtimeLine[idx] = AtimeLine[idx-1]+u;
                idx++;
            }
        }
        idx=1;
        for(int i=0; i<m; i++){
            int u=B[i][0];
            int t=B[i][1];
            for(int j=0; j<t; j++){
                BtimeLine[idx] = BtimeLine[idx-1]+u;
                idx++;
            }
        }
        for(int i=1; i<=dist; i++){
            if(AtimeLine[i]>BtimeLine[i]){
                if(head!='A'){
                    cnt++;
                    head='B';
                }
            }else if(AtimeLine[i]<BtimeLine[i]){
                if(head!='B'){
                    cnt++;
                    head='B';
                }
            }
        }
        System.out.println(cnt);
    }
}