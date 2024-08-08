package homework;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    private List<Student> students;

    public StudentRepositoryImpl() {
        students = new ArrayList<>();

        students.add(new Student(18, "John", 1));
        students.add(new Student(20, "Alice", 2));
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void updateStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == student.getId()) {
                students.set(i, student);
                break;
            }
        }
    }

    @Override
    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }
}
