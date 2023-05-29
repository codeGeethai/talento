package org.brainbox.talento.controller;

import org.brainbox.talento.dataObjects.Interview;
import org.brainbox.talento.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InterviewController {

    @Autowired
    InterviewService interviewService;
    @GetMapping("/interviews")
    public List<Interview> getAllInterviews() {
        return interviewService.getAllInterviews();

    }
    @GetMapping("/interview/{interview_id}")
    public Interview getInterview(@PathVariable String interview_id) {
        return interviewService.getInterview(interview_id);
    }

    @PostMapping("/interviews")
    public void addInterview(Interview interview){
        interviewService.addInterview(interview);
    }
    @PutMapping("/interviews")
    public void updateInterview(@PathVariable Interview interview){
        interviewService.updateInterview(interview);

    }

    @DeleteMapping("/interviews")
    public void deleteInterview(@PathVariable Interview interview){
        interviewService.deleteInterview(interview);
    }

    @PostMapping("/dummyInterview")
    public void adddummyInterview(Interview interview){
        interviewService.addInterview(interview);
    }


}
