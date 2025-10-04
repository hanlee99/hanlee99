import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int cnt=0;
        int sum=0;
        int[] arr = new int[10];
        while(sc.hasNext()){
            int a=sc.nextInt();
            arr[cnt++] = a;
        }
        for(int i=1; i<10; i++){
            if(arr[i]%3==0){
                System.out.println(arr[i-1]);
                break;
            }
        }
    }
}