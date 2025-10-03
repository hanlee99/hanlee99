import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A=sc.nextInt();
        int B=sc.nextInt();
        for(int i=1; i<=A; i++){
            int res = i%B==0 ? 1 : 0;
            System.out.println(res);
        }

    }
}