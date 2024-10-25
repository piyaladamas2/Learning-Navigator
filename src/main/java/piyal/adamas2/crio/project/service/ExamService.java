package piyal.adamas2.crio.project.service;

public interface ExamService {

  ExamDTO registerExam(Long examId, Long studentId);
  ExamDTO getExam(Long id);
  
}
