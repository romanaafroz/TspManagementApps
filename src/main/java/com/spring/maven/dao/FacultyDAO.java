/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.dao;

import com.spring.maven.dao.impl.IFacultyDAO;
import com.spring.maven.model.Faculty;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ASUS
 */
@Repository(value = "facultyDAO")
@Transactional
public class FacultyDAO implements IFacultyDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Faculty save(Faculty t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Faculty update(Faculty t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Faculty delete(int id) {
        Faculty f = (Faculty) sessionFactory.getCurrentSession().load(Faculty.class, id);
        sessionFactory.getCurrentSession().delete(f);
        return f;
    }

    @Override
    public List<Faculty> getAll() {
        List<Faculty> fList = sessionFactory.getCurrentSession().createCriteria(Faculty.class).list();
        return fList;

    }

    @Override
    public Faculty getById(int id) {
        Faculty f = (Faculty) sessionFactory.getCurrentSession().get(Faculty.class, id);
        return f;
    }

}
