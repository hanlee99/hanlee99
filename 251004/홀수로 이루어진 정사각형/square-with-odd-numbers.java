import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int num=11;

        for(int i=1; i<=N; i++){
            int num2 = num;
            for(int j=1; j<=N; j++){
                System.out.print(num2+" ");
                num2+=2;
            }
            System.out.println();
            num+=2;
        }
    }
}