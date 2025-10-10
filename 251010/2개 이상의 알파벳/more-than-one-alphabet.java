import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.

        System.out.println(diffTwo(A));
    }

    private static String diffTwo(String st){
        int cnt=0;
        char diff = '0';
        for(char c : st.toCharArray()){
            if(diff != c){
                cnt++;
                diff = c;
            }
        }
        return cnt>=2 ? "Yes" : "No";
    }
}