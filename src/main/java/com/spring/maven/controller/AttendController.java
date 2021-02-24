/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.spring.maven.controller.impl.IAttendController;
import com.spring.maven.model.AssignTraineeCourseLab;
import com.spring.maven.model.Attendance;
import com.spring.maven.services.impl.IAssignTraineeCourseLabServices;
import com.spring.maven.services.impl.IAttendServices;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value = "/attend")
public class AttendController implements IAttendController {

    @Autowired
    IAttendServices attendServices;
    @Autowired
    IAssignTraineeCourseLabServices assignTraineeCourseLabServices;

    @Override
    @RequestMapping(value = "/create")
    public ModelAndView create() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<AssignTraineeCourseLab> asList = assignTraineeCourseLabServices.getAll();
        map.put("asList", asList);
        return new ModelAndView("attend/tAttend", "map", map);
    }

    @Override
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Attendance> attList = attendServices.getAll();
        map.put("attList", attList);
        return new ModelAndView("attend/tAttendReport", "map", map);
    }

//    @RequestMapping(value = "/getAllAssignTraineeCourseLabs", method = RequestMethod.GET)
//    public List<AssignTraineeCourseLab> getAllAssignTraineeCourseLabs() {
//        List<AssignTraineeCourseLab> attList = assignTraineeCourseLabServices.getAll();
//        GsonBuilder gson = new GsonBuilder();
//        Gson g = gson.create();
//        return attList;
//    }
    @Override
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
        List<Attendance> a = attendServices.saveAttends(request);
        if (a != null) {
            return new ModelAndView("attend/done");
        } else {
            return new ModelAndView("attend/success");
        }

    }

    @Override
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(HttpServletRequest request) {
        Attendance p = attendServices.update(request);
//        return new ModelAndView("redirect:/attend/view");
        return new ModelAndView("attend/update");
    }

    @Override
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {
        Attendance p = attendServices.delete(id);
        return new ModelAndView("redirect:/attend/view");
    }

    @Override
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(ModelMap map, @PathVariable("id") int id) {
        Attendance p = attendServices.getById(id);
        map.addAttribute("p", p);
        return new ModelAndView("attend/update");
    }

    
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView getByDateAndRound(HttpServletRequest request) {
        String dates = request.getParameter("dates");
        String rounds = request.getParameter("rounds");

        System.out.println(rounds);
        System.out.println(dates);

        Map<String, Object> map = new HashMap<>();
        List<Attendance> attList =attendServices.getAttendByDate(dates, rounds);
        map.put("attList", attList);
        return new ModelAndView("attend/tAttendReport", "map", map);
    }
    


//    @RequestMapping(value = "/search", method = RequestMethod.GET)
//    public ModelAndView getByTimeAndDate(HttpServletRequest request) {
//
//        String times = request.getParameter("times");
//        String dates = request.getParameter("dates");
//        System.out.println(times);
//        System.out.println(dates);
//
//        Map<String, Object> map = new HashMap<>();
//        List<Attendance> aList = attendServices.getAttendByDate(times, dates);
//        map.put("aList", aList);
//        return new ModelAndView("attend/tAttendReport", "map", map);
//    }

    
//    @RequestMapping(value = "/search", method = RequestMethod.GET)
//    public ModelAndView getByMonthAndYear(HttpServletRequest request) {
//      
//        System.out.println(request.getParameter("months"));
//         Map<String, Object> map = new HashMap<>();
//        List<Attend> salaries = attendServices.getSlaryByMonth(request.getParameter("months"), request.getParameter("years"));
//         map.put("salaries", salaries);
//        return new ModelAndView("attend/attendReport", "map", map);
//    }
}
