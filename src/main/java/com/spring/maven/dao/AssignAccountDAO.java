/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.dao;

import com.spring.maven.dao.impl.IAssignAccountDAO;
import com.spring.maven.model.AssignAccount;
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
@Repository(value = "assignAccountDAO")
@Transactional
public class AssignAccountDAO implements IAssignAccountDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public AssignAccount save(AssignAccount t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public AssignAccount update(AssignAccount t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public AssignAccount delete(int id) {
        AssignAccount ass = (AssignAccount) sessionFactory.getCurrentSession().load(AssignAccount.class, id);
        sessionFactory.getCurrentSession().delete(ass);
        return ass;
    }

    @Override
    public List<AssignAccount> getAll() {
        List<AssignAccount> assList = sessionFactory.getCurrentSession().createCriteria(AssignAccount.class).list();
        return assList;
    }

    @Override
    public AssignAccount getById(int id) {
        AssignAccount assign = (AssignAccount) sessionFactory.getCurrentSession().get(AssignAccount.class, id);
        return assign;
    }

    @Override
    public List<AssignAccount> getByRoundAndBatch(String round, String batch) {
        String hql = "from assignAccount where round = :round AND batch = :batch";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        q.setParameter("round", round);
        q.setParameter("batch", batch);
        List<AssignAccount> att = q.list();
        System.out.println(att);
        return att; 
    
    }

}
