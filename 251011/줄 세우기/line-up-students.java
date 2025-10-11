import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            int height=sc.nextInt();
            int weight=sc.nextInt();
            students[i] = new Student(i+1, height, weight);
        }
        // Please write your code here.
        Arrays.sort(students);
        for(Student st : students){
            System.out.println(st.height+" "+st.weight+" "+st.num);
        }

    }
}

class Student implements Comparable<Student>{
    int num;
    int height;
    int weight;
    public Student(int num, int height, int weight){
        this.num = num;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student st){
        if(st.height-this.height!=0)
            return st.height-this.height;
        if(st.weight-this.weight!=0)
            return st.weight-this.weight;
        return this.num-st.num;
    }
}