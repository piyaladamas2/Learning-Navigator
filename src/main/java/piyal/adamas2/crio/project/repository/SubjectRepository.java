package piyal.adamas2.crio.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import piyal.adamas2.crio.project.entity.Subject;



public interface SubjectRepository extends JpaRepository<Subject, Long> {
  
}
