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
            dp[i]=1;
            int maxVal=0;
            for(int j=0; j<i; j++){
                
                if(arr[i] > arr[j]){
                   maxVal = Math.max(maxVal,dp[j]);
                }
            }
            dp[i] += maxVal;
            max=Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}