import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int cnt=0;
        int[] arr = new int[10];
        while(sc.hasNext()){
            int a=sc.nextInt();
            if(a==0)    break;
            if(a%2==0){
                sum+=a;
                cnt++;
            }
        }
        System.out.println(cnt + " " + sum);
    }
}