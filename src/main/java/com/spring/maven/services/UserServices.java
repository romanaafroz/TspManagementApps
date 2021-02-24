/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services;

import com.spring.maven.dao.impl.IUserDAO;
import com.spring.maven.model.User;
import com.spring.maven.services.impl.IUserServices;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service(value = "userServices")
public class UserServices implements IUserServices {

    @Autowired
    IUserDAO userDAO;

    @Override
    public User save(HttpServletRequest request) {
        String uName = request.getParameter("uName");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");

        Map<String, Object> map = new HashMap<>();
        User user = new User();
        user.setuName(uName);
        user.setEmail(email);
        user.setPass(pass);
        return userDAO.save(user);

    }

    @Override
    public User update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User delete(int id) {
        return userDAO.delete(id);
    }

    @Override
    public List<User> getAll() {
        List<User> assList = userDAO.getAll();
        return assList;
    }

    @Override
    public User getById(int id) {
        return userDAO.getById(id);
    }
//
//    @Override
//    public List<User> getByRoundAndBatch(String rounds, String batchs) {
//        List<User> aList = userDAO.getByRoundAndBatch(rounds, batchs);
//        return aList;
//    }

}
