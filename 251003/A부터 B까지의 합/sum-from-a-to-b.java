import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int sum=0;
        int A=sc.nextInt();
        int B=sc.nextInt();
        for(int i=A; i<=B; i++){
            sum+=i;
        }
        System.out.println(sum);

    }
}