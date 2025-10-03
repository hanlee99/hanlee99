import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt();
        
        while(sc.hasNext()){
            int a = sc.nextInt();
            if(a%2!=0 && a%3==0){
                System.out.println(a);
            }
        }

    }
}