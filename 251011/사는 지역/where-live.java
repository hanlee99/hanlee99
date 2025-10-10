import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        String[] addresses = new String[n];
        String[] regions = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            addresses[i] = sc.next();
            regions[i] = sc.next();
        }
        // Please write your code here.
        PersonalInfo[] persons = new PersonalInfo[3];
        for(int i=0; i<3; i++){
            persons[i] = new PersonalInfo(names[i],addresses[i],regions[i]);
        }
        PersonalInfo person = persons[0];

        for(int i=1; i<3; i++){
            if(person.name.compareTo(persons[i].name)<0) {
                person= persons[i]; 
            }
        }
        System.out.println(person.toString());
    }
}
class PersonalInfo{
    String name;
    String address;
    String region;
    public PersonalInfo(String name, String address, String region){
        this.name = name;
        this.address = address;
        this.region = region;
    }
    public PersonalInfo(){
        name="";
        address="";
        region="";
    }
    public String toString(){
        return "name " + name +"\n" +
               "addr " + address + "\n" +
               "city " + region;
    }
}