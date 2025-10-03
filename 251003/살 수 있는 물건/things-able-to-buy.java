import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        String res;

        if(a>=3000){
            res="book";
        }else if(a>=1000){
            res="mask";
        }else{
            res="no";
        }
        System.out.println(res);
    }
}