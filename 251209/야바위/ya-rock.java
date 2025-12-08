import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        // Please write your code here.
        int cnt=0;

        for(int i=1; i<=3; i++){
            int cur = i;
            int curCnt=0;
            for(int j=0; j<n; j++){
                if(cur == a[j]){
                    cur=b[j];
                }else if(cur == b[j]){
                    cur=a[j];
                }
                if(cur == c[j]){
                    curCnt++;
                }
            }
            cnt = Math.max(cnt, curCnt);
        }
        System.out.println(cnt);
    }
}