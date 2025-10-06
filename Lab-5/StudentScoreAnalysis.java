import java.util.*;

class Student {
    String studentId;
    String name;
    double[] scores;
    String[] skills;
    final static int numberOfSubjects = 5;

    public Student(String id, String name) {
        this.studentId = id;
        this.name = name;
        this.scores = new double[numberOfSubjects];
        this.skills = new String[0];
    }

    public Student(String id, String name, double[] scores) {
        this.studentId = id;
        this.name = name;
        this.scores = new double[numberOfSubjects];
        for (int i = 0; i < numberOfSubjects; i++) {
            this.scores[i] = scores[i];
        }
        this.skills = new String[0];
    }

    void fillScores(double[] scores) {
        for (int i = 0; i < numberOfSubjects; i++) {
            this.scores[i] = scores[i];
        }
    }

    void fillSkills(String[] skills) {
        this.skills = Arrays.copyOf(skills, skills.length);
    }

    double calcSum() {
        double sum = 0;
        for (int i = 0; i < numberOfSubjects; i++) sum += scores[i];
        return sum;
    }

    double calcAvg() {
        return calcSum() / numberOfSubjects;
    }

    void display() {
        System.out.println("\nStudent ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.print("Scores: ");
        for (double s : scores) System.out.print(s + " ");
        System.out.println("\nSkills: " + (skills.length > 0 ? String.join(", ", skills) : "None"));
        System.out.println("Total: " + calcSum());
        System.out.println("Average: " + calcAvg());
    }
}


public class StudentScoreAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("Enter ID: ");
            String id = sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            double[] scores = new double[Student.numberOfSubjects];
            for (int j = 0; j < Student.numberOfSubjects; j++) {
                System.out.print("Enter score for subject " + (j + 1) + ": ");
                scores[j] = sc.nextDouble();
            }
            sc.nextLine(); // consume newline

            Student s = new Student(id, name, scores);

            System.out.print("Enter number of skills: ");
            int skillCount = sc.nextInt();
            sc.nextLine(); // consume newline

            String[] skills = new String[skillCount];
            for (int j = 0; j < skillCount; j++) {
                System.out.print("Enter skill " + (j + 1) + ": ");
                skills[j] = sc.nextLine();
            }
            s.fillSkills(skills);

            students.add(s);
        }

        // Display all students and compute class average
        double totalAvg = 0;
        System.out.println("\n--- STUDENT ANALYSIS REPORT ---");
        for (Student s : students) {
            s.display();
            totalAvg += s.calcAvg();
        }
        System.out.println("\nClass Average: " + (totalAvg / students.size()));

        sc.close();
    }
}
