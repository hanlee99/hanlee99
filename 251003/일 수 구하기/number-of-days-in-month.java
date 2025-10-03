import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int res=0;
        int a=sc.nextInt();
        switch(a){
            case 2:
            res=28;
            break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            res=31;
            break;
            case 4:
            case 6:
            case 9:
            case 11:
            res=30;
            break;
        }
        System.out.println(res);
    }
}