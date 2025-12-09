import java.util.Scanner;
import java.util.ArrayDeque;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        boolean[][] visited = new boolean[n][m];
        int[][] len = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        // Please write your code here.
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;
        int shortLen = Integer.MAX_VALUE;

        while(!queue.isEmpty()){
            int[] curr = queue.poll();

            for(int dir=0; dir<4; dir++){
                int nx=curr[0]+dx[dir];
                int ny=curr[1]+dy[dir];

                if(isRange(a, nx, ny) && !visited[nx][ny] && a[nx][ny]==1){
                    len[nx][ny] = len[curr[0]][curr[1]] + 1;
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
        int answer = (visited[n-1][m-1]) ? len[n-1][m-1] : -1;
        System.out.println(answer);
    }

    private static boolean isRange(int[][] a,int x, int y){
        return (x>=0 && x<a.length && y>=0 && y<a[x].length);
    }
}