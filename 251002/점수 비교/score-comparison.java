import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int Amath=sc.nextInt(); int Aeng=sc.nextInt();
        int Bmath=sc.nextInt(); int Beng=sc.nextInt();
        int n = (Amath>Bmath && Aeng>Beng) ? 1 :0;
        System.out.println(n);
    }
}