import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] coin = new int[n];
        int[] dp = new int[m+1];
        for (int i = 0; i < n; i++){
            coin[i] = sc.nextInt();
        }
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        // Please write your code here.
        for(int i=1; i<m+1; i++){
            int min=Integer.MAX_VALUE;
            for(int c=0; c<n; c++){
                if(i-coin[c] >= 0 && dp[i-coin[c]] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], dp[i-coin[c]]+1);
                }
            }
        }

        int cnt= dp[m] != 0 ? dp[m] : -1;
        System.out.println(cnt);
    }
}