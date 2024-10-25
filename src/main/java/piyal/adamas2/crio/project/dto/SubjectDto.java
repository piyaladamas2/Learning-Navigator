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
public class SubjectDto {

  private Long subjectId;
  private String name;
  private List<Long> enrolledStudentIds;

}
