package piyal.adamas2.crio.project.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

  private Long registrationId;
  private String name;
  private List<Long> enrolledSubjectIds;
  private List<Long> registeredExamIds;
    
}
