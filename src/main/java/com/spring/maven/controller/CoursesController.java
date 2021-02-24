/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.controller;

import com.spring.maven.controller.impl.ILoginController;
import com.spring.maven.model.Courses;
import com.spring.maven.services.impl.ICoursesServices;
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
@RequestMapping(value = "/courses")
public class CoursesController implements ILoginController {

    @Autowired
    ICoursesServices coursesServices;

    @Override
    @RequestMapping(value = "/create")
    public ModelAndView create() {
        return new ModelAndView("courses/create");
    }

    @Override
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
        Courses c = coursesServices.save(request);
        Map<String, Object> map = new HashMap<>();
        if (c != null) {
            map.put("status", "Data Added Successfully");
            return new ModelAndView("/courses/create", "map", map);
        } else {
            map.put("status", "Data Added Failed");
            return new ModelAndView("/courses/create", "map", map);
        }
    }

    @Override
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(HttpServletRequest request) {
        Courses c = coursesServices.update(request);
        return new ModelAndView("redirect:/courses/view");
    }

    @Override
     @RequestMapping(value = "/delete/{cId}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("cId") int id) {
   Courses c= coursesServices.delete(id);
       return new ModelAndView("redirect:/courses/view");
    }

    @Override
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Courses> cList = coursesServices.getAll();
        map.put("cList", cList);
        return new ModelAndView("courses/view", "map", map);
    }

    @Override
    @RequestMapping(value = "/edit/{cId}", method = RequestMethod.GET)
    public ModelAndView edit(ModelMap map, @PathVariable("cId") int id) {
        Courses c = coursesServices.getById(id);
        map.addAttribute("c", c);
        return new ModelAndView("courses/update");
    }

}
