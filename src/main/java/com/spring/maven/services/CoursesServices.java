/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services;

import com.spring.maven.dao.impl.ICoursesDAO;
import com.spring.maven.model.Courses;
import com.spring.maven.services.impl.ICoursesServices;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service(value = "coursesServices")
public class CoursesServices implements ICoursesServices {

    @Autowired
    ICoursesDAO coursesDAO;

    @Override
    public Courses save(HttpServletRequest request) {
        String cName = request.getParameter("cName");
        String code = request.getParameter("code");
        int duration = Integer.parseInt(request.getParameter("duration"));
        Map<String, String[]> map = request.getParameterMap();
        Courses c = new Courses();
        c.setCode(code);
        c.setcName(cName);
        c.setDuration(duration);
        return coursesDAO.save(c);
    }

    @Override
    public Courses update(HttpServletRequest request) {
        int cId = Integer.parseInt(request.getParameter("cId"));
        String cName = request.getParameter("cName");
        String code = request.getParameter("code");
        int duration = Integer.parseInt(request.getParameter("duration"));
        Map<String, String[]> map = request.getParameterMap();
        Courses c = new Courses();
        c.setcId(cId);
        c.setcName(cName);
        c.setCode(code);
        c.setDuration(duration);
        return coursesDAO.update(c);
    }

    @Override
    public Courses delete(int id) {
        return coursesDAO.delete(id);
    }

    @Override
    public List<Courses> getAll() {
        List<Courses> cList = coursesDAO.getAll();
        return cList;
    }

    @Override
    public Courses getById(int id) {
        return coursesDAO.getById(id);
    }

}
