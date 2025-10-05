import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String word=sc.next();
        char one=word.charAt(0);
        char two=word.charAt(1);
        char[] arr = word.toCharArray();

        for(int i=0; i<arr.length; i++){
            if(arr[i] ==one) arr[i]=two;
            else if(arr[i]==two) arr[i]=one;
        }

        System.out.println(String.valueOf(arr));
        
    }
}