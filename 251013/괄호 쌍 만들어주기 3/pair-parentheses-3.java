import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final int MAX = Integer.MAX_VALUE;
        final int MIN = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // Please write your code here.
        int cnt=0;
        for(int i=0; i<str.length()-1; i++){
            char c = str.charAt(i);
            if(c==')') continue;

            for(int j=i+1; j<str.length(); j++){
                char o = str.charAt(j);
                if(o==')') cnt++;
            }
        }
        System.out.println(cnt);
    }
}