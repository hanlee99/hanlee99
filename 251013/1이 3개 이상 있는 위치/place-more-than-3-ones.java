import java.util.Scanner;
public class Main {
    public static int arrN;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int cnt=0;
        arrN=n;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int count=0;

                for(int k=0; k<4; k++){
                    int nx=i+dx[k]; int ny=j+dy[k];
                    if(inRange(nx,ny) && arr[nx][ny]==1) 
                        count++;
                }
                if(count>=3) cnt++;
            }
        }
        System.out.println(cnt);
    }
    private static boolean inRange(int x, int y){
        if(x>=0 && x<arrN && y>=0 && y<arrN)
            return true;
        return false;
    }
}