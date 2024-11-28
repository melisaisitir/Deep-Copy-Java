package tr.edu.maltepe.oop;

public class Simple_main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department dept = new Department("Software Engineering", "Maltepe");
        Person person1 = new Person("Melisa", 24, dept);

        // Deep copy
        Person person2 = (Person) person1.clone();
        person2.getDepartment().setLocation("Marmara");

        System.out.println("Original Person: "  + person1.writeinfo());
        System.out.println("Cloned Person: " + person2.writeinfo());
    }
}


