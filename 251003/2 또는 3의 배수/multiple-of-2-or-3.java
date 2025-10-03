import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A=sc.nextInt();
        for(int i=1; i<=A; i++){
            int res = i%2==0||i%3==0 ? 1 : 0;
            System.out.print(res+" ");
        }

    }
}