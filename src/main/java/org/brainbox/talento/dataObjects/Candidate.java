package org.brainbox.talento.dataObjects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
public class Candidate {
    @Id
    private String id;
    private String name;
    private String phoneNumber;
    private String emailId;
    private String dateofBirth;
    private String address;
    private String workLocation;
    @OneToMany
    private List<Interview> interviews;
    private List<SkillSet> skillSets;
}
