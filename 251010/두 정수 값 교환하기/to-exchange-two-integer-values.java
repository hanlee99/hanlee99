import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        IntWrapper a= new IntWrapper(n);
        IntWrapper b=new IntWrapper(m);
        swap(a,b);

        System.out.println(a.value + " " +  b.value);
    }

    public static void swap(IntWrapper a, IntWrapper b){
        int n = a.value;
        a.value = b.value;
        b.value = n;
    }
    
}

class IntWrapper{
    int value;
    IntWrapper(int value){
        this.value = value;
    }

    public int getInt(){
        return value;
    }

    
}