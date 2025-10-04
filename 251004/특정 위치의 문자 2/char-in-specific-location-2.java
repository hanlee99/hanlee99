import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int cnt=0;
        int sum=0;
        String[] arr = new String[10];
        while(sc.hasNext()){
            String a=sc.next();
            arr[cnt++] = a;
            
        }
        System.out.println(arr[1] + " " + arr[4] + " " + arr[7]);
    }
}