import java.util.Scanner;
import java.util.ArrayDeque;
public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] dx = new int[]{-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = new int[]{1, 2, 2, 1, -1, -2, -2, -1};
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        int[][] visited = new int[n+1][n+1];
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        // Please write your code here.
        queue.offer(new int[]{r1,c1});
        int cnt=-1;
        boolean flag=false;
        while(!queue.isEmpty()){
            int[] curr = queue.poll();

            for(int dir=0; dir<8; dir++){
                int nx=curr[0]+dx[dir];
                int ny=curr[1]+dy[dir];

                if(isRange(nx,ny) && visited[nx][ny]==0){
                    if(nx==r2 && ny==c2){
                        cnt=visited[curr[0]][curr[1]]+1;
                        flag=true;
                        break;
                    }
                    visited[nx][ny] = visited[curr[0]][curr[1]]+1;
                    queue.offer(new int[]{nx,ny});
                }
            }
            if(flag) break;
        }
        System.out.println(cnt);

    }
    private static boolean isRange(int x, int y){
        return (x>0 && x<=n && y>0 && y<=n);
    }
}