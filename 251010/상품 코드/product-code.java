import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.
        Product product = new Product("codetree", 50);
        Product product2 = new Product(id2, code2);

        System.out.println(product.toString()+"\n"+product2.toString());
    }
}

class Product{
    String id;
    int code;
    public Product(String id, int code){
        this.id = id;
        this.code = code;
    }

    @Override
    public String toString(){
       return "product " + code+" is "+id;
    }

}