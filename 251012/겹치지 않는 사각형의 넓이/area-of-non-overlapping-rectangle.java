import java.util.Scanner;
public class Main {
    public static final int MAX_N = 2000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax1 = sc.nextInt(); int ay1 = sc.nextInt();
        int ax2 = sc.nextInt(); int ay2 = sc.nextInt();
        int bx1 = sc.nextInt(); int by1 = sc.nextInt(); 
        int bx2 = sc.nextInt(); int by2 = sc.nextInt();
        int mx1 = sc.nextInt(); int my1 = sc.nextInt();
        int mx2 = sc.nextInt(); int my2 = sc.nextInt();
        // Please write your code here.
        Rect A = new Rect(ax1, ax2, ay1, ay2);
        Rect B = new Rect(bx1,bx2,by1,by2);
        Rect M = new Rect(mx1,mx2,my1,my2);

        int extent = A.area() + B.area() - overlap(A, M) - overlap(B, M);

        System.out.println(extent);
    }
    static int overlap(Rect r1, Rect r2){
        int w = Math.max(0, Math.min(r1.x2,r2.x2) - Math.max(r1.x1, r2.x1));
        int h = Math.max(0, Math.min(r1.y2,r2.y2) - Math.max(r1.y1, r2.y1));

        return w*h;
    }

}

class Rect{
    int x1; int x2;
    int y1; int y2;
    public Rect(int x1, int x2, int y1, int y2){
        this.x2=Math.max(x1,x2); this.x1=Math.min(x1,x2);
        this.y2=Math.max(y1,y2); this.y1=Math.min(y1,y2);
    }
    public int area(){  return (x2-x1)*(y2-y1); }
}