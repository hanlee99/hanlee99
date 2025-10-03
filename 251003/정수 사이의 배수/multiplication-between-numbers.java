import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int sum=0;
        int cnt=0;
        int A=sc.nextInt();
        int B=sc.nextInt();

        for(int i=A; i<=B; i++){
            if(i%5==0 || i%7==0){
                cnt++;
                sum+=i;
            }
        }
        System.out.printf("%d %.1f",sum , (double)sum/cnt);

    }
}