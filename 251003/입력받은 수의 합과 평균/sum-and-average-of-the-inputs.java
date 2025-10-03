import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int cnt=0;
        int sum=0;
        int N=sc.nextInt();
        
        while(sc.hasNext()){
            int a=sc.nextInt();
            sum+=a;
            cnt++;
        }
        System.out.printf("%d %.1f",sum, (double)sum/cnt);

    }
}