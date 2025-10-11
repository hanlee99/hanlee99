import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            persons[i] = new Person(name,height,weight);
        }
        // Please write your code here.
        Arrays.sort(persons, (a,b)-> a.name.compareTo(b.name));
        System.out.println("name");
        for(Person ps : persons){
            System.out.println(ps.toString());
        }
        System.out.println("\nheight");
        Arrays.sort(persons, (a,b)-> b.height-a.height);
        for(Person ps : persons){
            System.out.println(ps.toString());
        }
    }
}
class Person{
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight){
        this.name = name;
        this.height=height;
        this.weight=weight;
    }
    public String toString(){
        return name+" "+height+" "+String.format("%.1f", weight);
    }
}