import java.util.Scanner;

class IntBox{
    int value;
    IntBox(int value){
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        IntBox n = new IntBox(a);
        IntBox m = new IntBox(b);
        magicNum(n, m);
        System.out.println(n.value + " " + m.value);
    }

    public static void magicNum(IntBox a, IntBox b){
        if(a.value > b.value){
            a.value +=25;
            b.value *=2;
        }else{
            a.value *=2;
            b.value +=25;
        }
    }
}