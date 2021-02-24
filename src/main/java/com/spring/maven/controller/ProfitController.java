/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.controller;

import com.spring.maven.controller.impl.IProfitController;
import com.spring.maven.model.AssignAccount;
import com.spring.maven.model.Profit;
import com.spring.maven.services.impl.IAssignAccountServices;
import com.spring.maven.services.impl.IExpenseServices;
import com.spring.maven.services.impl.IPaymentServices;
import com.spring.maven.services.impl.IProfitServices;
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
@RequestMapping(value = "/profit")
public class ProfitController implements IProfitController {

    @Autowired
    IProfitServices profitServices;
    @Autowired
    IAssignAccountServices assignAccountServices;
    @Autowired
    IPaymentServices paymentServices;
    @Autowired
    IExpenseServices expenseServices;

    @Override
    @RequestMapping(value = "/create")
    public ModelAndView create() {
        Map<String, Object> map = new HashMap<String, Object>();
        int earning = paymentServices.getTotal();
        int expense = expenseServices.getTotal();
        map.put("earning", earning);
        map.put("expense", expense);
        return new ModelAndView("profit/create", "map", map);
    }

    @Override
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Profit> pList = profitServices.getAll();
        List<AssignAccount> eList = assignAccountServices.getAll();
        map.put("pList", pList);
        map.put("eList", eList);
        return new ModelAndView("profit/profitReport", "map", map);
    }

//    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
//    public List<Employee> getAllEmployees() {
//        List<Employee> eList = employeeServices.getAll();
//        GsonBuilder gson = new GsonBuilder();
//        Gson g = gson.create();
//        return eList;
//    }
    @Override
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
        List<Profit> p = profitServices.saveProfits(request);
        if (p != null) {
            return new ModelAndView("profit/done");
        } else {
            return new ModelAndView("profit/success");
        }

    }

    @Override
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(HttpServletRequest request) {
        Profit p = profitServices.update(request);
//        return new ModelAndView("redirect:/profit/view");
        return new ModelAndView("profit/update");
    }

    @Override
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {
        Profit p = profitServices.delete(id);
        return new ModelAndView("redirect:/profit/view");
    }

    @Override
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(ModelMap map, @PathVariable("id") int id) {
        Profit p = profitServices.getById(id);
        map.addAttribute("p", p);
        return new ModelAndView("profit/update");
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView getByMonthAndYear(HttpServletRequest request) {

        String months = request.getParameter("months");
        String years = request.getParameter("years");
        System.out.println(months);
        System.out.println(years);

        Map<String, Object> map = new HashMap<>();
        List<Profit> pList = profitServices.getSlaryByMonth(months, years);
        map.put("pList", pList);
        return new ModelAndView("profit/profitReport", "map", map);
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
