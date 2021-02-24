/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.dao;

import com.spring.maven.dao.impl.ILoginDAO;
import com.spring.maven.model.Login;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ASUS
 */
@Repository(value = "loginDAO")
@Transactional
public class LoginDAO implements ILoginDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Login save(Login t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Login update(Login t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Login delete(int id) {
        Login c = (Login) sessionFactory.getCurrentSession().load(Login.class, id);
        sessionFactory.getCurrentSession().delete(c);
        return c;
    }

    @Override
    public List<Login> getAll() {
        List<Login> cList = sessionFactory.getCurrentSession().createCriteria(Login.class).list();
        return cList;
    }

    @Override
    public Login getById(int id) {
        Login c = (Login) sessionFactory.getCurrentSession().get(Login.class, id);
        return c;
    }

}
