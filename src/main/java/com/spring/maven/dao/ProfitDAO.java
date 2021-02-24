/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.dao;

import com.spring.maven.dao.impl.IProfitDAO;
import com.spring.maven.model.Profit;
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
@Repository(value = "profitDAO")
@Transactional
public class ProfitDAO implements IProfitDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Profit save(Profit t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Profit update(Profit t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Profit delete(int id) {
        Profit profit = (Profit) sessionFactory.getCurrentSession().load(Profit.class, id);
        sessionFactory.getCurrentSession().delete(profit);
        return profit;
    }

    @Override
    public List<Profit> getAll() {
        List<Profit> pList = sessionFactory.getCurrentSession().createCriteria(Profit.class).list();
        return pList;

    }

    @Override
    public Profit getById(int id) {
        Profit profit = (Profit) sessionFactory.getCurrentSession().get(Profit.class, id);
        return profit;
    }



    @Override
    public List<Profit> getSlaryByMonth(String month, String year) {
        String hql = "from profit where month = :month AND year = :year";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        q.setParameter("month", month);
        q.setParameter("year", year);
        List<Profit> pl = q.list();
        System.out.println(pl);
        return pl;
    }

    
}
