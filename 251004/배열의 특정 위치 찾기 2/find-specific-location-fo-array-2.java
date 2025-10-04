import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int cnt=0;
        int oddSum=0;
        int evenSum=0;
        int[] arr = new int[10];
        while(sc.hasNext()){
            int a=sc.nextInt();
            arr[cnt++] = a;
        }
        for(int i=0; i<10; i++){
            if(i%2==0) oddSum+=arr[i];
            else    evenSum+=arr[i];
        }
        int res = Math.max(oddSum,evenSum) - Math.min(oddSum, evenSum);
        System.out.println(res);
    }
}