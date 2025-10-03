import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        String head=a/b+"";
        a%=b;
        String tail="";

        while(tail.length()<20){
            a*=10;
            if(a==0){
                tail+="0";
            }else{
                while(a<b){
                    tail+="0";
                    a*=10;
                }
                tail+=a/b;
                a%=b;
            }
        }
        String st = head + "." + tail;
        System.out.printf(st);
    }
}