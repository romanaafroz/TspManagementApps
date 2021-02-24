/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services;

import com.spring.maven.dao.impl.IExpenseDAO;
import com.spring.maven.model.Expense;
import com.spring.maven.services.impl.IExpenseServices;
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
@Service(value = "expenseServices")
public class ExpenseServices implements IExpenseServices {

    @Autowired
    IExpenseDAO expenseDAO;

    @Override
    public Expense save(HttpServletRequest request) {
        int electricityBills = Integer.parseInt(request.getParameter("electricityBills"));
        int internetBills = Integer.parseInt(request.getParameter("internetBills"));
        int waterBills = Integer.parseInt(request.getParameter("waterBills"));
        int rent = Integer.parseInt(request.getParameter("rent"));
        int tax = Integer.parseInt(request.getParameter("tax"));
        int others = Integer.parseInt(request.getParameter("others"));

        int total = (electricityBills + internetBills + waterBills + rent + tax / 12 + others * 30);
        Map<String, Object> map = new HashMap<>();

        Expense ex = new Expense();

        ex.setElectricityBills(electricityBills);
        ex.setInternetBills(internetBills);
        ex.setWaterBills(waterBills);
        ex.setRent(rent);
        ex.setTax(tax);
        ex.setOthers(others);

        ex.setTotal(total);

        return expenseDAO.save(ex);
    }

    @Override
    public Expense update(HttpServletRequest request) {
        int exId = Integer.parseInt(request.getParameter("exId"));
        int electricityBills = Integer.parseInt(request.getParameter("electricityBills"));
        int internetBills = Integer.parseInt(request.getParameter("internetBills"));
        int waterBills = Integer.parseInt(request.getParameter("waterBills"));
        int rent = Integer.parseInt(request.getParameter("rent"));
        int tax = Integer.parseInt(request.getParameter("tax"));
        int others = Integer.parseInt(request.getParameter("others"));
        int total = (electricityBills + internetBills + waterBills + rent + tax / 12 + others * 30);
//        int total = (electricityBills * 12 + internetBills * 12 + waterBills * 12 + rent * 12 + tax + others * 365);
        Map<String, Object> map = new HashMap<>();

        Expense ex = new Expense();
        ex.setExId(exId);
        ex.setElectricityBills(electricityBills);
        ex.setInternetBills(internetBills);
        ex.setWaterBills(waterBills);
        ex.setRent(rent);
        ex.setTax(tax);
        ex.setOthers(others);

        ex.setTotal(total);
        return expenseDAO.update(ex);
    }

    @Override
    public Expense delete(int id) {
        return expenseDAO.delete(id);

    }

    @Override
    public List<Expense> getAll() {
        List<Expense> eList = expenseDAO.getAll();
        return eList;
    }

    @Override
    public Expense getById(int id) {
        return expenseDAO.getById(id);
    }

    public int getTotal() {
        List<Expense> p = expenseDAO.getAll();
        int total = 0;
        for (int i = 0; i < p.size(); i++) {
            total += p.get(i).getTotal();
        }
        return total;

    }

//    
//    @Override
//    public int totalBuyingCost() {
//        List<Asset> p = assetDAO.getAll();
//        int buyingCost = 0;
//        for (int i = 0; i < p.size(); i++) {
//            buyingCost += p.get(i).getBuyingCost();
//            System.out.println(buyingCost);
//        }
//        System.out.println(buyingCost);
//        return buyingCost;
//    }
//
//    @Override
//    public int totalServiceCost() {
//        List<Asset> p = assetDAO.getAll();
//        int serviceCost = 0;
//        for (int i = 0; i < p.size(); i++) {
//            serviceCost += p.get(i).getServiceCost();
//            System.out.println(serviceCost);
//        }
//        System.out.println(serviceCost);
//        return serviceCost;
//    }
}
