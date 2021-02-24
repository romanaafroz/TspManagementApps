/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services;

import com.spring.maven.dao.impl.IPayrollDAO;
import com.spring.maven.model.Payroll;
import com.spring.maven.services.impl.IPayrollServices;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service(value = "payrollServices")
public class PayrollServices implements IPayrollServices {

    @Autowired
    IPayrollDAO payrollDAO;

    @Override
    public List<Payroll> savePayrolls(HttpServletRequest request) {

        Map<String, String[]> requestMap = request.getParameterMap();
        String[] ids = (String[]) requestMap.get("empID[]");
        String[] names = (String[]) requestMap.get("name[]");
        String[] designations = (String[]) requestMap.get("desig[]");
        String[] emails = (String[]) requestMap.get("email[]");
        String[] contacts = (String[]) requestMap.get("contact[]");
        String[] salary = (String[]) requestMap.get("salary[]");
        String[] bonus = (String[]) requestMap.get("empBonus[]");
        String[] paymentStatus = (String[]) requestMap.get("payStatus[]");
        String month = request.getParameter("month");
        String year = request.getParameter("year");

        System.out.println(month + "  ...................   " + year);

        List<Payroll> pl = payrollDAO.getSlaryByMonth(month, year);
        for (Payroll pl1 : pl) {
            System.out.println(pl1.getName());
        }

        if (pl.isEmpty()) {
                for (int i = 0; i < ids.length; i++) {
                System.out.println(".......   " + names[i]);
                Payroll p = new Payroll();
                p.seteId(Integer.parseInt(ids[i]));
                p.setName(names[i]);
                p.setDesignation(designations[i]);
                p.setEmail(emails[i]);
                p.setContact(contacts[i]);
                p.setSalary(Integer.parseInt(salary[i]));
//            if(bonus[i] !=null){
//             p.setBonus(Integer.parseInt(bonus[i]));
//            }
                p.setPaymentStatus("PAID");
                p.setMonth(month);
                p.setYear(year);
                payrollDAO.save(p);
            }
            return pl;
        } else {
        return  null;
        }

  
    }

    @Override
    public Payroll update(HttpServletRequest request) {
        return null;
//        int id = Integer.parseInt(request.getParameter("id"));
//        int empId = Integer.parseInt(request.getParameter("eId"));
//        String name = request.getParameter("name");
//        String designation = request.getParameter("designation");
//        String email = request.getParameter("email");
//        int salary = Integer.parseInt(request.getParameter("salary"));
//        int bonus = Integer.parseInt(request.getParameter("bonus"));
//        String contact = request.getParameter("contact");
//        String paymentStatus = request.getParameter("paymentStatus");
//        String month = request.getParameter("months");
//        String year = request.getParameter("year");
//        Map<String, Object> map = new HashMap<>();
//
//        Payroll p = new Payroll();
//        p.seteId(empId);
//        p.seteId(empId);
//        p.setName(name);
//        p.setDesignation(designation);
//        p.setEmail(email);
//        p.setSalary(salary);
//        p.setBonus(bonus);
//        p.setPaymentStatus(paymentStatus);
//        p.setMonths(month);
//        p.setYear(year);

//        return payrollDAO.update(p);
    }

    @Override
    public Payroll delete(int id) {
        return payrollDAO.delete(id);

    }

    @Override
    public List<Payroll> getAll() {
        List<Payroll> pList = payrollDAO.getAll();
        return pList;
    }

    @Override
    public Payroll getById(int id) {
        return payrollDAO.getById(id);
    }

    @Override
    public Payroll save(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Payroll> getSlaryByMonth(String month, String year) {
       List<Payroll> pList = payrollDAO.getSlaryByMonth(month, year);
       return pList;
    }

   

}
