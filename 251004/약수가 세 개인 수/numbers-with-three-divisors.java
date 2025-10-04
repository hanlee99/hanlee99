import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int cnt=0;

        for(int i=start; i<=end; i++){
            int sum= i==1 ? 1 : 2;
            for(int j=2; j<=i/2; j++){
                if(i%j==0){
                    sum++;
                }
                if(sum>3){
                    break;
                }
            }
            if(sum==3){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}