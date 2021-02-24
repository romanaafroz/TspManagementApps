/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.controller;

import com.spring.maven.controller.impl.ILoginController;
import com.spring.maven.model.Login;
import com.spring.maven.model.User;
import com.spring.maven.services.impl.ILoginServices;
import com.spring.maven.services.impl.IUserServices;
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
@RequestMapping(value = "/login")
public class LoginController implements ILoginController {

    @Autowired
    ILoginServices loginServices;
    @Autowired
    IUserServices userServices;

    @Override
    @RequestMapping(value = "/login")
    public ModelAndView create() {
        Map<String, Object> map = new HashMap<>();
        List<User> userList = userServices.getAll();
        map.put("userList", userList);
        return new ModelAndView("login/login");
    }

    @Override
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
        Login c = loginServices.save(request);
        Map<String, Object> map = new HashMap<>();
        if (c != null) {
            map.put("status", "Data Added Successfully");
            return new ModelAndView("/login/login", "map", map);
        } else {
            map.put("status", "Data Added Failed");
            return new ModelAndView("/login/login", "map", map);
        }
    }

//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public ModelAndView login(HttpServletRequest req) {
//        String username = req.getParameter("frontuser");
//        String password = req.getParameter("frontPass");
//
//        if (username.equalsIgnoreCase("Client") && password.equalsIgnoreCase("1234")) {
//            Map<String, Object> map = new HashMap<String, Object>();
//            List<ClientJobs> jobList = clientJobService.getAll();
//            map.put("jobList", jobList);
//            return new ModelAndView("/client/client", "map", map);
//        } else if (username.equalsIgnoreCase("freelancer") && password.equalsIgnoreCase("1234")) {
//            return new ModelAndView("/freelancer/freelancer");
//        } else {
//            return new ModelAndView("Wrong Username or Password");
//        }
//    }
    @Override
    @RequestMapping(value = "/update", method = RequestMethod.POST)

    public ModelAndView update(HttpServletRequest request) {
        Login c = loginServices.update(request);
        return new ModelAndView("redirect:/login/view");
    }

    @Override
    @RequestMapping(value = "/delete/{cId}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("cId") int id) {
        Login c = loginServices.delete(id);
        return new ModelAndView("redirect:/login/view");
    }

    @Override
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Login> cList = loginServices.getAll();
        map.put("cList", cList);
        return new ModelAndView("login/view", "map", map);
    }

    @Override
    @RequestMapping(value = "/edit/{cId}", method = RequestMethod.GET)
    public ModelAndView edit(ModelMap map, @PathVariable("cId") int id) {
        Login c = loginServices.getById(id);
        map.addAttribute("c", c);
        return new ModelAndView("login/update");
    }

}
