import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];

        while(sc.hasNext()){
            int a=sc.nextInt();
            arr[a-1]++;
        }
        for(int i=0; i<6; i++){
            System.out.println((i+1) + " - " + arr[i]);
        }
    }
}