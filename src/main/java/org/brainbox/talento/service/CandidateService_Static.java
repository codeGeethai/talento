package org.brainbox.talento.service;

import org.brainbox.talento.dataObjects.Candidate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

@Service
public class CandidateService_Static {

    Logger logger = LoggerFactory.getLogger(CandidateService_Static.class);
    private List<Candidate> candidates = new ArrayList<Candidate>(Arrays.asList(
            new Candidate()
            /*new Candidate("1","Geethai","047068XXXX","xxxgeethai@gmail.com","01-01-1982","1,Bourke Street, Melbourne","Melbourne"),
            new Candidate("2","Shanthya","046004XXXX","xxxshanthya@yahoo.com","01-01-1985","51,Collins Street, Sydney","Sydney"),
            new Candidate("3","Akshadha","045432XXXX","xxxakshadha@gmail.com","01-01-1988","92,Random Street, Melbourne","Melbourne"),
            new Candidate("4","Aarush","04988XXXX","xxxaarush@yahoo.com","01-01-1992","45,Spring Street, Chennai, India","Chennai")*/
        ));

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public Candidate getCandidate(String id) {
        return candidates.stream().filter(c -> c.getId().equalsIgnoreCase(id)).findFirst().get();
    }

    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    public void updateCandidate(Candidate candidate){
        int index = IntStream.range(0,candidates.size())
                    .filter(i -> Objects.equals(candidates.get(i).getId(), candidate.getId()))
                    .findFirst()
                    .orElse(-1);
        candidates.set(index,candidate);
        logger.info("candidate updated successfully");
    }

    public void deleteCandidate(Candidate candidate){
        int index = IntStream.range(0,candidates.size())
                .filter(i -> Objects.equals(candidates.get(i).getId(), candidate.getId()))
                .findFirst()
                .orElse(-1);
        candidates.remove(index);
        logger.info("candidate deleted successfully");

    }
}

