import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printHelloWorld(n);
    }

    private static void printHelloWorld(int N){
        if(N==0) return;
        printHelloWorld(N-1);
        System.out.println("HelloWorld");
    }
}