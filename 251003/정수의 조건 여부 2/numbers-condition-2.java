import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        String res="";
        if(a==5){
            res="A";
        }
        if(a%2==0){
            res="B";
        }
        System.out.println(res);
    }
}