/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.dao;

import com.spring.maven.dao.impl.IAssignFacultyDAO;
import com.spring.maven.model.AssignFaculty;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ASUS
 */
@Repository(value = "assignFaculty")
@Transactional
public class AssignFacultyDAO implements IAssignFacultyDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public AssignFaculty save(AssignFaculty t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public AssignFaculty update(AssignFaculty t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public AssignFaculty delete(int id) {
        AssignFaculty ass = (AssignFaculty) sessionFactory.getCurrentSession().load(AssignFaculty.class, id);
        sessionFactory.getCurrentSession().delete(ass);
        return ass;
    }

    @Override
    public List<AssignFaculty> getAll() {
        List<AssignFaculty> assList = sessionFactory.getCurrentSession().createCriteria(AssignFaculty.class).list();
        return assList;
    }

    @Override
    public AssignFaculty getById(int id) {
        AssignFaculty assign = (AssignFaculty) sessionFactory.getCurrentSession().get(AssignFaculty.class, id);
        return assign;
    }

//    @Override
//    public List<AssignFaculty> getByRoundAndBatch(String round, String batch) {
//        String hql = "from assignTraineeCourseLab where round = :round AND batch = :batch";
//        Query q = sessionFactory.getCurrentSession().createQuery(hql);
//        q.setParameter("round", round);
//        q.setParameter("batch", batch);
//        List<AssignFaculty> att = q.list();
//        System.out.println(att);
//        return att; 
//    
//    }

}
