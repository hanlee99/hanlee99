import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int[][] dp = new int[n][n];
        int[] dx = new int[]{0, 1};
        int[] dy = new int[]{1, 0};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        dp[0][0] = matrix[0][0];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int dir=0; dir<2; dir++){
                    int nx=i+dx[dir];
                    int ny=j+dy[dir];
                    if(isRange(nx, ny, n)){
                        dp[nx][ny] = Math.max(dp[nx][ny],
                            dp[i][j]+matrix[nx][ny]);
                    }
                }
            }
        }
        System.out.println(dp[n-1][n-1]);
    }
    private static boolean isRange(int x, int y, int n){
        return (x>=0 && x<n && y>=0 && y<n);
    }
}