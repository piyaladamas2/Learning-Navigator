package piyal.adamas2.crio.project.entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long registrationId;
  private String name;

  @ManyToMany
  @JoinTable(
        name = "student_subject",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
  private List<Long> enrolledSubjectsId; 
  @ManyToMany
  @JoinTable(
      name = "student_exam",
      joinColumns = @JoinColumn(name = "student_id"),
      inverseJoinColumns = @JoinColumn(name = "exam_id")
  )   
  private List<Long> registeredExamsId;
    
}
