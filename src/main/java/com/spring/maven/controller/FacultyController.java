/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.controller;

import com.spring.maven.controller.impl.IFacultyController;
import com.spring.maven.model.Courses;
import com.spring.maven.model.Faculty;
import com.spring.maven.services.impl.ICoursesServices;
import com.spring.maven.services.impl.IFacultyService;
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
@RequestMapping(value = "/faculty")
public class FacultyController implements IFacultyController {

    @Autowired
    IFacultyService facultyServices;

    @Override
    @RequestMapping(value = "/create")
    public ModelAndView create() {
//        Map<String, Object> map = new HashMap<String, Object>();
//        List<Courses> cList = coursesServices.getAll();
//        map.put("cList", cList);
//        return new ModelAndView("faculty/create", "map", map);
        return new ModelAndView("faculty/create");
    }

    @Override
     @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
        Faculty f = facultyServices.save(request);
        Map<String, Object> map = new HashMap<>();
        if (f != null) {
            map.put("status", "Data Added Successfully");
            return new ModelAndView("/faculty/create", "map", map);
        } else {
            map.put("status", "Data Added Failed");
            return new ModelAndView("/faculty/create", "map", map);
        }
    }

    @Override
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(HttpServletRequest request) {
        Faculty f = facultyServices.update(request);
        return new ModelAndView("redirect:/faculty/view");
    }

    @Override
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {
        Faculty f = facultyServices.delete(id);
        return new ModelAndView("redirect:/faculty/view");
    }

    @Override
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Faculty> fList = facultyServices.getAll();
        map.put("fList", fList);
        return new ModelAndView("faculty/view", "map", map);
    }

    @Override
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(ModelMap map, @PathVariable("id") int id) {
        Faculty f = facultyServices.getById(id);
        map.addAttribute("f", f);
        return new ModelAndView("faculty/update");
    }

}
