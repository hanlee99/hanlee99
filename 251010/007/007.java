import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.
        Secret secret = new Secret(sCode, mPoint, time);
        System.out.println(secret.toString());
    }
}

class Secret{
    String sCode;
    char mPoint;
    int time;
    Secret(String sCode, char mPoint, int time){
        this.sCode = sCode;
        this.mPoint = mPoint;
        this.time = time;
    }
    @Override
    public String toString(){
        return "secret code : " + sCode +
               "\nmeeting point : " + mPoint +
               "\ntime : " + time; 
    }

}