import java.util.List;

record Person(String name, int age) {}

public class Exercise29_Records {
    public static void main(String[] args) {

        Person p1 = new Person("Ram", 20);
        Person p2 = new Person("Priya", 16);

        System.out.println(p1);
        System.out.println(p2);

        List<Person> persons = List.of(p1, p2);

        persons.stream()
               .filter(p -> p.age() >= 18)
               .forEach(System.out::println);
    }
}