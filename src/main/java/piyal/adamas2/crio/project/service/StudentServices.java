package piyal.adamas2.crio.project.service;

public interface StudentServices {
  StudentDTO registerStudent(StudentDTO studentDTO);
  StudentDTO getStudent(Long id);
}
