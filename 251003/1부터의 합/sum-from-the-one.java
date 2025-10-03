import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum=0;
        int i=1;
        while(sum+i<N){
            sum+=i;
            i++;
        }
        System.out.println(i);
    }
}