package com.relationships.DAO;

import com.relationships.domain.OneToMany.User;

import java.util.List;

public interface UserDAO {
    void save(User u);
    List<User> findAllJobs(Long userID);
}
