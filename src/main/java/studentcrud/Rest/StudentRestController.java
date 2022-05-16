package studentcrud.Rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import studentcrud.Service.StudentService;
import studentcrud.entity.Student;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private StudentService theStudentService;

    @Autowired
    public StudentRestController (StudentService studentService)

    {
        theStudentService=studentService;
    }

    @GetMapping("/students")
    public List <Student>findAll(){
        return theStudentService.findAll();
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId)
    {
        Student theStudent = theStudentService.findById(studentId);
        if (theStudent==null){
            throw new StudentNotFoundException("student id not found "+studentId);
        }
        return theStudent;
    }
    @PostMapping("/students")
    public Student add(@RequestBody Student theStudent){
        theStudent.setId(0);
        theStudentService.save(theStudent);
        return theStudent;
    }
    @PutMapping("/students")
    public Student update(@RequestBody Student theStudent)
    {
        theStudentService.save(theStudent);
        return theStudent;
    }

@DeleteMapping("/students/{studentId}")
    public String delete(@PathVariable int studentId)
{
    Student tempStudent = theStudentService.findById(studentId);
    if (tempStudent==null){
        throw new StudentNotFoundException("student is not found"+studentId);

    }
    theStudentService.delete(studentId);
        return "Delete Student id "+studentId;}




}

