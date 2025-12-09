import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static int n;
    static boolean[] visited;
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        visited = new boolean[n+1];
        // Please write your code here.
        dfs(0);
    }
    private static void dfs(int depth){
        if(depth==n){
            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i));
                if(i!=list.size()-1) System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=1; i<=n; i++){
            if(visited[i]) continue;

            list.add(i);
            visited[i] = true;           
            dfs(depth+1);
            list.remove(list.size()-1);
            visited[i] = false;
        }
    }
}