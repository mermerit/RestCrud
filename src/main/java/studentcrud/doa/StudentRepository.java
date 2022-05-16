package studentcrud.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import studentcrud.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {


}