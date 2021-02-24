/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.dao;

import com.spring.maven.dao.impl.IAssignTraineeCourseLabDAO;
import com.spring.maven.model.AssignTraineeCourseLab;
import com.spring.maven.model.Attendance;
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
@Repository(value = "assignTraineeCourseLabDAO")
@Transactional
public class AssignTraineeCourseLabDAO implements IAssignTraineeCourseLabDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public AssignTraineeCourseLab save(AssignTraineeCourseLab t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public AssignTraineeCourseLab update(AssignTraineeCourseLab t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public AssignTraineeCourseLab delete(int id) {
        AssignTraineeCourseLab ass = (AssignTraineeCourseLab) sessionFactory.getCurrentSession().load(AssignTraineeCourseLab.class, id);
        sessionFactory.getCurrentSession().delete(ass);
        return ass;
    }

    @Override
    public List<AssignTraineeCourseLab> getAll() {
        List<AssignTraineeCourseLab> assList = sessionFactory.getCurrentSession().createCriteria(AssignTraineeCourseLab.class).list();
        return assList;
    }

    @Override
    public AssignTraineeCourseLab getById(int id) {
        AssignTraineeCourseLab assign = (AssignTraineeCourseLab) sessionFactory.getCurrentSession().get(AssignTraineeCourseLab.class, id);
        return assign;
    }

    @Override
    public List<AssignTraineeCourseLab> getByRoundAndBatch(String round, String batch) {
        String hql = "from assignTraineeCourseLab where round = :round AND batch = :batch";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        q.setParameter("round", round);
        q.setParameter("batch", batch);
        List<AssignTraineeCourseLab> att = q.list();
        System.out.println(att);
        return att; 
    
    }

}
