import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    sms.addStudent(new Student(id, name, age, course));
                    break;

                case 2:
                    sms.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    sms.searchStudent(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Student ID to update: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter New Age: ");
                    age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Course: ");
                    course = sc.nextLine();
                    sms.updateStudent(id, name, age, course);
                    break;

                case 5:
                    System.out.print("Enter Student ID to delete: ");
                    sms.deleteStudent(sc.nextInt());
                    break;

                case 6:
                    System.out.println("👋 Exiting... Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("❌ Invalid option!");
            }
        }
    }
}
