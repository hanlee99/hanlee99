import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        IntBox n = new IntBox(a);
        IntBox m = new IntBox(b);

        conditionChange(n, m);
        System.out.println(n.value + " " + m.value);
    }

    private static void conditionChange(IntBox n, IntBox m){
        if(n.value > m.value){
            n.value*=2;
            m.value+=10;
        }else{
            m.value*=2;
            n.value+=10;
        }
    }
}

class IntBox{
    int value;
    IntBox(int value){
        this.value = value;
    }
}