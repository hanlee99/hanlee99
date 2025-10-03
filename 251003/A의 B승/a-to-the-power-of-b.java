import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int sum=1;
        int A=sc.nextInt();
        int B=sc.nextInt();
        
        for(int i=0; i<B; i++){
            sum*=A;
        }
        System.out.println(sum);

    }
}