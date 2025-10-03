import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            String c=sc.next();
            System.out.println(a*b);
            if(c.equals("C"))
                break;
        }

    }
}