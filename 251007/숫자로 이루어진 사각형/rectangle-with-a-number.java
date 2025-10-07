import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printN(n);
    }
    private static void printN(int a){
        int k=1;

        for(int i=0; i<a; i++){
            for(int j=0; j<a; j++){
                if(k==10) k=1;
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}