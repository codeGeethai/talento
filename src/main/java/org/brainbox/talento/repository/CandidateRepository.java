package org.brainbox.talento.repository;

import org.brainbox.talento.dataObjects.Candidate;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CandidateRepository extends CrudRepository<Candidate,String> {

}
