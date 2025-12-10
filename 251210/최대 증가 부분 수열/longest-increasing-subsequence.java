import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int[] dp = new int[n];
        dp[0]=1;
        int max=0;
        for(int i=0; i<n; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[i] > arr[j]){
                    dp[i] = dp[j];
                }
            }
            dp[i]++;
            max=Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}