import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt();
        int M=sc.nextInt();
        int cnt=0;

        while(sc.hasNext()){
            int a=sc.nextInt();
            if(a==M) cnt++;
        }
        System.out.println(cnt);

    }
}