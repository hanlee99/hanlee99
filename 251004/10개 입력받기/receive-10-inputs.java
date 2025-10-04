import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt=-1;
        int[] arr = new int[10];
        int sum=0;
        while(sc.hasNext()){
            int a=sc.nextInt();
            if(a==0){
                break;
            }
            sum+=a;
            arr[++cnt]=a;
        }
        System.out.printf("%d %.1f",sum, (double)sum/(cnt+1));
    }
}