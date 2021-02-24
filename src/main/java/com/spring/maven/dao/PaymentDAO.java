/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.dao;

import com.spring.maven.dao.impl.IPaymentDAO;
import com.spring.maven.model.Payment;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ASUS
 */
@Repository(value = "paymentDAO")
@Transactional
public class PaymentDAO implements IPaymentDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Payment save(Payment t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Payment update(Payment t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Payment delete(int id) {
        Payment payment = (Payment) sessionFactory.getCurrentSession().load(Payment.class, id);
        sessionFactory.getCurrentSession().delete(payment);
        return payment;
    }

    @Override
    public List<Payment> getAll() {
        List<Payment> lList = sessionFactory.getCurrentSession().createCriteria(Payment.class).list();
        return lList;

    }

    @Override
    public Payment getById(int id) {
        Payment payment = (Payment) sessionFactory.getCurrentSession().get(Payment.class, id);
        return payment;
    }

}
