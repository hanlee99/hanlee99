import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        String res;

        if(a%4==0){
            res = !(a%100==0&&a%400!=0) ? "true" : "false";
        }else{
            res="false";
        }

        System.out.println(res);
    }
}