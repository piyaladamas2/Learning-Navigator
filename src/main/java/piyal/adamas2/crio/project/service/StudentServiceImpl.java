package piyal.adamas2.crio.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import piyal.adamas2.crio.project.entity.Student;
import piyal.adamas2.crio.project.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServices {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentDTO registerStudent(StudentDTO studentDTO) {
        Student student = new Student();
        // Set student properties and save
        studentRepository.save(student);
        return new StudentDTO();
    }

    @Override
    public StudentDTO getStudent(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student not found"));
        return new StudentDTO();
    }
}
