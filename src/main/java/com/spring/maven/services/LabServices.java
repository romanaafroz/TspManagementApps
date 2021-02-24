/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services;

import com.spring.maven.dao.impl.ILabDAO;
import com.spring.maven.model.Lab;
import com.spring.maven.services.impl.ILabServices;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service(value = "labServices")
public class LabServices implements ILabServices {

    @Autowired
    ILabDAO labDAO;

    @Override
    public Lab save(HttpServletRequest request) {
        String labNo = request.getParameter("labNo");
        String labName = request.getParameter("labName");
        String labCode = request.getParameter("labCode");
        String schedule = request.getParameter("schedule");
        String des = request.getParameter("des");
        Map<String, Object> map = new HashMap<>();
        Lab lab = new Lab();
        lab.setLabNo(labNo);
        lab.setLabName(labName);
        lab.setLabCode(labCode);
        lab.setSchedule(schedule);
        lab.setDes(des);
        return labDAO.save(lab);
    }

    @Override
    public Lab update(HttpServletRequest request) {
        int lId = Integer.parseInt(request.getParameter("lId"));
        String labNo = request.getParameter("labNo");
        String labName = request.getParameter("labName");
        String labCode = request.getParameter("labCode");
        String schedule = request.getParameter("schedule");
        String des = request.getParameter("des");
        Map<String, Object> map = new HashMap<>();
        Lab lab = new Lab();
        lab.setlId(lId);
        lab.setLabNo(labNo);
        lab.setLabName(labName);
        lab.setLabCode(labCode);
        lab.setSchedule(schedule);
        lab.setDes(des);
        return labDAO.update(lab);
    }

    @Override
    public Lab delete(int id) {
        return labDAO.delete(id);

    }

    @Override
    public List<Lab> getAll() {
        List<Lab> lList = labDAO.getAll();
        return lList;
    }

    @Override
    public Lab getById(int id) {
        return labDAO.getById(id);
    }

}
