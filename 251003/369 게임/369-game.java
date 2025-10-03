import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt();
        for(int i=1; i<=N; i++){
            int res = i%3!=0 ? i : 0;
            
            String st = i+"";
            for(int j=0; j<st.length(); j++){
                char c = st.charAt(j);
                if(c=='3'||c=='6'||c=='9'){
                    res=0;
                    break;
                }
            }
            System.out.print(res+" ");
        }

    }
}