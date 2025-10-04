import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int under=0;
        int over=1000;

        for(int i=0; i<10; i++){
            int a=sc.nextInt();
            if(a<500){
                under = Math.max(under, a);
            }else if(a>500){
                over = Math.min(over, a);
            }
        }

        System.out.println(under + " " + over);
    }
}