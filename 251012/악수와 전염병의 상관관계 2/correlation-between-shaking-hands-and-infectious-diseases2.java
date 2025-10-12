import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();
        int[][] shakes = new int[T][3];
        int[] carrier = new int[N+1];
        carrier[P] = K;
        for (int i = 0; i < T; i++) {
            shakes[i][0] = sc.nextInt();
            shakes[i][1] = sc.nextInt();
            shakes[i][2] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(shakes, (a,b) -> {
            return a[0]-b[0];
        });
        for(int i=0; i<shakes.length; i++){
            int x=shakes[i][1];
            int y=shakes[i][2];
            if(carrier[x]!=0 && carrier[y]!=0){
                carrier[x] = carrier[x]-1==0 ? -1 : carrier[x]-1;
                carrier[y] = carrier[y]-1==0 ? -1 : carrier[y]-1;
            }else if(carrier[x]!=0 && carrier[x]!=-1){
                carrier[x] = carrier[x]-1==0 ? -1 : carrier[x]-1;
                carrier[y] = K;
            }else if(carrier[y]!=0 && carrier[y] !=-1){
                carrier[y] = carrier[y]-1==0 ? -1 : carrier[y]-1;
                carrier[x] = K; 
            }
            //System.out.println(x +" "+y+" "+carrier[x]+" "+carrier[y]);
        }
        //System.out.println();
        for(int i=1; i<=N; i++){
            if(carrier[i] == 0) System.out.print(0);
            else System.out.print(1);
        }

    }
}