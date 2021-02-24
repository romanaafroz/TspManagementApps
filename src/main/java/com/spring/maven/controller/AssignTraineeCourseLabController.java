/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.spring.maven.controller.impl.IAssignTraineeCourseLabController;
import com.spring.maven.model.AssignTraineeCourseLab;
import com.spring.maven.model.Courses;
import com.spring.maven.model.Lab;
import com.spring.maven.model.Trainee;
import com.spring.maven.services.impl.IAssignTraineeCourseLabServices;
import com.spring.maven.services.impl.IAttendServices;
import com.spring.maven.services.impl.ICoursesServices;
import com.spring.maven.services.impl.ILabServices;
import com.spring.maven.services.impl.ITraineeServices;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping(value = "/assign")
public class AssignTraineeCourseLabController implements IAssignTraineeCourseLabController {

    @Autowired
    IAssignTraineeCourseLabServices assignTraineeCourseLabServices;

    @Autowired
    ITraineeServices traineeServices;

    @Autowired
    ICoursesServices coursesServices;

    @Autowired
    ILabServices labServices;
    
    
    
    @Autowired
    IAttendServices attendServices;

    @Override
    @RequestMapping(value = "/create")
    public ModelAndView create() {
        List<Trainee> tList = traineeServices.getAll();
        List<Courses> cList = coursesServices.getAll();
        List<Lab> lList = labServices.getAll();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tList", tList);
        map.put("cList", cList);
        map.put("lList", lList);

        return new ModelAndView("assign/assignTrainee", "map", map);
    }

    @Override
    @RequestMapping(value = "/assignSave")
    public ModelAndView save(HttpServletRequest request) {
        assignTraineeCourseLabServices.save(request);
        return new ModelAndView("assign/assignTrainee");
    }

    @Override
    public ModelAndView edit(ModelMap map, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModelAndView getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @RequestMapping(value = "/getTrainee/{tId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getTrainee(@PathVariable("tId") int id) {

        System.out.println("...................... " + id);
        GsonBuilder gson = new GsonBuilder();
        Gson g = gson.create();
        Trainee t = traineeServices.getById(id);
        return g.toJson(t);
    }

    @RequestMapping(value = "/getCourses/{cId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getCourses(@PathVariable("cId") int id) {
        System.out.println("...................... " + id);
        GsonBuilder gson = new GsonBuilder();
        Gson g = gson.create();
        Courses c = coursesServices.getById(id);
        return g.toJson(c);
    }

    @RequestMapping(value = "/getLab/{lId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getLab(@PathVariable("lId") int id) {

        System.out.println("...................... " + id);
        GsonBuilder gson = new GsonBuilder();
        Gson g = gson.create();
        Lab lab = labServices.getById(id);
        return g.toJson(lab);
    }
    
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView getByRoundAndBatch(HttpServletRequest request) {

        String rounds = request.getParameter("rounds");
        String batchs = request.getParameter("batchs");
        System.out.println(rounds);
        System.out.println(batchs);

        Map<String, Object> map = new HashMap<>();
        List<AssignTraineeCourseLab> asList = assignTraineeCourseLabServices.getByRoundAndBatch(rounds, batchs);
        map.put("asList", asList);
        return new ModelAndView("attend/tAttend", "map", map);
    }
    
        @RequestMapping(value = "/search1", method = RequestMethod.GET)
    public List<AssignTraineeCourseLab> getByRoundAndBatch1(HttpServletRequest request) {

        String rounds = request.getParameter("rounds");
        String batchs = request.getParameter("batchs");
        System.out.println(rounds);
        System.out.println(batchs);

        List<AssignTraineeCourseLab> asList = assignTraineeCourseLabServices.getByRoundAndBatch(rounds, batchs);
        return asList;
    }
    
}
