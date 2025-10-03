import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int sum=0;
        int N=sc.nextInt();
        for(int i=N; i<=100; i++){
            sum+=i;
        }
        System.out.println(sum);

    }
}