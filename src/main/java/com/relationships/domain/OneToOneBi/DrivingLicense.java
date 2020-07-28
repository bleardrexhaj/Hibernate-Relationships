package com.relationships.domain.OneToOneBi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "license")
public class DrivingLicense {
    @Id
    @GeneratedValue
    private long id;

    @OneToOne(mappedBy = "drivingLicense")
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
