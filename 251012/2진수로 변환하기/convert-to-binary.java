import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
    
    StringBuilder sb = new StringBuilder();
    do{
        sb.append(n%2);
        n/=2;
    }while(n>0);
    System.out.println(sb.reverse().toString());
    }
}