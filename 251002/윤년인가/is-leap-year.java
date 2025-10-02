import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();

        boolean check=false;
        if(Y%4==0){
            if(!(Y%100==0 && Y%400!=0)) check = true;
        }

        System.out.print(check);
    }
}