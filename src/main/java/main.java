import com.fasterxml.jackson.databind.ObjectMapper;
import model.Animal;
import model.Person;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        Person person = new Person("Ibbe", 28);

        Animal animal = new Animal();

        Person alexandra = new Person("Alexandra", 48);
        Person daniel = new Person("Daniel", 51);
        Person karina = new Person("Karina", 63);
        Person johan = new Person("Johan", 15);


        ObjectMapper mapper = new ObjectMapper();


    }
}
