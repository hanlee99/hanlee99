import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
       
        String[] word = st.split(" ");
        for(int i=word.length-1; i>=0; i--){
            System.out.print(word[i]);
        }
    }
}