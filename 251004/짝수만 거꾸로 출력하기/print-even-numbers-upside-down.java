import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr = new int[N];
        int cnt=-1;
        int sum=0;
        while(sc.hasNext()){
            int a=sc.nextInt();
            if(a%2==0){
                arr[++cnt] = a;
            }
            
        }
        for(int i=cnt; i>=0; i--)
            System.out.print(arr[i]+" ");
    }
}