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
@RequestMapping(value = "/index")
public class NewController {
   
    @RequestMapping(value = "")
    public ModelAndView home() {
        return new ModelAndView("/index");

    }

    @RequestMapping("/about")
    public ModelAndView about() {
        return new ModelAndView("index/about");

    }
    @RequestMapping("/register")
    public ModelAndView register() {
        return new ModelAndView("index/register");

    }

    @RequestMapping("/blog")
    public ModelAndView blog() {
        return new ModelAndView("index/blog");

    }

    @RequestMapping("/courses")
    public ModelAndView courses() {
        return new ModelAndView("index/courses");

    }

    @RequestMapping("/teacher")
    public ModelAndView teacher() {
        return new ModelAndView("index/teacher");

    }

    @RequestMapping("/event")
    public ModelAndView event() {
        return new ModelAndView("index/event");

    }

    @RequestMapping("/dashboard")
    public ModelAndView dashboard() {
        return new ModelAndView("admin/dashboard");

    }
    @RequestMapping("/contact")
    public ModelAndView contact() {
        return new ModelAndView("index/contact");

    }

    @RequestMapping("/pages")
    public ModelAndView pages() {
        return new ModelAndView("index/pages");

    } 
}
