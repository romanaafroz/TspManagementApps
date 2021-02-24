/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services;

import com.spring.maven.dao.impl.IProfitDAO;
import com.spring.maven.model.Profit;
import com.spring.maven.services.impl.IProfitServices;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service(value = "profitServices")
public class ProfitServices implements IProfitServices {

    @Autowired
    IProfitDAO profitDAO;

    @Override
    public List<Profit> saveProfits(HttpServletRequest request) {

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

        List<Profit> pl = profitDAO.getSlaryByMonth(month, year);
//        for (Profit pl1 : pl) {
//            System.out.println(pl1.getName());
//        }
//
//        if (pl.isEmpty()) {
//                for (int i = 0; i < ids.length; i++) {
//                System.out.println(".......   " + names[i]);
//                Profit p = new Profit();
//                p.seteId(Integer.parseInt(ids[i]));
//                p.setName(names[i]);
//                p.setDesignation(designations[i]);
//                p.setEmail(emails[i]);
//                p.setContact(contacts[i]);
//                p.setSalary(Integer.parseInt(salary[i]));
////            if(bonus[i] !=null){
////             p.setBonus(Integer.parseInt(bonus[i]));
////            }
//                p.setPaymentStatus("PAID");
//                p.setMonth(month);
//                p.setYear(year);
//                profitDAO.save(p);
//            }
//            return pl;
//        } else {
//        return  null;
//        }

        return null;
    }

    @Override
    public Profit update(HttpServletRequest request) {
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
//        Profit p = new Profit();
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

//        return profitDAO.update(p);
    }

    @Override
    public Profit delete(int id) {
        return profitDAO.delete(id);

    }

    @Override
    public List<Profit> getAll() {
        List<Profit> pList = profitDAO.getAll();
        return pList;
    }

    @Override
    public Profit getById(int id) {
        return profitDAO.getById(id);
    }

    @Override
    public Profit save(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Profit> getSlaryByMonth(String month, String year) {
        List<Profit> pList = profitDAO.getSlaryByMonth(month, year);
        return pList;
    }

}
