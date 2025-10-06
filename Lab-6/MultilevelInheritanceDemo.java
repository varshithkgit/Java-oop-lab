
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
        displayPerson();
        System.out.println("Student ID: " + studentId);
    }
}

class GraduateStudent extends Student {
    String specialization;

    GraduateStudent(String name, int age, String studentId, String specialization) {
        super(name, age, studentId);
        this.specialization = specialization;
    }

    void displayGraduateStudent() {
        System.out.println("\n--- Graduate Student Details ---");
        displayStudent();
        System.out.println("Specialization: " + specialization);
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        GraduateStudent g = new GraduateStudent("Varshith K", 21, "ST4157", "Artificial Intelligence");
        g.displayGraduateStudent();
    }
}
