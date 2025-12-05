import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        int diff=Integer.MAX_VALUE;

        int sum=0;
        for(int k : arr){
            sum+=k;
        }

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int k=sum-arr[i]-arr[j];
                diff = Math.min(diff, Math.abs(s-k));
            }
        }
        System.out.println(diff);

    }
}