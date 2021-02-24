/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.spring.maven.controller.impl.IAssignAccountController;
import com.spring.maven.model.AssignAccount;
import com.spring.maven.model.Expense;
import com.spring.maven.model.Payment;
import com.spring.maven.services.impl.IAssignAccountServices;
import com.spring.maven.services.impl.IExpenseServices;
import com.spring.maven.services.impl.IPaymentServices;
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
@RequestMapping(value = "/assignAccount")
public class AssignAccountController implements IAssignAccountController {

    @Autowired
    IAssignAccountServices assignAccountServices;

    @Autowired
    IExpenseServices expenseServices;

    @Autowired
    IPaymentServices paymentServices;

    

    @Override
    @RequestMapping(value = "/create")
    public ModelAndView create() {
        List<Expense> eList = expenseServices.getAll();
        List<Payment> payList = paymentServices.getAll();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("eList", eList);
        map.put("payList", payList);
        return new ModelAndView("assignAccount/accountCreate", "map", map);
    }

    @Override
    @RequestMapping(value = "/accountSave")
    public ModelAndView save(HttpServletRequest request) {
        assignAccountServices.save(request);
        return new ModelAndView("assignAccount/accountCreate");
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

    @RequestMapping(value = "/getExpense/{exId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getExpense(@PathVariable("exId") int id) {

        System.out.println("...................... " + id);
        GsonBuilder gson = new GsonBuilder();
        Gson g = gson.create();
        Expense expense = expenseServices.getById(id);
        return g.toJson(expense);
    }

    @RequestMapping(value = "/getPayment/{payId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getPayment(@PathVariable("payId") int id) {
        System.out.println("...................... " + id);
        GsonBuilder gson = new GsonBuilder();
        Gson g = gson.create();
        Payment pay = paymentServices.getById(id);
        return g.toJson(pay);
    }

    
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView getByRoundAndBatch(HttpServletRequest request) {

        String rounds = request.getParameter("rounds");
        String batchs = request.getParameter("batchs");
        System.out.println(rounds);
        System.out.println(batchs);

        Map<String, Object> map = new HashMap<>();
        List<AssignAccount> asList = assignAccountServices.getByRoundAndBatch(rounds, batchs);
        map.put("asList", asList);
        return new ModelAndView("attend/tAttend", "map", map);
    }
}
