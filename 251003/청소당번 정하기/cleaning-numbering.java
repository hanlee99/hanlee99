import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int twoCnt=0;
        int threeCnt=0;
        int twelveCnt=0;

        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i%12==0){
                twelveCnt++;
            }else if(i%3==0){
                threeCnt++;
            }else if(i%2==0){
                twoCnt++;
            }
        }

        System.out.println(twoCnt + " "+threeCnt+" "+twelveCnt);

    }
}