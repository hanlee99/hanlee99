import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int cnt=0;
        int evenSum=0;
        double threeSum=0;
        int threeCnt=0;
        while(sc.hasNext()){
            int a=sc.nextInt();
            cnt++;
            if(cnt%2==0){
                evenSum+=a;
            }
            if(cnt%3==0){
                threeCnt++;
                threeSum+=(double)a;
            }
            
        }
        System.out.printf("%d %.1f", evenSum, threeSum/threeCnt);
    }
}