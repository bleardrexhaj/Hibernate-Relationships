package com.relationships.domain.OneToManyBi;

import com.relationships.domain.OneToMany.Address;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /*
        @Relation OneToMany
        Bi-Directional
     */
    @OneToMany(mappedBy = "employee", fetch=FetchType.LAZY,  cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private Set<Job> jobs = new HashSet<>();

    public Set<Job> getJobs() {
        return jobs;
    }

    public void setJobs(Set<Job> jobs) {
        this.jobs = jobs;
    }
}
