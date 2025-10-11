import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            // Please write your code here.
            persons[i] = new Person(name, height, weight);
        }
        Arrays.sort(persons, new Comparator<Person>(){
            @Override
            public int compare(Person a, Person b){
                if(a.height!=b.height) return a.height-b.height;
                if(a.weight!=b.weight) return b.weight-a.weight;
                return 0;
            }
        });
        for(Person ps : persons)
            System.out.println(ps.toString());
    }
}

class Person{
    String name;
    int height;
    int weight;
    public Person(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public String toString(){
        return name+" "+height+" "+weight;
    }
}