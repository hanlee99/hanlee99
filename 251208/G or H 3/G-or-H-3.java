import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] point = new int[n];
        int[] score = new int[n];
        int max=0;
        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);
            max = Math.max(max, pos);
            point[i] = pos;
            if(c=='G') score[i]=1;
            if(c=='H') score[i]=2;
        }
        // Please write your code here.

        int[] lines = new int[max+1];
        for(int i=0; i<n; i++){
            lines[point[i]] = score[i];
        }
        int res=0;
        for(int i=1; i+k<=max; i++){
            int maxPoint=0;
            for(int j=0; j<=k; j++){
                maxPoint+=lines[i+j];
            }
            res = Math.max(res, maxPoint);
            //System.out.println(res+" "+maxPoint);
        }
        System.out.println(res);

    }
}