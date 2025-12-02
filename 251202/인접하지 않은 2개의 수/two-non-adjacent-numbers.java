import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int largest = 0;

        for(int i=0; i<arr.length-2; i++){
            for(int j=i+2; j<arr.length; j++){
                largest = Math.max(largest, arr[i]+arr[j]);
            }
        }
        System.out.println(largest);
    }
}