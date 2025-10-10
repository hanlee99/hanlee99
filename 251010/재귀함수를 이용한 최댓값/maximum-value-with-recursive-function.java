import java.util.Scanner;
public class Main {
    private static int[] array;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        array=arr;
        System.out.println(maxInArray(arr.length-1));
    }
    private static int maxInArray(int n){
        if(n==0) return array[n];

        return Math.max(array[n], maxInArray(n-1));
    }
}