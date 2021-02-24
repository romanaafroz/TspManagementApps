/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.dao;

import com.spring.maven.dao.impl.IExpenseDAO;
import com.spring.maven.model.Expense;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ASUS
 */
@Repository(value = "expenseDAO")
@Transactional
public class ExpenseDAO implements IExpenseDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Expense save(Expense t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Expense update(Expense t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Expense delete(int id) {
        Expense expense = (Expense) sessionFactory.getCurrentSession().load(Expense.class, id);
        sessionFactory.getCurrentSession().delete(expense);
        return expense;
    }

    @Override
    public List<Expense> getAll() {
        List<Expense> eList = sessionFactory.getCurrentSession().createCriteria(Expense.class).list();
        return eList;

    }

    @Override
    public Expense getById(int id) {
        Expense expense = (Expense) sessionFactory.getCurrentSession().get(Expense.class, id);
        return expense;
    }

}
