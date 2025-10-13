import java.util.Scanner;
public class Main {
    static char[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        // Please write your code here.
        int cnt=0;
        char cur = grid[0][0];
        for(int i=1; i<R-1; i++){
            for(int j=1; j<C-1; j++){

                if(grid[i][j] == 'W') continue;
                cur=grid[i][j];
                for(int a=i+1; a<R-1; a++){
                    for(int b=j+1; b<C-1; b++){
                        if(grid[a][b]=='W') cnt++;
                    }
                }
                
            }
        }
        System.out.println(cnt);
    }
    
}