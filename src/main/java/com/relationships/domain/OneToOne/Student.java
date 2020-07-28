package com.relationships.domain.OneToOne;

import javax.persistence.*;

@Entity(name = "student")
public class Student {
    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    @JoinColumn(name = "contact_id")
    private ContactInfo contactInfo;

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
}
