import java.util.Scanner;

public class Main {
    int[] array;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        System.out.println(leastCommonMultiple(arr));
    }
    private static int leastCommonMultiple(int[] arr){
        int least = arr[0];
        for(int i=1; i<arr.length; i++){
            least = least/getGcd(arr[i], least)*arr[i];
        }
        return least;
    }
    private static int getGcd(int a, int b){
        if(b==0) return a;

        return getGcd(b, a%b);
    }
}