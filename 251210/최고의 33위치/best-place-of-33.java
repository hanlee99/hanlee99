import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int cnt=0;
        for(int i=0; i<=n-3; i++){
            for(int j=0; j<=n-3; j++){
                int coins=0;
                for(int x=0; x<3; x++){
                    for(int y=0; y<3; y++){
                        coins+=grid[i+x][j+y];
                    }
                }
                cnt = Math.max(cnt, coins);
            }
        }
        System.out.println(cnt);
    }
}