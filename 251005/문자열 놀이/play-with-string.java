import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String S=sc.next();
        int Q=sc.nextInt();
        char[] arr = S.toCharArray();

        for(int i=1; i<=Q; i++){
            int q=sc.nextInt();

            if(q==1){
                int a=sc.nextInt();
                int b=sc.nextInt();
                char c=arr[a-1];
                arr[a-1]=arr[b-1];
                arr[b-1]=c;
                System.out.println(String.valueOf(arr));
            }else{
                char x=sc.next().charAt(0);
                char y=sc.next().charAt(0);
                for(int j=0; j<arr.length; j++){
                    if(arr[j] == x)
                        arr[j] = y;
                }
                System.out.println(String.valueOf(arr));
            }
        }
        
    }
}