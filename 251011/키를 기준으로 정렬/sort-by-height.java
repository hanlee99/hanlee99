import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Person[] persons = new Person[n];

        for(int i=0; i<n; i++){
            persons[i] = new Person(sc.next(),sc.nextInt(),sc.nextInt());
        }

        Arrays.sort(persons, (a,b) -> a.height-b.height);
        for(int i=0; i<n; i++){
            Person person = persons[i];
            System.out.println(person.name +" "+person.height+" "+person.weight);
        }
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
}