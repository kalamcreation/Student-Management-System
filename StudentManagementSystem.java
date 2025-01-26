// Abstract Class (Abstraction)
abstract class Person {
    private String name;  // Encapsulation: private fields with getters and setters
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayInfo();
}

// Subclass: Student (Inheritance from Person)
class Student extends Person {
    private int studentID;  // Encapsulation: additional field for Student
    private String course;

    public Student(String name, int age, int studentID, String course) {
        super(name, age);
        this.studentID = studentID;
        this.course = course;
    }

    // Getter and Setter methods
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Polymorphism: Overriding the abstract method
    @Override
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
    }
}

// Subclass: Teacher (Inheritance from Person)
class Teacher extends Person {
    private String subject;  // Encapsulation: additional field for Teacher
    private int teacherID;

    public Teacher(String name, int age, String subject, int teacherID) {
        super(name, age);
        this.subject = subject;
        this.teacherID = teacherID;
    }

    // Getter and Setter methods
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    // Polymorphism: Overriding the abstract method
    @Override
    public void displayInfo() {
        System.out.println("Teacher Information:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Teacher ID: " + teacherID);
        System.out.println("Subject: " + subject);
    }
}

// Main Class
public class StudentManagementSystem {
    public static void main(String[] args) {
        // Creating a student object
        Student student = new Student("Abul Kalam", 23, 458, "Computer Science");

        // Creating a teacher object
        Teacher teacher = new Teacher("Md. Mahadi Hasan", 30, "OOP", 5001);

        // Displaying student and teacher information (Polymorphism in action)
        System.out.println("Displaying Information:");
        System.out.println("-----------------------");
        student.displayInfo();
        System.out.println();
        teacher.displayInfo();
    }
}
