import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        int colNum = sc.nextInt();
        // Please write your code here.
        printN(rowNum, colNum);
    }

    private static void printN(int a, int b){
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print("1");
            }
            System.out.println();
        }
    }
}