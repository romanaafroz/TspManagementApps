package com.spring.maven.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "home")
public class HomeController {

    @RequestMapping(value = "")
    public ModelAndView home() {
        return new ModelAndView("/home");

    }

    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("home/login");

    }

    @RequestMapping("/about")
    public ModelAndView about() {
        return new ModelAndView("home/about");

    }

    @RequestMapping("/blog")
    public ModelAndView blog() {
        return new ModelAndView("home/blog");

    }

    @RequestMapping("/courses")
    public ModelAndView courses() {
        return new ModelAndView("home/courses");

    }

    @RequestMapping("/teacher")
    public ModelAndView teacher() {
        return new ModelAndView("home/teacher");

    }

    @RequestMapping("/event")
    public ModelAndView event() {
        return new ModelAndView("home/event");

    }

    @RequestMapping("/dashboard")
    public ModelAndView dashboard() {
        return new ModelAndView("admin/dashboard");

    }
    @RequestMapping("/contact")
    public ModelAndView contact() {
        return new ModelAndView("home/contact");

    }

    @RequestMapping("/pages")
    public ModelAndView pages() {
        return new ModelAndView("home/pages");

    }

    @RequestMapping("/register")
    public ModelAndView register() {
        return new ModelAndView("home/register");

    }

    @RequestMapping("/payment")
    public ModelAndView payment() {
        return new ModelAndView("home/payment");

    }
}
