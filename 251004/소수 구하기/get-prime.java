import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt=0;

        for(int i=2; i<=N; i++){
            int sum=2;
            for(int j=2; j<=i/2; j++){
                if(i%j==0){
                    sum++;
                    break;
                }
            }
            if(sum==2){
                System.out.print(i + " ");
            }
        }

    }
}