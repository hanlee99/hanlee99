import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        while(sc.hasNext()){
            String s = sc.next();
            if(s!=" "){
                int n = Integer.parseInt(s);
                System.out.print(n*n +" ");
            }
        }
    }

}