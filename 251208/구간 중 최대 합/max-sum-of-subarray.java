import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        int max=0;
        for(int i=0; i<=n-k; i++){
            int m=0;
            for(int j=0; j<k; j++){
                m+=arr[i+j];
            }
            max = Math.max(max, m);
        }
        System.out.println(max);
    }
}