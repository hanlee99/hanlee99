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
        
        int largest = -1;

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    //System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    boolean flag = true;
                    int a=arr[i];   int b=arr[j];   int c=arr[k];

                    for(int m=0; m<5; m++){
                        if( (a%10 + b%10 + c%10) > 9){
                            flag=false;
                            break;
                        }
                        a/=10;  b/=10;  c/=10;
                    }
                    if(flag){
                        largest = Math.max(largest, arr[i]+arr[j]+arr[k]);
                    }

                }
            }
        }

        System.out.println(largest);
    }
}