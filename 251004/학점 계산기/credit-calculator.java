import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double sum=0;
        double avg=0;
        int cnt=0;
        while(sc.hasNext()){
            double a=sc.nextDouble();
            sum+=a;
            cnt++;
        }
        avg = sum/cnt;
        System.out.printf("%.1f\n", avg);
        String res;
        if(avg >= 4.0){
            res="Perfect";
        }else if(avg >= 3.0){
            res="Good";
        }else{
            res="Poor";
        }
        System.out.println(res);
    }
}