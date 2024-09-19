package co.edu.umanizales.exercise_students.controller;

import co.edu.umanizales.exercise_students.model.Student;
import co.edu.umanizales.exercise_students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/list")
    public Student[] getStudents() {
        return studentService.getStudents();
    }
}
