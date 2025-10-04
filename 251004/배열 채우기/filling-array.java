import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int[] arr = new int[10];
        int cnt=-1;
        while(sc.hasNext()){
            int a=sc.nextInt();
            if(a==0)
                break;
            arr[++cnt]=a;
        }
        for(int i=cnt; i>=0; i--)
            System.out.print(arr[i]+" ");
    }
}