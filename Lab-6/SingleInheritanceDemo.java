class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String studentId;

    Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    void displayStudent() {
        System.out.println("\n--- Student Details ---");
        displayPerson();
        System.out.println("Student ID: " + studentId);
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Student s = new Student("Varshith K", 21, "ST4157");
        s.displayStudent();
    }
}
