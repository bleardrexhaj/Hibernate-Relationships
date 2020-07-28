package com.relationships.services.impl;

import com.relationships.DAO.UserDAO;
import com.relationships.domain.OneToMany.User;
import com.relationships.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public List<User> findAllJobs(Long i) {
        return userDAO.findAllJobs(i);
    }
}
