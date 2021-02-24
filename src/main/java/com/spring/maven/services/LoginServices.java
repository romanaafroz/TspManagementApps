/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services;

import com.spring.maven.dao.impl.ILoginDAO;
import com.spring.maven.model.Login;
import com.spring.maven.services.impl.ILoginServices;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service(value = "loginServices")
public class LoginServices implements ILoginServices {

    @Autowired
    ILoginDAO loginDAO;

    @Override
    public Login save(HttpServletRequest request) {
        String cName = request.getParameter("cName");
        String code = request.getParameter("code");
        int duration = Integer.parseInt(request.getParameter("duration"));
        Map<String, String[]> map = request.getParameterMap();
        Login c = new Login();
       
        return loginDAO.save(c);
    }

    @Override
    public Login update(HttpServletRequest request) {
        int cId = Integer.parseInt(request.getParameter("cId"));
        String cName = request.getParameter("cName");
        String code = request.getParameter("code");
        int duration = Integer.parseInt(request.getParameter("duration"));
        Map<String, String[]> map = request.getParameterMap();
        Login c = new Login();
        
        return loginDAO.update(c);
    }

    @Override
    public Login delete(int id) {
        return loginDAO.delete(id);
    }

    @Override
    public List<Login> getAll() {
        List<Login> cList = loginDAO.getAll();
        return cList;
    }

    @Override
    public Login getById(int id) {
        return loginDAO.getById(id);
    }

}
