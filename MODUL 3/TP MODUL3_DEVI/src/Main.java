import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Enter student name: ");
        String studentName = scanner.nextLine();

        int studentId = 0;
        boolean id = false;
        while (!id) {
            try {
                // Input user details
                System.out.print("Enter student id: ");
                studentId = scanner.nextInt();
                id = true;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for student ID: ");
                scanner.nextLine();
            }
        }

        Student student = new Student(studentName, studentId);
        students.add(student);

        System.out.println("\nUser Details:\n" + student.getUserDetails());

        System.out.print("Enter course to enroll in (separated by commas): ");
        scanner.nextLine();
        String course = scanner.nextLine();

        String[] courseNames = course.split(",");

        // Input course names
        for (String courseName : courseNames) {
            student.enrollInCourse(courseName);
        }

        ArrayList<String> student101 = new ArrayList<>();
        student101.add("Haris");
        student101.add("Metta");

        ArrayList<String> student102 = new ArrayList<>();
        student102.add("Windy");
        student102.add("Amilia");

        System.out.println("\nCourse ID: 101,");
        System.out.println("Course Name: Statistika Industri");
        for (String studentInCourse : student101) {
            System.out.println("Student: " + studentInCourse);
        }

        System.out.println("\nCourse ID: 102,");
        System.out.println("Course Name: Desain Jaringan Komputer");
        for (String studentInCourse : student102) {
            System.out.println("Student: " + studentInCourse);
        }

        for (Student enrolledStudent : students) {
            System.out.println("\nStudent - Nama: " + enrolledStudent.getUserName() +
                    ", ID: " + enrolledStudent.getUserId() + ",");
            System.out.println("Enrolled Courses: " + enrolledStudent.getEnrolledCourses());
        }
    }
}
