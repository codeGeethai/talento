package org.brainbox.talento.service;

import org.brainbox.talento.dataObjects.Candidate;
import org.brainbox.talento.dataObjects.Interview;
import org.brainbox.talento.repository.CandidateRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.IntStream;

@Service
public class CandidateService {

    Logger logger = LoggerFactory.getLogger(CandidateService.class);

    @Autowired
    CandidateRepository candidateRepository;

    public List<Candidate> getAllCandidates() {
        List<Candidate> candidateList = new ArrayList<>();
        candidateRepository.findAll()
                           .forEach(candidateList::add);
        return candidateList;
    }

    public Candidate getCandidate(String id) {
        return candidateRepository.findById(id).orElse(new Candidate());
    }

    public void addCandidate(Candidate candidate) {
       // candidate.setInterviews(Arrays.asList (new Interview()));
        candidateRepository.save(candidate);
        logger.info("candidate added successfully");
    }

    public void updateCandidate(Candidate candidate){
        candidateRepository.save(candidate);
        logger.info("candidate updated successfully");
    }

    public void deleteCandidate(Candidate candidate){
        candidateRepository.delete(candidate);
        logger.info("candidate deleted successfully");

    }
}

