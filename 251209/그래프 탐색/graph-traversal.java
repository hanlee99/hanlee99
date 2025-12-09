import java.util.Scanner;
public class Main {
    public static  boolean[] visited;
    public static  int[][] graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] u = new int[m];
        int[] v = new int[m];
        graph = new int[n+1][n+1];
        visited = new boolean[n+1];
        for (int i = 0; i < m; i++) {
            u[i] = sc.nextInt();
            v[i] = sc.nextInt();
            graph[u[i]][v[i]] = 1;
            graph[v[i]][u[i]] = 1;
        }
        // Please write your code here.
        int cnt=0;
        dfs(1);
        for(int i=2; i<n+1; i++){
            if(visited[i]) cnt++;
        }
        System.out.println(cnt);
    }
    private static void dfs(int node){
        visited[node] = true;
        for(int i=1; i<graph.length; i++){
            if(graph[node][i]==1 && !visited[i]){
                dfs(i);
            }
        }
    }
}