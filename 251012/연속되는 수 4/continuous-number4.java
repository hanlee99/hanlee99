import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int cnt=0;
        int max=0; 
        int k=-1;
        for(int i=0; i<n; i++){
            if(k<arr[i]){
                cnt++;
                k=arr[i];
            }else{
                cnt=1;
                k=arr[i];
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}