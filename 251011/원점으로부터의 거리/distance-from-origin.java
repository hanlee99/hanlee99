import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points[i] = new Point(x,y,i+1);
        }
        // Please write your code here.
        Arrays.sort(points, new Comparator<Point>(){
            @Override
            public int compare(Point a, Point b){
                int distA = Math.abs(a.x)+Math.abs(a.y);
                int distB = Math.abs(b.x)+Math.abs(b.y);
                if(distA!=distB) return distA-distB;
                return a.num-b.num;
            }
        });
        for(Point p : points){
            System.out.println(p.num);
        }
    }
}

class Point{
    int x;
    int y;
    int num;
    public Point(int x, int y, int num){
        this.x=x;
        this.y=y;
        this.num=num;
    }

    

}