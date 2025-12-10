import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};
        int[][] grid = new int[n+1][n+1];
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // Please write your code here.
        list.add(grid[r][c]);
        boolean flag=true;
        while(flag){
            flag=false;
            for(int dir=0; dir<4; dir++){
                int nr=r+dx[dir];
                int nc=c+dy[dir];
                if(isRange(nr, nc) && grid[r][c]<grid[nr][nc]){
                    list.add(grid[nr][nc]);
                    r=nr;   c=nc;
                    flag=true;
                    break;
                }
            }
        }
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
    private static boolean isRange(int x, int y){
        return (x>=1 && x<=n && y>=1 && y<=n);
    }
}