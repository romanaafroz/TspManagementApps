/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.dao;

import com.spring.maven.dao.impl.IUserDAO;
import com.spring.maven.model.User;
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
@Repository(value = "userDAO")
@Transactional
public class UserDAO implements IUserDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public User save(User t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public User update(User t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public User delete(int id) {
        User ass = (User) sessionFactory.getCurrentSession().load(User.class, id);
        sessionFactory.getCurrentSession().delete(ass);
        return ass;
    }

    @Override
    public List<User> getAll() {
        List<User> assList = sessionFactory.getCurrentSession().createCriteria(User.class).list();
        return assList;
    }

    @Override
    public User getById(int id) {
        User assign = (User) sessionFactory.getCurrentSession().get(User.class, id);
        return assign;
    }

//    @Override
//    public List<User> getByRoundAndBatch(String round, String batch) {
//        String hql = "from user where round = :round AND batch = :batch";
//        Query q = sessionFactory.getCurrentSession().createQuery(hql);
//        q.setParameter("round", round);
//        q.setParameter("batch", batch);
//        List<User> att = q.list();
//        System.out.println(att);
//        return att; 
//    
//    }

}
