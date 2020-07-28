package com.relationships.domain.ManyToManyBi;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @ManyToMany
    @JoinTable(name="posts_topics", joinColumns=@JoinColumn(name="post_id"), inverseJoinColumns=@JoinColumn(name="topic_id"))
    private Set<Topic> topics;
}
