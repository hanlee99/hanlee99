import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students[i] = new Student(height, weight, i+1);
        }
        // Please write your code here.
        Arrays.sort(students, new Comparator<Student>(){
            @Override
            public int compare(Student a, Student b){
                if(a.height!=b.height) return a.height-b.height;
                if(a.weight!=b.weight) return b.weight-a.weight;
                return 0;
            }
        });
        for(Student st : students){
            System.out.println(st.height+" "+st.weight+" "+st.num);
        }
            
        
    }
}

class Student{
    int height;
    int weight;
    int num;
    public Student(int height, int weight, int num){
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

}