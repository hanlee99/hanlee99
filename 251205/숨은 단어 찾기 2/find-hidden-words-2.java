import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String st = sc.next();
            for(int j=0; j<m; j++){
                arr[i][j] = st.charAt(j);
            }
        }
        int count=0;

        int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
        // Please write your code here.
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                char c=arr[i][j];
                if(c!='L') continue;

                for(int dir=0; dir<8; dir++){
                    int nx1=i+dx[dir];
                    int nx2=i+dx[dir]*2;
                    int ny1=j+dy[dir];
                    int ny2=j+dy[dir]*2;
                    if(nx2>=0 && nx2<n && ny2>=0 && ny2<m){
                        if(arr[nx1][ny1] == 'E' && arr[nx2][ny2] == 'E'){
                            count++;
                        }
                    }
                }
            }

        }

        System.out.println(count);
    }

}