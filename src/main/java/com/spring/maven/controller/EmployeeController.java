/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.controller;

import com.spring.maven.controller.impl.IEmployeeController;
import com.spring.maven.model.Employee;
import com.spring.maven.services.impl.IEmployeeServices;
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
@RequestMapping(value = "/employee")
public class EmployeeController implements IEmployeeController {

    @Autowired
    IEmployeeServices employeeServices;

    @Override
    @RequestMapping(value = "/create")
    public ModelAndView create() {
     return new ModelAndView("employee/create");
    }

    @Override
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
        Employee e = employeeServices.save(request);
        Map<String, Object> map = new HashMap<>();
        if (e != null) {
            map.put("status", "Data Added Successfully");
            return new ModelAndView("/employee/create", "map", map);
        } else {
            map.put("status", "Data Added Failed");
            return new ModelAndView("/employee/create", "map", map);
        }
    }

    @Override
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(HttpServletRequest request) {
        Employee e = employeeServices.update(request);
        return new ModelAndView("redirect:/employee/view");
    }

    @Override
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {
        Employee e = employeeServices.delete(id);
        return new ModelAndView("redirect:/employee/view");
    }

    @Override
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Employee> eList = employeeServices.getAll();
        map.put("eList", eList);
        return new ModelAndView("employee/view", "map", map);
    }

    @Override
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(ModelMap map, @PathVariable("id") int id) {
        Employee e = employeeServices.getById(id);
        map.addAttribute("e", e);
        return new ModelAndView("employee/update");
    }

}
