import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // Please write your code here.

        int sign=arr[0]>=0 ? 1 : -1;
        int max=1;
        int cnt=1;
        for(int i=1; i<n; i++){
            if(sign == arr[i]/Math.abs(arr[i])){
                cnt++;
            }else{
                sign = arr[i] >=0 ? 1 : -1;
                cnt=1;
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}