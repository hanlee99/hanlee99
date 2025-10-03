import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] students = {"John","Tom","Paul","Sam"};

        while(sc.hasNext()){
            int num=sc.nextInt();
            if(num>=5){
                System.out.println("Vacancy");
                break;
            }
            System.out.println(students[num-1]);
        }

    }
}