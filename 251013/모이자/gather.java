import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final int MAX = Integer.MAX_VALUE;
        final int MIN = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Please write your code here.
        int min=MAX;
        for(int i=0; i<n; i++){
            int m=0;

            for(int j=0; j<n; j++){
                if(i!=j) m+= a[j]*Math.abs(i-j);           
            }
            min = Math.min(min, m);
        }
        System.out.println(min);
    }
}