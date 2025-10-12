import java.util.Scanner;
public class Main {
    public static final int MAX_N = 200;
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
        int[][] board = new int[MAX_N][MAX_N];
        for(int k=0; k<n; k++){
            x[k] += MAX_N/2;
            y[k] += MAX_N/2;
            for(int i=x[k]; i<x[k]+8; i++){
                for(int j=y[k]; j<y[k]+8; j++){
                    board[i][j] = 1;
                }
            }
        }
        int area = 0;
        for (int i=0; i<MAX_N; i++){
            for(int j=0; j<MAX_N; j++){
                if(board[i][j] == 1) area++;
            }
        }
        System.out.println(area);
    }
}