/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.spring.maven.controller.impl.IPayrollController;
import com.spring.maven.model.Employee;
import com.spring.maven.model.Payroll;
import com.spring.maven.services.impl.IEmployeeServices;
import com.spring.maven.services.impl.IPayrollServices;
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
@RequestMapping(value = "/payroll")
public class PayrollController implements IPayrollController {

    @Autowired
    IPayrollServices payrollServices;
    @Autowired
    IEmployeeServices employeeServices;

    @Override
    @RequestMapping(value = "/create")
    public ModelAndView create() {
        return new ModelAndView("payroll/empPayroll");
    }

    @Override
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Payroll> pList = payrollServices.getAll();
//        List<Employee> eList = employeeServices.getAll();
        map.put("pList", pList);
//        map.put("eList", eList);
        return new ModelAndView("payroll/payrollReport", "map", map);
    }

    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
    public List<Employee> getAllEmployees() {
        List<Employee> eList = employeeServices.getAll();
        GsonBuilder gson = new GsonBuilder();
        Gson g = gson.create();
        return eList;
    }

    @Override
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
        List<Payroll> p = payrollServices.savePayrolls(request);
        if (p != null) {
            return new ModelAndView("payroll/done");
        } else {
            return new ModelAndView("payroll/success");
        }

    }

    @Override
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(HttpServletRequest request) {
        Payroll p = payrollServices.update(request);
//        return new ModelAndView("redirect:/payroll/view");
        return new ModelAndView("payroll/update");
    }

    @Override
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {
        Payroll p = payrollServices.delete(id);
        return new ModelAndView("redirect:/payroll/view");
    }

    @Override
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(ModelMap map, @PathVariable("id") int id) {
        Payroll p = payrollServices.getById(id);
        map.addAttribute("p", p);
        return new ModelAndView("payroll/update");
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView getByMonthAndYear(HttpServletRequest request) {
      
        String months = request.getParameter("months");
        String years = request.getParameter("years");
        System.out.println(months);
        System.out.println(years);
        
         Map<String, Object> map = new HashMap<>();
         List<Payroll> pList = payrollServices.getSlaryByMonth(months, years);
         map.put("pList", pList);
        return new ModelAndView("payroll/payrollReport", "map", map);
    }
    

//    @RequestMapping(value = "/search", method = RequestMethod.POST)
//     public ModelAndView getBySourceAndDeparture(HttpServletRequest request){
////        Map<String, Object> map = new HashMap<>();
////         Map<String, Object> map = new HashMap<>();
////         List<Flight> flights = flightService.getBySourceAndDeparture(request.getParameter("fromVal"), request.getParameter("toVal"));
////         map.put("flights", flights);
////         return new ModelAndView("flight/serchFlight", "map", map);
//    }

}
