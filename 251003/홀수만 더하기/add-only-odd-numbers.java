import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int sum=0;
        int N=sc.nextInt();
        while(sc.hasNext()){
            int a=sc.nextInt();
            sum+=a;
        }
        System.out.println(sum);

    }
}