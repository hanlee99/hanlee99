import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int a=sc.nextInt();
            String res="";
            if(a>25){
                res="Lower";
            }else if(a==25){
                System.out.println("Good");
                break;
            }else{
                res="Higher";
            }
            System.out.println(res);
        }

    }
}