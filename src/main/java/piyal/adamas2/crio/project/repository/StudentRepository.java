package piyal.adamas2.crio.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import piyal.adamas2.crio.project.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {}
