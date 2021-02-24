/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services;

import com.spring.maven.dao.impl.IAssignFacultyDAO;
import com.spring.maven.dao.impl.ICoursesDAO;
import com.spring.maven.dao.impl.IFacultyDAO;
import com.spring.maven.dao.impl.ILabDAO;
import com.spring.maven.model.AssignFaculty;
import com.spring.maven.model.Courses;
import com.spring.maven.model.Faculty;
import com.spring.maven.model.Lab;
import com.spring.maven.services.impl.IAssignFacultyServices;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service(value = "assignFacultyServices")
public class AssignFacultyServices implements IAssignFacultyServices {

    @Autowired
    IAssignFacultyDAO assignFacultyDAO;
    @Autowired
    IFacultyDAO facultyDAO;
    @Autowired
    ICoursesDAO coursesDAO;
    @Autowired
    ILabDAO labDAO;

    @Override
    public AssignFaculty save(HttpServletRequest request) {

        AssignFaculty ast = new AssignFaculty();

        int fid = Integer.parseInt(request.getParameter("name"));
        Faculty t = facultyDAO.getById(fid);
        int id = t.getId();
        String name = t.getName();
        String gender = t.getGender();
        String salary = t.getSalary();
        String email = t.getEmail();
        String contact = t.getContact();
        String address = t.getAddress();
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

        ast.setId(id);
        ast.setName(name);
        ast.setGender(gender);
        ast.setSalary(salary);
        ast.setEmail(email);
        ast.setContact(contact);
        ast.setAddress(address);

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
        assignFacultyDAO.save(ast);
        return ast;
    }

    @Override
    public AssignFaculty update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AssignFaculty delete(int id) {
        return assignFacultyDAO.delete(id);
    }

    @Override
    public List<AssignFaculty> getAll() {
        List<AssignFaculty> assList = assignFacultyDAO.getAll();
        return assList;
    }

    @Override
    public AssignFaculty getById(int id) {
        return assignFacultyDAO.getById(id);
    }

//    @Override
//    public List<AssignFaculty> getByRoundAndBatch(String rounds, String batchs) {
//        List<AssignFaculty> aList = assignFacultyDAO.getByRoundAndBatch(rounds, batchs);
//        return aList;
//    }

}
