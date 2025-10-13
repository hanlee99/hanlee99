import java.util.Scanner;
public class Main {
    public static int arrN;
    public static int arrM;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int r=0;
        int c=-1;
        arrN=n; arrM=m;
        int[][] arr = new int[n][m];
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int dir = 0;
        int num=1;
        for(int i=1; i<=n*m; i++){
            int nr = r+dr[dir];
            int nc = c+dc[dir];
            if(!isRange(nr, nc) || arr[nr][nc] != 0){
                dir = (dir+1)%4;
            }
            
            r+=dr[dir]; c+=dc[dir];
            arr[r][c] = i;
            //System.out.println(nr+" "+nc+" "+dir);
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isRange(int r, int c){
        if(r>=0 && r<arrN && c>=0 && c<arrM){
            return true;
        }
        return false;
    }
}