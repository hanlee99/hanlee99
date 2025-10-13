import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final int MAX = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int min=MAX;
        for(int i=0; i<n; i++){
            int sum=0;
            int dist=0;
            int cur=1;
            for(int j=1; j<n; j++){
                sum+=arr[(i+j)%n]*j;
            }
            min = Math.min(sum, min);
        }
        System.out.println(min);
    }
}