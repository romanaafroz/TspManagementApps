/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.controller;

import com.spring.maven.controller.impl.IUserController;
import com.spring.maven.services.impl.IUserServices;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping(value = "/user")
public class UserController implements IUserController {

    @Autowired
    IUserServices userServices;

    @Override
    @RequestMapping(value = "/create")
    public ModelAndView create() {
        return new ModelAndView("user/createUser");
    }

    @Override
    @RequestMapping(value = "/userSave")
    public ModelAndView save(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        userServices.save(request);
        return new ModelAndView("user/createUser");
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

//    @RequestMapping(value = "/getTrainee/{tId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public String getTrainee(@PathVariable("tId") int id) {
//
//        System.out.println("...................... " + id);
//        GsonBuilder gson = new GsonBuilder();
//        Gson g = gson.create();
//        Trainee t = traineeServices.getById(id);
//        return g.toJson(t);
//    }
//
//    @RequestMapping(value = "/getFaculty/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public String getFaculty(@PathVariable("id") int id) {
//
//        System.out.println("...................... " + id);
//        GsonBuilder gson = new GsonBuilder();
//        Gson g = gson.create();
//        Faculty f = facultyService.getById(id);
//        return g.toJson(f);
//    }
//
//    @RequestMapping(value = "/getEmployee/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public String getLab(@PathVariable("id") int id) {
//
//        System.out.println("...................... " + id);
//        GsonBuilder gson = new GsonBuilder();
//        Gson g = gson.create();
//        Employee emp =employeeServices.getById(id);
//        return g.toJson(emp);
//    }
//    
//    @RequestMapping(value = "/search", method = RequestMethod.GET)
//    public ModelAndView getByRoundAndBatch(HttpServletRequest request) {
//
//        String rounds = request.getParameter("rounds");
//        String batchs = request.getParameter("batchs");
//        System.out.println(rounds);
//        System.out.println(batchs);
//
//        Map<String, Object> map = new HashMap<>();
//        List<User> asList = userServices.getByRoundAndBatch(rounds, batchs);
//        map.put("asList", asList);
//        return new ModelAndView("attend/tAttend", "map", map);
//    }
}
