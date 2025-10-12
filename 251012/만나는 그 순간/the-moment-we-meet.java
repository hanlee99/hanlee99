import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] Atime = new int[n];
        char[] direction = new char[n];
        int sum=0;
        for(int i=0; i<n; i++){
            direction[i] = sc.next().charAt(0);
            Atime[i] = sc.nextInt();
            sum+=Atime[i];
        }
        // Please write your code here.
        int[] AtimeLine = new int[sum+1];
        int[] BtimeLine = new int[sum+1];
        int idx=1;
        for(int i=0; i<n; i++){
            int sign = direction[i] == 'R' ? 1 : -1;
            int time = Atime[i];
            for(int j=0; j<time; j++){
                AtimeLine[idx] = AtimeLine[idx-1]+sign;
                idx++;
            }
        }
        idx=1;
        for(int i=0; i<m; i++){
            int sign = sc.next().charAt(0)=='R' ? 1 : -1;
            int time = sc.nextInt();

            for(int j=0; j<time; j++){
                BtimeLine[idx] = BtimeLine[idx-1]+sign;
                idx++;
            }
        }
        int res=-1;
        for(int i=1; i<=sum; i++){
            if(AtimeLine[i] == BtimeLine[i]){
                res=i;
                break;
            }
        }
        System.out.println(res);

    }
}