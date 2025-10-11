import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] korean = new int[n];
        int[] english = new int[n];
        int[] math = new int[n];
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            korean[i] = sc.nextInt();
            english[i] = sc.nextInt();
            math[i] = sc.nextInt();
            students[i] = new Student(names[i],korean[i],english[i],math[i]);
        }
        // Please write your code here.
        
        Arrays.sort(students);

        
        for(Student st : students){
            System.out.println(st.name+" "+st.korean+" "+st.english+" "+st.math);
        }
    }
}

class Student implements Comparable<Student>{
    String name;
    int korean;
    int english;
    int math;
    public Student(String name,int korean, int english, int math){
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Student student){
        if(this.korean-student.korean != 0) 
            return student.korean-this.korean;

        if(this.english-student.english != 0) 
            return student.english-this.english;

        if(this.math-student.math != 0) 
            return student.math-this.math;

        return 0;
    }
}