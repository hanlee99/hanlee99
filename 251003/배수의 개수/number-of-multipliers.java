import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int threeCnt=0;
        int fiveCnt=0;

        while(sc.hasNext()){
            int n=sc.nextInt();
            if(n%3==0){
                threeCnt++;
            }
            if(n%5==0){
                fiveCnt++;
            }
        }
        System.out.println(threeCnt + " " + fiveCnt);
    }
}