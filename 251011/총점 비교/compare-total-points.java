import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i=0; i<n; i++){
            String name=sc.next();
            int[] scores = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
            students[i]=new Student(name, scores);
        }
        Arrays.sort(students);
        for(Student st : students) {
            System.out.print(st.name+" ");
            for(int i : st.score) System.out.print(i+" ");
            System.out.println();
        }
    }
}

class Student implements Comparable<Student>{
    String name;
    int[] score;

    public Student(String name, int[] score){
        this.name=name;
        this.score = score;
    }

    @Override
    public int compareTo(Student st){
        return score[0]+score[1]+score[2]-
               st.score[0]-st.score[1]-st.score[2];
    }

}