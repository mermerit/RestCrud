package studentcrud.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studentcrud.doa.StudentRepository;
import studentcrud.entity.Student;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements ServiceInterface {

    private StudentRepository studentRepository;
@Autowired
    public StudentService (StudentRepository thestudentRepository){
        studentRepository=thestudentRepository;

    }


    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int theid) {
        Optional <Student> result=studentRepository.findById(theid);
    Student theStudent =null;
    if (result.isPresent()){
        theStudent=result.get();
    }
    else {
        throw new RuntimeException("Did not find student id "+theid);
    }
    return theStudent;
    }

    @Override
    public void save(Student theStudent) {
studentRepository.save(theStudent);
    }

    @Override
    public void delete(int theid) {
studentRepository.deleteById(theid);
    }
}
