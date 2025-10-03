import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int aAge=sc.nextInt();
        String aGender=sc.next();
        int bAge=sc.nextInt();
        String bGender=sc.next();
        int res=(aAge>=19&&aGender.equals("M")) ||
            (bAge>=19&&bGender.equals("M")) ? 1 : 0;


        System.out.println(res);
    }
}