package com.relationships.services;

import com.relationships.domain.OneToMany.User;

import java.util.List;

public interface UserService {
    public void save(User user);
    List<User> findAllJobs(Long i);
}
