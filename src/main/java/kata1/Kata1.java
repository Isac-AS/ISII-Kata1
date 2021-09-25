package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Blas", new Date(49, 8, 21));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }

}
