import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=0;    int y=0;
        int[] dx = new int[]{-1, 0, 0, 1};
        int[] dy = new int[]{0, -1, 1, 0};
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            // Please write your code here.
            int d=0;
            if(direction=='W')  d=0;
            else if(direction=='S') d=1;
            else if(direction=='N') d=2;
            else if(direction=='E') d=3;

            x+=dx[d]*distance;  
            y+=dy[d]*distance;
        }   
        System.out.println(x+" "+y);
    }
}