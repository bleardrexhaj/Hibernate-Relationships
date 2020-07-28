package com.relationships.DAO.impl;

import com.relationships.DAO.UserDAO;
import com.relationships.domain.OneToMany.User;
import org.springframework.stereotype.Component;

import javax.persistence.Query;
import java.util.List;

@Component
public class UserDAOImpl extends GenericDaoImpl<User> implements UserDAO {

    @Override
    public void save(User u) {
        super.save(u);
    }

    @Override
    public List<User> findAllJobs(Long userID) {
        Query query = entityManager.createQuery("from Users");

        return query.getResultList();
    }
}
