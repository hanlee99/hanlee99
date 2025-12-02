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
        int[][] num = new int[n][5];
        for(int i=0; i<n; i++){
            int k=arr[i];
            int j=0;
            while(j<5){
                num[i][j] = k%10;
                k/=10;
                j++;
            }
        }

        for(int i=0; i<n-2; i++){
            
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    //System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    boolean flag = true;
                    int m=0;
                    while(m<5){
                        if(num[i][m]+num[j][m]+num[k][m] >9){
                            flag=false;
                            break;
                        }
                        m++;
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