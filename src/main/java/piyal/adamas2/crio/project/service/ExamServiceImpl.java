package piyal.adamas2.crio.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import piyal.adamas2.crio.project.entity.Exam;
import piyal.adamas2.crio.project.repository.ExamRepository;

@Service
public class ExamServiceImpl implements ExamService {
  @Autowired
    private ExamRepository examRepository;

    @Override
    public ExamDTO registerExam(Long examId, Long studentId) {
        Exam exam = examRepository.findById(examId).orElseThrow(() -> new ResourceNotFoundException("Exam not found"));
        // Register student logic
        return new ExamDTO();
    }

    @Override
    public ExamDTO getExam(Long id) {
        Exam exam = examRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Exam not found"));
        return new ExamDTO();
    }
}
