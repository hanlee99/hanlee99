import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt();

        for(int i=N; i<=100; i++){
            String res="";
            if(i>=90){
                res="A";
            }else if(i>=80){
                res="B";
            }else if(i>=70){
                res="C";
            }else if(i>=60){
                res="D";
            }else {
                res="F";
            }
            System.out.print(res+" ");
        }

    }
}