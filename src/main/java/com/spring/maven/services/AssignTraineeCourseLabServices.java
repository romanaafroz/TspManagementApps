/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services;

import com.spring.maven.dao.impl.IAssignTraineeCourseLabDAO;
import com.spring.maven.dao.impl.ICoursesDAO;
import com.spring.maven.dao.impl.ILabDAO;
import com.spring.maven.dao.impl.ITraineeDAO;
import com.spring.maven.model.AssignTraineeCourseLab;
import com.spring.maven.model.Courses;
import com.spring.maven.model.Lab;
import com.spring.maven.model.Trainee;
import com.spring.maven.services.impl.IAssignTraineeCourseLabServices;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service(value = "assignTraineeCourseLabServices")
public class AssignTraineeCourseLabServices implements IAssignTraineeCourseLabServices {

    @Autowired
    IAssignTraineeCourseLabDAO assignTraineeCourseLabDAO;
    @Autowired
    ITraineeDAO traineeDAO;
    @Autowired
    ICoursesDAO coursesDAO;
    @Autowired
    ILabDAO labDAO;

    @Override
    public AssignTraineeCourseLab save(HttpServletRequest request) {

        AssignTraineeCourseLab ast = new AssignTraineeCourseLab();

        int tid = Integer.parseInt(request.getParameter("tName"));
        Trainee t = traineeDAO.getById(tid);
        int tId = t.gettId();
        String tName = t.gettName();
        String gender = t.getGender();
        String batch = t.getBatch();
        String dateOfBirth = t.getDateOfBirth();
        String round = t.getRound();
        String email = t.getEmail();
        String contact = t.getContact();
        String address = t.getAddress();
        int totalTrainee = t.getTotalTrainee();
//        int totalTrainee = Integer.parseInt(request.getParameter("totalTrainee"));

        System.out.println(address);

        int cid = Integer.parseInt(request.getParameter("cName"));
        Courses c = coursesDAO.getById(cid);
        int cId = c.getcId();
        String cName = c.getcName();
        String code = c.getCode();
        int duration = c.getDuration();

        int lid = Integer.parseInt(request.getParameter("labNo"));
        Lab lab = labDAO.getById(lid);
        int lId = lab.getlId();
        String labNo = lab.getLabNo();
        String labName = lab.getLabName();
        String labCode = lab.getLabCode();
        String shedule = lab.getSchedule();
        String des = lab.getDes();

        ast.settId(tId);
        ast.settName(tName);
        ast.setGender(gender);
        ast.setBatch(batch);
        ast.setDateOfBirth(dateOfBirth);
        ast.setRound(round);
        ast.setEmail(email);
        ast.setContact(contact);
        ast.setAddress(address);
        ast.setTotalTrainee(totalTrainee);

        ast.setcId(cId);
        ast.setcName(cName);
        ast.setCode(code);
        ast.setDuration(duration);

        ast.setlId(lId);
        ast.setLabNo(labNo);
        ast.setLabName(labName);
        ast.setLabCode(labCode);
        ast.setSchedule(shedule);
        ast.setDes(des);

//        ast.settId(Integer.parseInt(request.getParameter("tId")));
//        ast.settName(request.getParameter("tName"));
//        ast.setGender(request.getParameter("gender"));
//        ast.setBatch(request.getParameter("batch"));
//        ast.setDateOfBirth(request.getParameter("dateOfBirth"));
//        ast.setRound(request.getParameter("round"));
//        ast.setEmail(request.getParameter("email"));
//        ast.setContact(request.getParameter("contact"));
//        ast.setAddress(request.getParameter("address"));
//
//
//        ast.setcId(Integer.parseInt(request.getParameter("cId")));
//        ast.setcName(request.getParameter("cName"));
//        ast.setCode(request.getParameter("code"));
//        ast.setDuration(request.getParameter("duration"));
//
//        //lab field
//        ast.setlId(Integer.parseInt(request.getParameter("lId")));
//        ast.setLabNo(request.getParameter("labNo"));
//        ast.setSchedule(request.getParameter("schedule"));
        assignTraineeCourseLabDAO.save(ast);
        return ast;
    }

    @Override
    public AssignTraineeCourseLab update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AssignTraineeCourseLab delete(int id) {
        return assignTraineeCourseLabDAO.delete(id);
    }

    @Override
    public List<AssignTraineeCourseLab> getAll() {
        List<AssignTraineeCourseLab> assList = assignTraineeCourseLabDAO.getAll();
        return assList;
    }

    @Override
    public AssignTraineeCourseLab getById(int id) {
        return assignTraineeCourseLabDAO.getById(id);
    }

    @Override
    public List<AssignTraineeCourseLab> getByRoundAndBatch(String rounds, String batchs) {
     List<AssignTraineeCourseLab> aList = assignTraineeCourseLabDAO.getByRoundAndBatch(rounds, batchs);
    return aList;
    }

   

}
