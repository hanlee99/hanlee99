import java.util.Scanner;
public class Main {
    public static final int MAX_N = 200;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        int[][] board = new int[MAX_N][MAX_N];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();
        }
        // Please write your code here.
        for(int k=0; k<n; k++){
            int maxX = Math.max(x1[k], x2[k])+100;
            int minX = Math.min(x1[k], x2[k])+100;
            int maxY = Math.max(y1[k], y2[k])+100;
            int minY = Math.min(y1[k], y2[k])+100;

            for(int i=minX; i<maxX; i++){
                for(int j=minY; j<maxY; j++){
                    board[i][j] = 1;
                }
            }
        }
        int sum=0;
        for(int i=0; i<MAX_N; i++){
            for(int j=0; j<MAX_N; j++){
                if(board[i][j]==1) sum++;
            }
        }
        System.out.println(sum);
    }
}