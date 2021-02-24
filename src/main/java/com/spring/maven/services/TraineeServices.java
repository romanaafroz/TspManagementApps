/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services;

import com.spring.maven.dao.impl.ITraineeDAO;
import com.spring.maven.model.Trainee;
import com.spring.maven.services.impl.ITraineeServices;
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
@Service(value = "traineeServices")
public class TraineeServices implements ITraineeServices {

    @Autowired
    ITraineeDAO traineeDAO;
//     @Autowired
//     ILabDAO labDAO;
//     
//     @Autowired
//     ICoursesDAO coursesDAO;

    @Override
    public Trainee save(HttpServletRequest request) {
        String tName = request.getParameter("tName");
        String gender = request.getParameter("gender");
        String batch = request.getParameter("batch");
//        
//           Get Lab information from lab table
//        int lid = Integer.parseInt(request.getParameter("labId"));
//        Lab lab = labDAO.getById(lid);
//        
//        String fname = request.getParameter("fname");
        String dateOfBirth = request.getParameter("dateOfBirth");
        String round = request.getParameter("round");

//        Get Courses information from Courses Table  
//        int cid = Integer.parseInt(request.getParameter("cId"));
//        Courses course = coursesDAO.getById(cid);
        String email = request.getParameter("email");
        String contact = request.getParameter("contact");
        String address = request.getParameter("address");
        int totalTrainee = Integer.parseInt(request.getParameter("totalTrainee"));

        Map<String, Object> map = new HashMap<>();
        Trainee t = new Trainee();
        t.settName(tName);
        t.setGender(gender);
        t.setBatch(batch);

//       set lab information
//        t.setLabId(lab.getId());
//        t.setLabNo(lab.getLabNo());
//        
//        t.setFname(fname);
        t.setDateOfBirth(dateOfBirth);
        t.setRound(round);
//         
//       set course information  
//        t.setcId(course.getId());
//        t.setCourses(course.getName());

        t.setEmail(email);
        t.setContact(contact);
        t.setAddress(address);
        t.setTotalTrainee(totalTrainee);

        return traineeDAO.save(t);
    }

    @Override
    public Trainee update(HttpServletRequest request) {
        int tId = Integer.parseInt(request.getParameter("tId"));
        String tName = request.getParameter("tName");
        String gender = request.getParameter("gender");
        String batch = request.getParameter("batch");
//        
//        String labNo = request.getParameter("labNo");
//        String fname = request.getParameter("fname");

        String dateOfBirth = request.getParameter("dateOfBirth");
        String round = request.getParameter("round");

//        String courses = request.getParameter("courses");
        String email = request.getParameter("email");
        String contact = request.getParameter("contact");
        String address = request.getParameter("address");
        int totalTrainee = Integer.parseInt(request.getParameter("totalTrainee"));

        Map<String, Object> map = new HashMap<>();
        Trainee t = new Trainee();
        t.settName(tName);
        t.setGender(gender);
        t.setBatch(batch);
//        t.setLabNo(labNo);
//        t.setFname(fname);
        t.setDateOfBirth(dateOfBirth);
        t.setRound(round);
//        t.setCourses(courses);
        t.setEmail(email);
        t.setContact(contact);
        t.setAddress(address);
        t.setTotalTrainee(totalTrainee);
        return traineeDAO.update(t);
    }

    @Override
    public Trainee delete(int id) {
        return traineeDAO.delete(id);

    }

    @Override
    public List<Trainee> getAll() {
        List<Trainee> lList = traineeDAO.getAll();
        return lList;
    }

    @Override
    public Trainee getById(int id) {
        return traineeDAO.getById(id);
    }

}
