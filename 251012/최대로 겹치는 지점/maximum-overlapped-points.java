import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }
        // Please write your code here.
        int[][] event = new int[n*2][2];
        int idx=0;
        for(int i=0; i<n*2; i++) {
            event[i][0]= (i<n) ? start[i] : end[idx++];
            event[i][1]= (i<n) ? 1 : -1;    
        }
        Arrays.sort(event, (a,b) ->  a[0]-b[0]);
        int max=0;
        int conflict=0;
        for(int i=0; i<event.length; i++){
            conflict+=event[i][1];
            max = Math.max(max, conflict);
        }
        System.out.println(max);
        
    }
}