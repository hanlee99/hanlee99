import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int aTotalTime=0;    int bTotalTime=0;
        int[] aTime=new int[n];   int[] bTime=new int[m];
        char[] aDir=new char[n];    char[] bDir=new char[m];

        for (int i = 0; i < n; i++) {
            aTime[i] = sc.nextInt();
            aDir[i] = sc.next().charAt(0);
            // Please write your code here.
            aTotalTime+=aTime[i];
        }
        
        for (int i = 0; i < m; i++) {
            bTime[i] = sc.nextInt();
            bDir[i] = sc.next().charAt(0);
            // Please write your code here.
            bTotalTime += bTime[i];
        }
        
        int[] aTimeLine = new int[aTotalTime+1];
        int[] bTimeLine = new int[bTotalTime+1];
        int idx=1;
        for(int i=0; i<n; i++){
            int sign = aDir[i]=='R' ? 1 : -1;
            int t = aTime[i];
            for(int j=0; j<t; j++){
                aTimeLine[idx] = aTimeLine[idx-1]+sign;
                idx++;
            }
        }

        idx=1;
        for(int i=0; i<m; i++){
            int sign = bDir[i]=='R' ? 1 : -1;
            int t = bTime[i];
            for(int j=0; j<t; j++){
                bTimeLine[idx] = bTimeLine[idx-1]+sign;
                idx++;
            }
        }
        int total = Math.max(aTotalTime, bTotalTime);
        int lastA = aTimeLine[aTotalTime];
        int lastB = bTimeLine[bTotalTime];

        int cnt=0;
        boolean visited = false;

        for(int i=1; i<=total; i++){
            int apos = (i<=aTotalTime) ? aTimeLine[i] : lastA;
            int bpos = (i<=bTotalTime) ? bTimeLine[i] : lastB;

            if(apos == bpos){
                if(!visited) cnt++;
                visited=true;
            }else  visited=false;
            //System.out.println("<"+i+"> "+aTimeLine[i]+" "+bTimeLine[i]+" "+cnt+" ");
        }
        //System.out.println("\n");
        
        System.out.println(cnt);
        // Please write your code here.
    }
}