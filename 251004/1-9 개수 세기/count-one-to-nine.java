import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int N=sc.nextInt();
        
        while(sc.hasNext()){
            int a=sc.nextInt();

            arr[a-1]++;
        }
        for(int a : arr)
            System.out.println(a);
    }
}