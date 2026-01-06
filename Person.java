package Assignment2;
public class Person {
    String name;

    Person() {
        name = "Unknown";
        System.out.println("Person Object created");
    }
    public static void main(String[] args) {
        Person p = new Person();
        System.out.print("Name: " + p.name);
    }
}
