import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int diff=Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                diff = Math.min(diff, dist(x[i],x[j],y[i],y[j]));
            }
        }
        System.out.println(diff);
    }

    private static int dist(int x1, int x2, int y1, int y2){
        return (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
    }
}