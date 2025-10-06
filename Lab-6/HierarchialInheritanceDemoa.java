class Student {
    String name;
    String studentId;

    Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
    }
}

class UGStudent extends Student {
    int semester;
    String major;

    UGStudent(String name, String studentId, int semester, String major) {
        super(name, studentId);
        this.semester = semester;
        this.major = major;
    }

    void displayUGDetails() {
        System.out.println("\n--- Undergraduate Student ---");
        displayInfo();
        System.out.println("Semester: " + semester);
        System.out.println("Major: " + major);
    }
}

class PGStudent extends Student {
    String specialization;
    String researchArea;

    PGStudent(String name, String studentId, String specialization, String researchArea) {
        super(name, studentId);
        this.specialization = specialization;
        this.researchArea = researchArea;
    }

    void displayPGDetails() {
        System.out.println("\n--- Postgraduate Student ---");
        displayInfo();
        System.out.println("Specialization: " + specialization);
        System.out.println("Research Area: " + researchArea);
    }
}

public class StudentHierarchyDemo {
    public static void main(String[] args) {
        UGStudent ug = new UGStudent("Varshith K", "UG4157", 5, "Computer Science");
        PGStudent pg = new PGStudent("Rahul Sharma", "PG1023", "AI & ML", "Deep Learning Optimization");

        ug.displayUGDetails();
        pg.displayPGDetails();
    }
}

