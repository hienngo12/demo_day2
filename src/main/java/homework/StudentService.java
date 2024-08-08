package homework;

import java.util.List;

public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public void updateStudent(Student student) {
        studentRepository.updateStudent(student);
    }

    public void deleteStudent(int id) {
        studentRepository.deleteStudent(id);
    }
}
