import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int diff = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            arr[i]*=2;
            
            for(int j=0; j<n; j++){
                if(i==j) continue;
                int prev= -1;
                int sum=0;
                for(int k=0; k<n; k++){
                    if(k == j) continue;

                    if(prev != -1){
                        sum += Math.abs(arr[k]-arr[prev]);
                    }
                    prev=k;
                }
                diff = Math.min(diff, sum);
            }
            arr[i]/=2;
        }
        System.out.println(diff);
    }
}