import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        String res = "Winter";

        if(a>=3&&a<=5){
            res="Spring";
        }else if(a>=6&&a<=8){
            res="Summer";
        }else if(a>=9&&a<=11){
            res="Fall";
        }
        System.out.println(res);
    }
}