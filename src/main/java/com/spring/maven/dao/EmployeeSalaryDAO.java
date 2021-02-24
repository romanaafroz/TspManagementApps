/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.dao;

import com.spring.maven.dao.impl.IEmployeeSalaryDAO;
import com.spring.maven.model.EmployeeSalary;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ASUS
 */
@Repository(value = "employeeSalaryDAO")
@Transactional
public class EmployeeSalaryDAO implements IEmployeeSalaryDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public EmployeeSalary save(EmployeeSalary t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public EmployeeSalary update(EmployeeSalary t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public EmployeeSalary delete(int id) {
        EmployeeSalary employeeSalary = (EmployeeSalary) sessionFactory.getCurrentSession().load(EmployeeSalary.class, id);
        sessionFactory.getCurrentSession().delete(employeeSalary);
        return employeeSalary;
    }

    @Override
    public List<EmployeeSalary> getAll() {
        List<EmployeeSalary> eList = sessionFactory.getCurrentSession().createCriteria(EmployeeSalary.class).list();
        return eList;

    }

    @Override
    public EmployeeSalary getById(int id) {
        EmployeeSalary employeeSalary = (EmployeeSalary) sessionFactory.getCurrentSession().get(EmployeeSalary.class, id);
        return employeeSalary;
    }

}
