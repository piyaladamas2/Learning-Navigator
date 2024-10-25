package piyal.adamas2.crio.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import piyal.adamas2.crio.project.repository.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectServices {

   @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public SubjectDTO createSubject(SubjectDTO subjectDTO) {
        Subject subject = new Subject();
        subjectRepository.save(subject);
        return new SubjectDTO();
    }

    @Override
    public SubjectDTO getSubject(Long id) {
        Subject subject = subjectRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Subject not found"));
        return new SubjectDTO();
    }

}
