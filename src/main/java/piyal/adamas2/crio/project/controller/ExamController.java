package piyal.adamas2.crio.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import piyal.adamas2.crio.project.service.ExamService;

@RestController
@RequestMapping("/exams")
public class ExamController {
  
  @Autowired
  private ExamService examService;

  @PostMapping("/{examId}")
  public ResponseEntity<ExamDTO> registerExam(@PathVariable Long examId, @RequestBody Long studentId) {
        return new ResponseEntity<>(examService.registerExam(examId, studentId), HttpStatus.OK);
    }
  
}
