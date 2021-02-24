/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.dao;

import com.spring.maven.dao.impl.IAttendDAO;
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
@Repository(value = "attendDAO")
@Transactional
public class AttendDAO implements IAttendDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Attendance save(Attendance t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Attendance update(Attendance t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Attendance delete(int id) {
        Attendance attend = (Attendance) sessionFactory.getCurrentSession().load(Attendance.class, id);
        sessionFactory.getCurrentSession().delete(attend);
        return attend;
    }

    @Override
    public List<Attendance> getAll() {
        List<Attendance> pList = sessionFactory.getCurrentSession().createCriteria(Attendance.class).list();
        return pList;

    }

    @Override
    public Attendance getById(int id) {
        Attendance attend = (Attendance) sessionFactory.getCurrentSession().get(Attendance.class, id);
        return attend;
    }

//    public List<Attendance> getSlaryByMonth(String month, String year) {
//        String hql = "from attend where year = :year AND month = :month";
//        Query q = sessionFactory.getCurrentSession().createQuery(hql);
//        q.setParameter("month", month);
//        q.setParameter("year", year);
//        List<Attendance> pl = q.list();
//        System.out.println(pl);
//        return pl;
//    }

//    @Override
//    public List<Attendance> getAttendByDate(String round, String batch) {
//        String hql = "from attend where round = :round AND batch = :batch";
//        Query q = sessionFactory.getCurrentSession().createQuery(hql);
//        q.setParameter("round", round);
//        q.setParameter("batch", batch);
//        List<Attendance> att = q.list();
//        System.out.println(att);
//        return att;
//    }
    @Override
    public List<Attendance> getAttendByDate(String date, String round) {
        String hql = "from attendance where date = :date AND round = :round";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        q.setParameter("date", date);
        q.setParameter("round", round);
        List<Attendance> att = q.list();
        System.out.println(att);
        return att;
    }

}
