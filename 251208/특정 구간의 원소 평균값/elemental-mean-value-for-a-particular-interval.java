import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int cnt=0;

        for(int i=0; i<n; i++){
            int comp=0;
            int count=0;
            for(int j=i; j<n; j++){
                comp+=arr[j];
                count++;
                double avg=(double)comp/count;
                for(int k=i; k<=j; k++){
                    if(avg==(double)arr[k]){
                        cnt++;
                        break;
                    }
                }

            }
        }
        System.out.println(cnt);
    }
}