/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.controller;

import com.spring.maven.controller.impl.IAssetController;
import com.spring.maven.model.Asset;
import com.spring.maven.services.impl.IAssetServices;
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
@RequestMapping(value = "/asset")
public class AssetController implements IAssetController {

    @Autowired
    IAssetServices assetServices;

    @Override
    @RequestMapping(value = "/create")
    public ModelAndView create() {
        return new ModelAndView("asset/create");
    }

    @Override
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
        Asset a = assetServices.save(request);
        Map<String, Object> map = new HashMap<>();
        if (a != null) {
            map.put("status", "Data Added Successfully");
            return new ModelAndView("/asset/create", "map", map);
        } else {
            map.put("status", "Data Added Failed");
            return new ModelAndView("/asset/create", "map", map);
        }
    }

    @Override
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(HttpServletRequest request) {
        Asset a = assetServices.update(request);
        return new ModelAndView("redirect:/asset/view");
    }

    @Override
    @RequestMapping(value = "/delete/{assetId}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("assetId") int id) {
        Asset t = assetServices.delete(id);
        return new ModelAndView("redirect:/asset/view");
    }

    @Override
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Asset> aList = assetServices.getAll();
        int totalCost = assetServices.getTotal();
        System.out.println(totalCost);
        map.put("totalCost", totalCost);
        map.put("aList", aList);
        return new ModelAndView("asset/view", "map", map);
    }

    @Override
    @RequestMapping(value = "/edit/{assetId}", method = RequestMethod.GET)
    public ModelAndView edit(ModelMap map, @PathVariable("assetId") int id) {
        Asset a = assetServices.getById(id);
        map.addAttribute("a", a);
        return new ModelAndView("asset/update", "map", map);
    }

}
