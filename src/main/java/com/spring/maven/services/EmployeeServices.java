/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services;

import com.spring.maven.dao.impl.IEmployeeDAO;
import com.spring.maven.model.Employee;
import com.spring.maven.services.impl.IEmployeeServices;
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
@Service(value = "employeeServices")
public class EmployeeServices implements IEmployeeServices {

    @Autowired
    IEmployeeDAO employeeDAO;

    @Override
    public Employee save(HttpServletRequest request) {
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String designation = request.getParameter("designation");
        int salary = Integer.parseInt(request.getParameter("salary"));
        String email = request.getParameter("email");
        String contact = request.getParameter("contact");
        String address = request.getParameter("address");
        Map<String, Object> map = new HashMap<>();
        Employee e = new Employee();
        e.setName(name);
        e.setGender(gender);
        e.setDesignation(designation);
        e.setSalary(salary);
        e.setEmail(email);
        e.setContact(contact);
        e.setAddress(address);

        return employeeDAO.save(e);
    }

    @Override
    public Employee update(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String designation = request.getParameter("designation");
        int salary = Integer.parseInt(request.getParameter("salary"));
        String email = request.getParameter("email");
        String contact = request.getParameter("contact");
        String address = request.getParameter("address");
        Map<String, Object> map = new HashMap<>();
        Employee e = new Employee();
        e.setId(id);
        e.setName(name);
        e.setGender(gender);
        e.setDesignation(designation);
        e.setSalary(salary);
        e.setEmail(email);
        e.setContact(contact);
        e.setAddress(address);

        return employeeDAO.update(e);
    }

    @Override
    public Employee delete(int id) {
        return employeeDAO.delete(id);

    }

    @Override
    public List<Employee> getAll() {
        List<Employee> eList = employeeDAO.getAll();
        return eList;
    }

    @Override
    public Employee getById(int id) {
        return employeeDAO.getById(id);
    }

}
