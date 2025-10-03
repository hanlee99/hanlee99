import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String[] arr = st.split(":");
        System.out.println(Integer.parseInt(arr[0])+1 +":" +arr[1]);
    }
}