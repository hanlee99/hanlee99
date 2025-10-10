import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.

        Clear clear = new Clear(uCode, lColor, time);
        System.out.println("code : " + clear.uCode + "\n" +
                           "color : " + clear.lColor + "\n" +
                           "second : " + clear.time);
    }
}

class Clear{
    String uCode;
    char lColor;
    int time;

    Clear(String uCode, char lColor, int time){
        this.uCode = uCode;
        this.lColor = lColor;
        this.time = time;
    }
}