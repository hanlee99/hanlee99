import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double sum=0;
        while(sc.hasNext()){
            double a=sc.nextDouble();
            sum+=a;
        }
        System.out.printf("%.1f", (double)sum/8);
    }
}