import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        String res;
        if(a.equals("S")){
            res="Superior";
        }else if(a.equals("A")){
            res="Excellent";
        }else if(a.equals("B")){
            res="Good";
        }else if(a.equals("C")){
            res="Usually";
        }else if(a.equals("D")){
            res="Effort";
        }else{
            res="Failure";
        }     
        System.out.println(res);
    }
}