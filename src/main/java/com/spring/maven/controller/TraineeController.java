/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.controller;

import com.spring.maven.controller.impl.ITraineeController;
import com.spring.maven.model.Trainee;
import com.spring.maven.services.impl.ITraineeServices;
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
@RequestMapping(value = "/trainee")
public class TraineeController implements ITraineeController {

    @Autowired
    ITraineeServices traineeServices;
//     @Autowired
//    ICoursesServices coursesServices;
//      @Autowired
//    ILabServices labServices;

    @Override
    @RequestMapping(value = "/create")
    public ModelAndView create() {
//        Map<String, Object> map = new HashMap<String, Object>();
//        List<Courses> cList = coursesServices.getAll();
//        List<Lab> labList = labServices.getAll();
//        map.put("cList", cList);
//        map.put("labList", labList);
//        return new ModelAndView("trainee/create", "map", map);
        return new ModelAndView("trainee/create");
    }

    @Override
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
        Trainee t = traineeServices.save(request);
        Map<String, Object> map = new HashMap<>();
        if (t != null) {
            map.put("status", "Data Added Successfully");
            return new ModelAndView("/trainee/create", "map", map);
        } else {
            map.put("status", "Data Added Failed");
            return new ModelAndView("/trainee/create", "map", map);
        }
    }

    @Override
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(HttpServletRequest request) {
        Trainee t = traineeServices.update(request);
        return new ModelAndView("redirect:/trainee/view");
    }

    @Override
    @RequestMapping(value = "/delete/{tId}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("tId") int id) {
        Trainee t = traineeServices.delete(id);
        return new ModelAndView("redirect:/trainee/view");
    }

    @Override
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Trainee> tList = traineeServices.getAll();
        map.put("tList", tList);
        return new ModelAndView("trainee/view", "map", map);
    }

    @Override
    @RequestMapping(value = "/edit/{tId}", method = RequestMethod.GET)
    public ModelAndView edit(ModelMap map, @PathVariable("tId") int id) {
        Trainee t = traineeServices.getById(id);
        map.addAttribute("t", t);
        return new ModelAndView("trainee/update", "map", map);
    }

}
