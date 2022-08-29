package streamAndReflection;

import java.util.Comparator;
import java.util.List;

public class Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Iryna", "Perepada", 25),
                new Person("Oleg", "Denysov", 20),
                new Person("Maria", "Suprun", 30),
                new Person("Vladyslav", "Stavratiy", 50),
                new Person("Petro", "Tynov", 18)
        );

        people.stream()
                .filter(person -> person.getFullName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);
    }
}
