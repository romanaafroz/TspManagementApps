/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.controller;

import com.spring.maven.services.impl.IExpenseServices;
import com.spring.maven.services.impl.IPaymentServices;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author B3
 */
@RestController
@RequestMapping("accounting")
public class daillyExController {

    @Autowired
    IPaymentServices paymentServices;
    @Autowired
    IExpenseServices expenseServices;

    @RequestMapping("/accountDash")
    public ModelAndView index() {
        Map<String, Object> map = new HashMap<String, Object>();
        int earning = paymentServices.getTotal();
        int expense = expenseServices.getTotal();
        map.put("earning", earning);
        map.put("expense", expense);
        return new ModelAndView("accounting/accountDash", "map" ,map);

    }
}
