package hashmap;
import java.util.HashMap;
import hashmap.Student;

public class StudentHashMapExample {

    public static void main(String[] args) {
        // Create a HashMap to store students
        HashMap<String, Student> studentMap = new HashMap<>();

        // Add 8 students to the HashMap
        studentMap.put("Dinesh", new Student("Dinesh", "Ravipati", 3.8));
        studentMap.put("Pavan", new Student("Pavan", "Akula", 3.9));
        studentMap.put("SaiKrishna", new Student("SaiKrishna", "Johnson", 3.5));
        studentMap.put("Nikhil", new Student("Nikhil", "Kotte", 3.7));
        studentMap.put("Vignesh", new Student("Vignesh", "Srigiri", 3.6));
        studentMap.put("Deepak", new Student("Deepak", "Ragala", 3.2));
        studentMap.put("Rohith", new Student("Rohith", "Govindhu", 3.4));
        studentMap.put("Sophia", new Student("Sophia", "Wilson", 3.9));

        // Example: Retrieving a student by providing the first name
        String studentNameToFind = "Dinesh";
        Student foundStudent = getStudentByName(studentMap, studentNameToFind);

        if (foundStudent != null) {
            System.out.println("Student found: " + foundStudent.firstName + " " + foundStudent.lastName + ", GPA: " + foundStudent.gpa);
        } else {
            System.out.println("Student with name '" + studentNameToFind + "' not found.");
        }
    }

    // Method to get a student by name from the HashMap
    private static Student getStudentByName(HashMap<String, Student> studentMap, String name) {
        return studentMap.get(name);
    }
}
