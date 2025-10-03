import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int start=sc.nextInt();
        int end = sc.nextInt();

        int result=0;
        for(int i=start; i<=end; i++){
            int count=2;
            
            for(int j=2; j<=i/2; j++){
                if(i%j == 0){
                    count++;
                }
                if(count>3){
                    break;
                }
            }
            if(count==3){
                result++;
            }
        }
        System.out.println(result);

    }
}