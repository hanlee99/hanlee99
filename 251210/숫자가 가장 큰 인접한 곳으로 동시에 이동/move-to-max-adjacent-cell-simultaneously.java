import java.util.Scanner;
import java.util.ArrayDeque;
public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        ArrayDeque<int[]> delete = new ArrayDeque<>();

        int[][] grid = new int[n+1][n+1];
        int[][] bead = new int[n+1][n+1];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        int[][] marbles = new int[m][2];
        for (int i = 0; i < m; i++) {
            marbles[i][0] = sc.nextInt();
            marbles[i][1] = sc.nextInt();
            queue.offer(new int[]{marbles[i][0],marbles[i][1]});
        }
        // Please write your code here.
        for(int i=0; i<t; i++){

            while(!queue.isEmpty()){
                int[] p=queue.poll();
                int[] goal = new int[]{0,0};
                
                for(int dir=0; dir<4; dir++){
                    int nx=p[0]+dx[dir];
                    int ny=p[1]+dy[dir];
                    if(isRange(nx,ny) && grid[goal[0]][goal[1]] < grid[nx][ny]){
                        goal[0]=nx;
                        goal[1]=ny;
                    }
                }
                bead[goal[0]][goal[1]]++;
                delete.offer(goal);
            }
            while(!delete.isEmpty()){
                int[] goal = delete.poll();
                int x=goal[0];
                int y=goal[1];
                if(bead[x][y]==1){
                    queue.offer(new int[]{x,y});
                    bead[x][y]=0;
                }else {
                    bead[x][y]=0;
                }
            }
        }
        System.out.println(queue.size()); 
    

    }
    private static boolean isRange(int x, int y){
        return (x>0 && x<=n && y>0 && y<=n);
    }

}