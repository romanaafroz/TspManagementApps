/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.dao;

import com.spring.maven.dao.impl.ILabDAO;
import com.spring.maven.model.Lab;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ASUS
 */
@Repository(value = "labDAO")
@Transactional
public class LabDAO implements ILabDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Lab save(Lab t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Lab update(Lab t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Lab delete(int id) {
        Lab lab = (Lab) sessionFactory.getCurrentSession().load(Lab.class, id);
        sessionFactory.getCurrentSession().delete(lab);
        return lab;
    }

    @Override
    public List<Lab> getAll() {
        List<Lab> lList = sessionFactory.getCurrentSession().createCriteria(Lab.class).list();
        return lList;

    }

    @Override
    public Lab getById(int id) {
        Lab lab = (Lab) sessionFactory.getCurrentSession().get(Lab.class, id);
        return lab;
    }

}
