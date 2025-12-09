import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        // Please write your code here.
        dfs(k, n, 0, "");
    }

    private static void dfs(int k, int n,int depth, String st){
        if(depth >= n){
            System.out.println(st.trim());
            return;
        }
        for(int i=1; i<=k; i++){
            dfs(k, n, depth+1, st+" "+i);
        }
    }
}