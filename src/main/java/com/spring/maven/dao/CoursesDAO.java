/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.dao;

import com.spring.maven.dao.impl.ICoursesDAO;
import com.spring.maven.model.Courses;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ASUS
 */
@Repository(value = "coursesDAO")
@Transactional
public class CoursesDAO implements ICoursesDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Courses save(Courses t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Courses update(Courses t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Courses delete(int id) {
        Courses courses = (Courses) sessionFactory.getCurrentSession().load(Courses.class, id);
        sessionFactory.getCurrentSession().delete(courses);
        return courses;
    }

    @Override
    public List<Courses> getAll() {
        List<Courses> lList = sessionFactory.getCurrentSession().createCriteria(Courses.class).list();
        return lList;

    }

    @Override
    public Courses getById(int id) {
        Courses courses = (Courses) sessionFactory.getCurrentSession().get(Courses.class, id);
        return courses;
    }

}
