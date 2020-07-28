package com.relationships.domain.OneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "contactinformation")
public class ContactInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
