/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.controller;

import com.spring.maven.controller.impl.IExpenseController;
import com.spring.maven.model.Expense;
import com.spring.maven.services.impl.IExpenseServices;
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
@RequestMapping(value = "/expense")
public class ExpenseController implements IExpenseController {

    @Autowired
    IExpenseServices expenseServices;

    @Override
    @RequestMapping(value = "/create")
    public ModelAndView create() {
     return new ModelAndView("expense/create");
    }

    @Override
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
        Expense e = expenseServices.save(request);
        Map<String, Object> map = new HashMap<>();
        if (e != null) {
            map.put("status", "Data Added Successfully");
            return new ModelAndView("/expense/create", "map", map);
        } else {
            map.put("status", "Data Added Failed");
            return new ModelAndView("/expense/create", "map", map);
        }
    }

    @Override
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(HttpServletRequest request) {
        Expense e = expenseServices.update(request);
        return new ModelAndView("redirect:/expense/view");
    }

    @Override
    @RequestMapping(value = "/delete/{exId}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("exId") int id) {
        Expense e = expenseServices.delete(id);
        return new ModelAndView("redirect:/expense/view");
    }

    @Override
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Expense> eList = expenseServices.getAll();
        int total = expenseServices.getTotal();
        map.put("eList", eList);
        map.put("total", total);
        return new ModelAndView("expense/view", "map", map);
    }

    @Override
    @RequestMapping(value = "/edit/{exId}", method = RequestMethod.GET)
    public ModelAndView edit(ModelMap map, @PathVariable("exId") int id) {
        Expense e = expenseServices.getById(id);
        map.addAttribute("e", e);
        return new ModelAndView("expense/update");
    }

}
