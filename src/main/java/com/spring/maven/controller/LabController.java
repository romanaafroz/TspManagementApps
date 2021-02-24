/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.controller;

import com.spring.maven.controller.impl.ILabController;
import com.spring.maven.model.Lab;
import com.spring.maven.services.impl.ILabServices;
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
@RequestMapping(value = "/lab")
public class LabController implements ILabController {

    @Autowired
    ILabServices labServices;

    @Override
    @RequestMapping(value = "/create")
    public ModelAndView create() {
        return new ModelAndView("lab/create");
    }

    @Override
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
        Lab lab = labServices.save(request);
        Map<String, Object> map = new HashMap<>();
        if (lab != null) {
            map.put("status", "Data Added Successfully");
            return new ModelAndView("/lab/create", "map", map);
        } else {
            map.put("status", "Data Added Failed");
            return new ModelAndView("/lab/create", "map", map);
        }
    }

    @Override
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(HttpServletRequest request) {
        Lab lab = labServices.update(request);
        return new ModelAndView("redirect:/lab/view");
    }

    @Override
    @RequestMapping(value = "/delete/{lId}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("lId") int id) {
        Lab lab = labServices.delete(id);
        return new ModelAndView("redirect:/lab/view");
    }

    @Override
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Lab> labList = labServices.getAll();
        map.put("labList", labList);
        return new ModelAndView("lab/view", "map", map);
    }

    @Override
    @RequestMapping(value = "/edit/{lId}", method = RequestMethod.GET)
    public ModelAndView edit(ModelMap map, @PathVariable("lId") int id) {
        Lab lab = labServices.getById(id);
        map.addAttribute("lab", lab);
        return new ModelAndView("lab/update");
    }

   

}
