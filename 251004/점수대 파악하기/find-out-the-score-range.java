import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        while(sc.hasNext()){
            int a=sc.nextInt();
            if(a==0) break;
            if(a/10!=0)
                arr[a/10-1]++;
        }
        for(int i=9; i>=0; i--){
            System.out.println((i+1)*10 + " - " + arr[i]);
        }
    }
}