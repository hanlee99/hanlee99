import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=1;
        while(b*3<=a){
            System.out.print(b*3+" ");
            b++;
        }

            
    }
}