/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services;

import com.spring.maven.dao.impl.IFacultyDAO;
import com.spring.maven.model.Faculty;
import com.spring.maven.services.impl.IFacultyService;
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
@Service(value = "facultyServices")
public class FacultyServices implements IFacultyService {

    @Autowired
    IFacultyDAO facultyDAO;

    @Override
    public Faculty save(HttpServletRequest request) {
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String salary = request.getParameter("salary");
        String email = request.getParameter("email");
        String contact = request.getParameter("contact");
        String address = request.getParameter("address");
        Map<String, Object> map = new HashMap<>();
        Faculty f = new Faculty();
        f.setName(name);
        f.setGender(gender);
        f.setSalary(salary);
        f.setEmail(email);
        f.setContact(contact);
        f.setAddress(address);
        return facultyDAO.save(f);
    }

    @Override
    public Faculty update(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String salary = request.getParameter("salary");
        String email = request.getParameter("email");
        String contact = request.getParameter("contact");
        String address = request.getParameter("address");
        Map<String, Object> map = new HashMap<>();
        Faculty f = new Faculty();
        f.setId(id);
        f.setName(name);
        f.setGender(gender);
        f.setSalary(salary);
        f.setEmail(email);
        f.setContact(contact);
        f.setAddress(address);
        return facultyDAO.update(f);
    }

    @Override
    public Faculty delete(int id) {
        return facultyDAO.delete(id);
    }

    @Override
    public List<Faculty> getAll() {
        List<Faculty> fList = facultyDAO.getAll();
        return fList;
    }

    @Override
    public Faculty getById(int id) {
        return facultyDAO.getById(id);
    }

}
