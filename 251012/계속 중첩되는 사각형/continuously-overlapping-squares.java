import java.util.Scanner;
public class Main {
    public static final int MAX_N = 200;
    public static final int OFFSET = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[MAX_N][MAX_N];
        int n = sc.nextInt();
        for (int k = 0; k < n; k++) {
            int x1 = sc.nextInt()+OFFSET;
            int y1 = sc.nextInt()+OFFSET;
            int x2 = sc.nextInt()+OFFSET;
            int y2 = sc.nextInt()+OFFSET;
            int color = k%2==0 ? 1 : 2;
            for(int i=x1; i<x2; i++){
                for(int j=y1; j<y2; j++){
                    board[i][j] = color;
                }
            }
        }
        // Please write your code here.
        int cnt=0;
        for(int i=0; i<MAX_N; i++){
            for(int j=0; j<MAX_N; j++){
                if(board[i][j] == 2) cnt++;
            }
        }
        System.out.println(cnt);
    }
}