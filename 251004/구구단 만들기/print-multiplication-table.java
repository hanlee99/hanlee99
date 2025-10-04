import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        
        for(int i=1; i<=9; i++){
            int cnt=0;
            for(int j=B; j>=A; j--){
                
                if(j%2==0){
                    if(cnt>0){
                        System.out.print(" / ");
                    }
                    System.out.print(j+" * "+i+" = "+i*j);
                    cnt++;
                }
            }
            System.out.println();
        }
    }
}