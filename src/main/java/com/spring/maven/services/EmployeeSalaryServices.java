/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services;

import com.spring.maven.dao.impl.IEmployeeSalaryDAO;
import com.spring.maven.model.EmployeeSalary;
import com.spring.maven.services.impl.IEmployeeSalaryServices;
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
@Service(value = "employeeSalaryServices")
public class EmployeeSalaryServices implements IEmployeeSalaryServices {

    @Autowired
    IEmployeeSalaryDAO employeeSalaryDAO;
    

    @Override
    public EmployeeSalary save(HttpServletRequest request) {
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String designation = request.getParameter("designation");
        int salary = Integer.parseInt(request.getParameter("salary"));
        int increment = Integer.parseInt(request.getParameter("increment"));
        int fCount = Integer.parseInt(request.getParameter("fCount"));
        int amount = Integer.parseInt(request.getParameter("amount"));
        int bonus = Integer.parseInt(request.getParameter("bonus"));
        String email = request.getParameter("email");
        String contact = request.getParameter("contact");
        String address = request.getParameter("address");
        Map<String, Object> map = new HashMap<>();

        EmployeeSalary e = new EmployeeSalary();
        e.setName(name);
        e.setGender(gender);
        e.setDesignation(designation);
        e.setSalary(salary);
        e.setIncrement(increment);
        e.setfCount(fCount);
        e.setAmount(amount);
        e.setBonus(bonus);
        e.setEmail(email);
        e.setContact(contact);
        e.setAddress(address);

        return employeeSalaryDAO.save(e);
    }

    @Override
    public EmployeeSalary update(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String designation = request.getParameter("designation");
        int salary = Integer.parseInt(request.getParameter("salary"));
        int increment = Integer.parseInt(request.getParameter("increment"));
        int fCount = Integer.parseInt(request.getParameter("fCount"));
        int amount = Integer.parseInt(request.getParameter("amount"));
        int bonus = Integer.parseInt(request.getParameter("bonus"));
        String email = request.getParameter("email");
        String contact = request.getParameter("contact");
        String address = request.getParameter("address");
        Map<String, Object> map = new HashMap<>();

        EmployeeSalary e = new EmployeeSalary();
        e.seteId(id);
        e.setName(name);
        e.setGender(gender);
        e.setDesignation(designation);
        e.setSalary(salary);
        e.setIncrement(increment);
        e.setfCount(fCount);
        e.setAmount(amount);
        e.setBonus(bonus);
        e.setEmail(email);
        e.setContact(contact);
        e.setAddress(address);

        return employeeSalaryDAO.update(e);
    }

    @Override
    public EmployeeSalary delete(int id) {
        return employeeSalaryDAO.delete(id);

    }

    @Override
    public List<EmployeeSalary> getAll() {
        List<EmployeeSalary> eList = employeeSalaryDAO.getAll();
        return eList;
    }

    @Override
    public EmployeeSalary getById(int id) {
        return employeeSalaryDAO.getById(id);
    }

}
