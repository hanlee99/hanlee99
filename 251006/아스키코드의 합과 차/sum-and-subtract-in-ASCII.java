import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        char a=input[0].charAt(0);
        char b=input[1].charAt(0);

        int sum=a+b;
        int diff=Math.abs(a-b);

        System.out.print(sum+" " + diff);

    }
}