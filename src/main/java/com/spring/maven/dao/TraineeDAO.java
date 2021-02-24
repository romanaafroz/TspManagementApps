/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.dao;

import com.spring.maven.dao.impl.ITraineeDAO;
import com.spring.maven.model.Trainee;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ASUS
 */
@Repository(value = "traineeDAO")
@Transactional
public class TraineeDAO implements ITraineeDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Trainee save(Trainee t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Trainee update(Trainee t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Trainee delete(int id) {
        Trainee trainee = (Trainee) sessionFactory.getCurrentSession().load(Trainee.class, id);
        sessionFactory.getCurrentSession().delete(trainee);
        return trainee;
    }

    @Override
    public List<Trainee> getAll() {
        List<Trainee> lList = sessionFactory.getCurrentSession().createCriteria(Trainee.class).list();
        return lList;

    }

    @Override
    public Trainee getById(int id) {
        Trainee trainee = (Trainee) sessionFactory.getCurrentSession().get(Trainee.class, id);
        return trainee;
    }

}
