import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        String res;
        if(a>=100){
            res="vapor";
        }else if(a>=0){
            res="water";
        }else{
            res="ice";
        }
        System.out.println(res);
    }
}