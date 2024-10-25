package piyal.adamas2.crio.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

   @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<StudentDTO> registerStudent(@RequestBody StudentDTO studentDTO) {
        return new ResponseEntity<>(studentService.registerStudent(studentDTO), HttpStatus.CREATED);
    }  
}
