import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int i=arr.length-1;

        while(i>=0){
            int max=0;
            for(int j=0; j<=i; j++){
                max=Math.max(max, arr[i]);
            }
            for(int j=0; j<=i; j++){
                if(arr[j] == max){
                    System.out.print(j+1+" ");
                    i=j-1;
                    break;
                }
            }

        }
        
    }
}