/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping("admin")
public class dashboardController {

    @RequestMapping("/dashboard")
    public ModelAndView index() {
        return new ModelAndView("admin/dashboard");

    }

    @RequestMapping("/courses")
    public ModelAndView courses() {
        return new ModelAndView("admin/courses");

    }

    @RequestMapping("/managerCreate")
    public ModelAndView managerCreate() {
        return new ModelAndView("manager/create");

    }

    @RequestMapping("/create")
    public ModelAndView coursesCreate() {
        return new ModelAndView("courses/create");

    }

    @RequestMapping("/view")
    public ModelAndView coursesEdit() {
        return new ModelAndView("courses/view");

    }

    @RequestMapping("/update")
    public ModelAndView coursesUpdate() {
        return new ModelAndView("courses/update");

    }
}
