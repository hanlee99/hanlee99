import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int cnt=1;
        int max=arr[arr.length-1];
        for(int i=N-2; i>=0; i--){
            if(arr[i] == max) cnt++;
            else{
                if(cnt==1) break;
                else {
                    cnt=1;
                    max=arr[i];
                }
            }

        }
        if(cnt!=1) max=-1;
        System.out.println(max);

    }
}