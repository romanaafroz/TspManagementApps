/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.controller;

import com.spring.maven.controller.impl.IEmployeeSalaryController;
import com.spring.maven.model.Employee;
import com.spring.maven.model.EmployeeSalary;
import com.spring.maven.services.impl.IEmployeeSalaryServices;
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
@RequestMapping(value = "/employeeSalary")
public class EmployeeSalaryController implements IEmployeeSalaryController {

    @Autowired
    IEmployeeSalaryServices employeeSalaryServices;
    @Autowired
    IEmployeeServices employeeServices;

    @Override
    @RequestMapping(value = "/create")
    public ModelAndView create() {
        return new ModelAndView("employeeSalary/create");
    }

    @Override
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
        EmployeeSalary e = employeeSalaryServices.save(request);
        Map<String, Object> map = new HashMap<>();
        if (e != null) {
            map.put("status", "Data Added Successfully");
            return new ModelAndView("/employeeSalary/create", "map", map);
        } else {
            map.put("status", "Data Added Failed");
            return new ModelAndView("/employeeSalary/create", "map", map);
        }
    }

    @Override
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(HttpServletRequest request) {
//        EmployeeSalary e = employeeSalaryServices.update(request);
//        return new ModelAndView("redirect:/employeeSalary/view");
        Employee e = employeeServices.update(request);
        return new ModelAndView("employeeSalary/update");
    }
//    
//    @RequestMapping(value = "/update", method = RequestMethod.POST)
//    public ModelAndView update(HttpServletRequest request) {
//        Country c =  countryService.update(request);
//        return new ModelAndView("country/update");
//    }

    @Override
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {
        EmployeeSalary e = employeeSalaryServices.delete(id);
        return new ModelAndView("redirect:/employeeSalary/view");
    }

    @Override
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<EmployeeSalary> eList = employeeSalaryServices.getAll();
        map.put("eList", eList);
        return new ModelAndView("employeeSalary/view", "map", map);
    }

    @Override
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView edit(ModelMap map, @PathVariable("id") int id) {

        EmployeeSalary e = employeeSalaryServices.getById(id);

        e.geteId();
        return new ModelAndView("employeeSalary/create", "e", e);
    }

//    @RequestMapping(value = "/edit", method = RequestMethod.GET)
//    public ModelAndView edit(HttpServletRequest request) {
//        int id = Integer.parseInt(request.getParameter("id"));
//        Country c = countryService.getById(id);
//        c.setId(id);
//       return new ModelAndView("country/update", "c", c);
//    }
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView search(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        Employee e = employeeServices.getById(id);
        e.setId(id);
        return new ModelAndView("employeeSalary/create", "e", e);
    }
}
