import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);

        int res=1;

        while(sc.hasNext()){
            int a=sc.nextInt();
            if(a%3!=0){
                res=0;
                break;
            }
        }
        System.out.println(res);
    }
}