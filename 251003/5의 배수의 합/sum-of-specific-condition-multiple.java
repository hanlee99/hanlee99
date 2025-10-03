import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int sum=0;
        int A=sc.nextInt();
        int B=sc.nextInt();

        for(int i=Math.min(A,B); i<=Math.max(A,B); i++){
            if(i%5==0)
                sum+=i;
        }
        System.out.println(sum);

    }
}