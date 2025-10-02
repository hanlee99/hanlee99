import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int gender = sc.nextInt();
        int age = sc.nextInt();
        String st;
        if(gender == 0){
            if(age>=19) st="MAN";
            else st="BOY";
        }else{
            if(age>=19) st="WOMAN";
            else st="GIRL";
        }
        System.out.print(st);
    }
}