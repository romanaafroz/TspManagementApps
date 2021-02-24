/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.controller;

import com.spring.maven.controller.impl.IPaymentController;
import com.spring.maven.model.AssignTraineeCourseLab;
import com.spring.maven.model.Payment;
import com.spring.maven.services.impl.IAssignTraineeCourseLabServices;
import com.spring.maven.services.impl.IPaymentServices;
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
@RequestMapping(value = "/payment")
public class PaymentController implements IPaymentController {

    @Autowired
    IPaymentServices paymentServices;
    @Autowired
    IAssignTraineeCourseLabServices assignTraineeCourseLabServices;

    @Override
    @RequestMapping(value = "/create")
    public ModelAndView create() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<AssignTraineeCourseLab> asList = assignTraineeCourseLabServices.getAll();
        map.put("asList", asList);
        return new ModelAndView("payment/paymentCreate", "map", map);
    }

    @Override
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
        Payment pay = paymentServices.save(request);
       
        Map<String, Object> map = new HashMap<>();
        if (pay != null) {
            map.put("status", "Data Added Successfully");
            return new ModelAndView("/payment/paymentCreate", "map", map);
        } else {
            map.put("status", "Data Added Failed");
            return new ModelAndView("/payment/paymentCreate", "map", map);
        }
    }

    @Override
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(HttpServletRequest request) {
        Payment payment = paymentServices.update(request);
        return new ModelAndView("redirect:/payment/paymentReport");
    }

    @Override
    @RequestMapping(value = "/delete/{payId}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("payId") int id) {
        Payment payment = paymentServices.delete(id);
        return new ModelAndView("redirect:/payment/paymentReport");
    }

    @Override
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Payment> payList = paymentServices.getAll();
         int total = paymentServices.getTotal();
        System.out.println(total);
        map.put("payList", payList);
        map.put("total", total);
        return new ModelAndView("payment/paymentReport", "map", map);
    }

    @Override
    @RequestMapping(value = "/edit/{payId}", method = RequestMethod.GET)
    public ModelAndView edit(ModelMap map, @PathVariable("payId") int id) {
        Payment pay = paymentServices.getById(id);
        map.addAttribute("pay", pay);
        return new ModelAndView("payment/paymentUpdate");
    }

}
