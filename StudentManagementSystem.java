import java.util.*;

public class StudentManagementSystem {
    private Map<Integer, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId(), student);
        System.out.println("✅ Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            students.values().forEach(System.out::println);
        }
    }

    public void searchStudent(int id) {
        Student s = students.get(id);
        if (s != null) {
            System.out.println("🎯 Found: " + s);
        } else {
            System.out.println("❌ Student not found.");
        }
    }

    public void updateStudent(int id, String name, int age, String course) {
        Student s = students.get(id);
        if (s != null) {
            s.setName(name);
            s.setAge(age);
            s.setCourse(course);
            System.out.println("✅ Student updated successfully!");
        } else {
            System.out.println("❌ Student not found.");
        }
    }

    public void deleteStudent(int id) {
        if (students.remove(id) != null) {
            System.out.println("🗑 Student deleted successfully!");
        } else {
            System.out.println("❌ Student not found.");
        }
    }
}
