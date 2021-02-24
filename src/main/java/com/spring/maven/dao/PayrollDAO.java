/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.dao;

import com.spring.maven.dao.impl.IPayrollDAO;
import com.spring.maven.model.Payroll;
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
@Repository(value = "payrollDAO")
@Transactional
public class PayrollDAO implements IPayrollDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Payroll save(Payroll t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Payroll update(Payroll t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Payroll delete(int id) {
        Payroll payroll = (Payroll) sessionFactory.getCurrentSession().load(Payroll.class, id);
        sessionFactory.getCurrentSession().delete(payroll);
        return payroll;
    }

    @Override
    public List<Payroll> getAll() {
        List<Payroll> pList = sessionFactory.getCurrentSession().createCriteria(Payroll.class).list();
        return pList;

    }

    @Override
    public Payroll getById(int id) {
        Payroll payroll = (Payroll) sessionFactory.getCurrentSession().get(Payroll.class, id);
        return payroll;
    }



    @Override
    public List<Payroll> getSlaryByMonth(String month, String year) {
        String hql = "from payroll where month = :month AND year = :year";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        q.setParameter("month", month);
        q.setParameter("year", year);
        List<Payroll> pl = q.list();
        System.out.println(pl);
        return pl;
    }

    
}
