import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        // Please write your code here.
        int cnt=0;

        for(int i=0; i<n-2; i++){
            if(str.charAt(i) != 'C') continue;
            int oCnt=0;
            for(int j=i+1; j<n; j++){
                if(str.charAt(j) == 'O'){
                    oCnt++;
                }else if(str.charAt(j) == 'W'){
                    cnt+=oCnt;
                }
            }
        }
        
        System.out.println(cnt);

    }
}