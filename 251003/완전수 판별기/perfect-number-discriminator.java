import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int check=1;
        int A=sc.nextInt();
        
        for(int i=2; i<=A/2; i++){
            if(A%i==0){
                check+=i;
            }
        }
        String res = (check==A) ? "P" : "N";
        System.out.println(res);

    }
}