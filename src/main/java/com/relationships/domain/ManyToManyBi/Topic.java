package com.relationships.domain.ManyToManyBi;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "topics")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @ManyToMany(mappedBy = "topics")
    private Set<Post> posts;
}
