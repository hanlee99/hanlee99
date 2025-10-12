import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        int sum=0;
        for(int i=0; i<binary.length(); i++){
            int n = binary.charAt(i)=='1' ? 1 : 0;
            sum = sum*2 + n;
        }
        System.out.println(sum);
    }
}