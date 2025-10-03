import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        String[] students = {"John", "Tom", "Paul"};

        String student = a>0 && a<4 ? students[a] : "Vacancy";
        
        System.out.println(student);
    }
}