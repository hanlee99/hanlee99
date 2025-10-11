import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = i+1;
        }
        // Please write your code here.
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0],b[0]));
        int[] change = new int[n];
        for(int i=0; i<n; i++){
            int idx = arr[i][1]-1;
            change[idx] = i+1;
        }
        for(int i=0; i<n; i++)
            System.out.print(change[i] + " ");
    }
}