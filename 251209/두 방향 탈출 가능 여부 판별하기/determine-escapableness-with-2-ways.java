import java.util.Scanner;
public class Main {
    public static int[][] grid;
    public static boolean[][] visited;
    public static final int[] dx = {1, 0};
    public static final int[] dy = {0, 1};

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
        dfs(0, 0);
        int answer = visited[n-1][m-1]==true ? 1 : 0;
        System.out.println(answer);

    }
    private static void dfs(int row, int col){
        visited[row][col] = true;

        for(int i=0; i<2; i++){
            int x=row+dx[i];
            int y=col+dy[i];
            if( isRange(x, y) && grid[x][y] == 1 
                    && !visited[x][y]){
                dfs(x, y);
            }
        }
    }
    private static boolean isRange(int r, int c){
        if(r>=0 && r<grid.length && c>=0 && c<grid[r].length){
            return true;
        }
        return false;
    }
}