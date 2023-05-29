package org.brainbox.talento.dataObjects;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Interview {
    @Id
    private String id;
    private String company;
    private String company_contact;
    private String stage;
    //private Date date;
    private String status;


}
