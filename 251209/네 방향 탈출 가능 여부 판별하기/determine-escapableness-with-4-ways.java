import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Arrays;
public class Main {
    static final int[] dx = {1, 0, -1, 0};
    static final int[] dy = {0, -1, 0, 1};
    static int[][] grid;
    static boolean[][] visited;
    static ArrayDeque<int[]> queue = new ArrayDeque<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        grid = new int[n][m];
        visited = new boolean[n][m];
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;

        while(!queue.isEmpty()){
            int[] curr = queue.poll();

            for(int dir=0; dir<4; dir++){
                int nx=curr[0]+dx[dir];
                int ny=curr[1]+dy[dir];
                
                if(isRange(nx, ny) && 
                   grid[nx][ny]==1 && !visited[nx][ny]){
                    queue.offer(new int[]{nx,ny});
                    visited[nx][ny] = true;
                }
            }
        }

        int answer = visited[n-1][m-1] ? 1 : 0;
        System.out.println(answer);
    }
    private static boolean isRange(int x, int y){
        return (x>=0 && x<grid.length && 
                y>=0 && y<grid[x].length);
    }
}