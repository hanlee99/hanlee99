import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble();
        
        String res;

        if(a>=1.0){
            res="High";
        }else if(a>=0.5){
            res="Middle";
        }else{
            res="Low";
        }
        System.out.println(res);
    }
}