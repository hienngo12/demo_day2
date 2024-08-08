package homework;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentRepository studentRepository = new StudentRepositoryImpl();

        StudentService studentService = new StudentService(studentRepository);

        System.out.println("Danh sách học sinh:");
        List<Student> students = studentService.getAllStudents();
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
        }

        Student newStudent = new Student(30, "Bob", 3);
        studentService.addStudent(newStudent);
        System.out.println("Đã thêm học sinh mới: " + newStudent.getName());

        Student updatedStudent = new Student(18, "John Updated", 1);
        studentService.updateStudent(updatedStudent);
        System.out.println("Đã cập nhật học sinh: " + updatedStudent.getName());

        int deleteId = 2;
        studentService.deleteStudent(deleteId);
        System.out.println("Đã xoá học sinh có ID: " + deleteId);

        System.out.println("Danh sách học sinh sau khi thay đổi:");
        students = studentService.getAllStudents();
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}