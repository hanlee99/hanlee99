import java.util.Scanner;

public class Main {
    public static int arrN;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();
        String D = sc.next();
        // Please write your code here.
        int[] dx = {0, -1, 1, 0};
        int[] dy = {1, 0, 0, -1};
        int time=0;
        arrN=N;
        int dir = getDir(D.charAt(0));
        for(int i=1; i<=T; i++){
            int nx=R+dx[dir];
            int ny=C+dy[dir];
            if(isRange(nx, ny)){
                R=nx;
                C=ny;
            }else{
                dir=3-dir;
            }
        }
        System.out.println(R +" " + C);

    }
    public static int getDir(char d){
        int dir=0;
        if(d=='U'){
            dir=2;
        }else if(d=='D'){
            dir=1;
        }else if(d=='R'){
            dir=0;
        }else{
            dir=3;
        }
        return dir;
    }
    public static boolean isRange(int x, int y){
        if(x>0 && x<=arrN && y>0 && y<=arrN) return true;
        return false;
    }
}