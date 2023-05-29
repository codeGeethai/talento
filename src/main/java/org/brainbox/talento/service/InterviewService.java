package org.brainbox.talento.service;

import org.brainbox.talento.dataObjects.Candidate;
import org.brainbox.talento.dataObjects.Interview;
import org.brainbox.talento.repository.CandidateRepository;
import org.brainbox.talento.repository.InterviewRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class InterviewService {

    Logger logger = LoggerFactory.getLogger(InterviewService.class);

    @Autowired
    InterviewRepository interviewRepository;

    public List<Interview> getAllInterviews() {
        List<Interview> interviewList = new ArrayList<>();
        interviewRepository.findAll()
                           .forEach(interviewList::add);
        return interviewList;
    }

    public Interview getInterview(String interview_id) {
        return interviewRepository.findById(interview_id).orElse(new Interview());
    }

    public void addInterview(Interview interview) {
        interviewRepository.save(interview);
        logger.info("interview added successfully");
    }

    public void updateInterview(Interview interview){
        interviewRepository.save(interview);
        logger.info("interview updated successfully");
    }

    public void deleteInterview(Interview interview){
        interviewRepository.delete(interview);
        logger.info("interview deleted successfully");

    }
}

