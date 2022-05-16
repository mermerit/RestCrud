package studentcrud.Service;

import studentcrud.entity.Student;

import java.util.List;

public interface ServiceInterface {
    public List<Student>findAll();
    public Student findById (int theid);
    public void save(Student theStudent);
    public void delete(int theid);
}
