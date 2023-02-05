
public class Main {

    public static void main(String[] args) {
        
        Course course = new Course("Nouvelle cours");

    Student student1 = new Student("coulibaly", 60, 4.5);
    Student student2 = new Student("Mouhamed", 21, 4.5);
    Student student3 = new Student("nabocho 27", 44, 3.5);

    course.addStudent(student1);
    course.addStudent(student2);
    course.addStudent(student3);

    System.out.println("Student List:");
    course.printStudents();

    course.removeStudent(student1);

    System.out.println("\n :Student List before remove of coulibaly");
    course.printStudents();
    
    }
}


