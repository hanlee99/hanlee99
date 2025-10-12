import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        int n=toDec(binary)*17;
        String res = toBinary(n);
        System.out.println(res);
    }

    private static String toBinary(int n){
        StringBuilder sb = new StringBuilder();
        do{ 
            sb.append(n%2);
            n/=2;
        }while(n>0);
        return sb.reverse().toString();
    }
    private static int toDec(String b){
        int n=0;
        for(int i=0; i<b.length(); i++){
            int k = b.charAt(i)=='1' ? 1 : 0;
            n = n*2 + k;
        }
        return n;
    }
}