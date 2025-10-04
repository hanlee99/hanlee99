import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int cnt=-1;
        int sum=0;

        while(sc.hasNext()){
            int a=sc.nextInt();
            if(a==0){
                break;
            }
            arr[++cnt] = a;
        }

        System.out.println(arr[cnt]+arr[cnt-1]+arr[cnt-2]);
    }
}