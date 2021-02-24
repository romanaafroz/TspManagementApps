/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.dao;

import com.spring.maven.dao.impl.IEmployeeDAO;
import com.spring.maven.model.Employee;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ASUS
 */
@Repository(value = "employeeDAO")
@Transactional
public class EmployeeDAO implements IEmployeeDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Employee save(Employee t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Employee update(Employee t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Employee delete(int id) {
        Employee employee = (Employee) sessionFactory.getCurrentSession().load(Employee.class, id);
        sessionFactory.getCurrentSession().delete(employee);
        return employee;
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> eList = sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
        return eList;

    }

    @Override
    public Employee getById(int id) {
        Employee employee = (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
        return employee;
    }

}
