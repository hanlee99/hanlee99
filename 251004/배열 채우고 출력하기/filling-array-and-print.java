import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int sum=0;
        StringBuilder sb = new StringBuilder();

        while(sc.hasNext()){
            String a=sc.next();
            if(!a.equals(" "))
                sb.append(a);
        }
        System.out.println(sb.reverse().toString());
    }
}