import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(a+" ");
        int b = sc.nextInt();
        System.out.print(b + " ");
        
        for(int i=0; i<8; i++){
            String st = (a+b) + "";
            System.out.print(st.charAt(st.length()-1) + " ");
            int sum=a+b;
            a=b;
            b=sum;
        }
        
    }
}