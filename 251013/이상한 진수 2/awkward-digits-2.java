import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // Please write your code here.
        StringBuilder sb = new StringBuilder(a);
        int max=toDec(sb);
        for(int i=0; i<a.length(); i++){
            char ch = a.charAt(i)=='1' ? '0' : '1';
            sb.setCharAt(i, ch);
            max = Math.max(max, toDec(sb));
            sb.setCharAt(i, a.charAt(i));
        }
        System.out.println(max);
    }
    public static String toBinary(int n){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%2);
            n/=2;
        }
        return sb.reverse().toString();
    }
    public static int toDec(StringBuilder sb){
        int n=0;
        for(int i=0; i<sb.length(); i++){
            char c=sb.charAt(i);
            n = n*2 + (c-'0');
        }
        return n;
    }
}