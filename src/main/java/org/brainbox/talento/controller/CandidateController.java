package org.brainbox.talento.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.brainbox.talento.dataObjects.Candidate;
import org.brainbox.talento.dataObjects.Interview;
import org.brainbox.talento.dataObjects.SkillSet;
import org.brainbox.talento.service.CandidateService;
import org.brainbox.talento.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class CandidateController {
    @Autowired
    private CandidateService candidateService;

    @GetMapping("/candidates")
    public List<Candidate> getAllCandidates() {
        return candidateService.getAllCandidates();
    }

    @GetMapping("/candidate/{id}")
    public Candidate getCandidate(@PathVariable String id){
        return candidateService.getCandidate(id);
    }

    @PostMapping("/candidates")
    public void addCandidate(@RequestBody Candidate candidate){
        candidateService.addCandidate(candidate);
    }

    @PutMapping("/candidates")
    public void updateCandidate(@RequestBody Candidate candidate){
        candidateService.updateCandidate(candidate);
    }

    @DeleteMapping("/candidates")
    public void deleteCandidate(@RequestBody Candidate candidate){
        candidateService.deleteCandidate(candidate);
    }

    @GetMapping("/candidates/{id}/interviews")
    public List<Interview> getInterviewforACandidate(@RequestBody String id){
        return candidateService.getCandidate(id).getInterviews();
    }

    @GetMapping("/candidates/{id}/skills")
    public List<SkillSet> getSkillsSetforACandidate(@RequestBody String id){
        return candidateService.getCandidate(id).getSkillSets();
    }
}

