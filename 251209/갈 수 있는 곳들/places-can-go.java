import java.util.Scanner;
import java.util.ArrayDeque;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] grid = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        ArrayDeque<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            queue.offer(new int[]{x-1,y-1});
            visited[x-1][y-1] = true;
        }
        // Please write your code here.
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            
            for(int dir=0; dir<4; dir++){
                int nx = curr[0] + dx[dir];
                int ny = curr[1] + dy[dir];
                if(canDo(grid, visited, nx, ny)){
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
        int cnt=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(visited[i][j]) cnt++;
            }
        }
        System.out.println(cnt);

    }
    private static boolean canDo(int[][] grid, boolean[][] visited,int x, int y){
        return (isRange(grid, x, y) && grid[x][y]==0 && !visited[x][y]);
    }
    private static boolean isRange(int[][] grid, int x, int y){
        return (x>=0 && x<grid.length && y>=0 && y<grid[x].length);
    }
}