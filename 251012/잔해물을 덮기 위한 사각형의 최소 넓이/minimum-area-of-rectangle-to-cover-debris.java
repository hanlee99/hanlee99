import java.util.Scanner;

public class Main {
    public static final int MAX_N = 2000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt();
        int rect1_y1 = sc.nextInt();
        int rect1_x2 = sc.nextInt();
        int rect1_y2 = sc.nextInt();
        int rect2_x1 = sc.nextInt();
        int rect2_y1 = sc.nextInt();
        int rect2_x2 = sc.nextInt();
        int rect2_y2 = sc.nextInt();
        // Please write your code here.
        int[] board = new int[MAX_N];
        int n = MAX_N/2;
        Rect rect1 = new Rect(rect1_x1+n, rect1_x2+n, rect1_y1+n, rect1_y2+n);
        Rect rect2 = new Rect(rect2_x1+n, rect2_x2+n, rect2_y1+n, rect2_y2+n);

        
        int area = (rect1.x2-rect1.x1)*(rect1.y2-rect1.y1);
        if(rect1.x1>=rect2.x1&&rect1.x2<=rect2.x2){
            int y = rect1.y1<rect2.y1 ? rect2.y1-rect1.y1 : rect1.y2-rect2.y2;
            area = (rect1.x2-rect1.x1) * y;
        }else if(rect1.y1>=rect2.y1&&rect1.y2<=rect2.y2){
            int x = rect1.x1<rect2.x1 ? rect2.x1-rect1.x1 : rect1.x2-rect2.x2;
            area = (rect1.y2-rect1.y1) * x;
        }
        System.out.println(area);
    }
}

class Rect{
    int x1; int x2;
    int y1; int y2;
    public Rect(int x1, int x2, int y1, int y2){
        this.x1 = Math.min(x1,x2);
        this.x2 = Math.max(x1,x2);
        this.y1 = Math.min(y1,y2);
        this.y2 = Math.max(y1,y2);
    }
}