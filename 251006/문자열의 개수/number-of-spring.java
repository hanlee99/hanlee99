import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        StringBuilder sb = new StringBuilder();
        while(sc.hasNext()){
            String st=sc.next();
            if(st.equals("0")) break;
            cnt++;

            if(cnt%2!=0){
                sb.append(st);
                sb.append("\n");
            }

        }
        System.out.println(cnt + "\n" + sb.toString());
    }
}