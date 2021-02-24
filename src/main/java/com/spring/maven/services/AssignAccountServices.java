/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services;

import com.spring.maven.dao.impl.IAssignAccountDAO;
import com.spring.maven.dao.impl.IExpenseDAO;
import com.spring.maven.dao.impl.IPaymentDAO;
import com.spring.maven.model.AssignAccount;
import com.spring.maven.model.Expense;
import com.spring.maven.model.Payment;
import com.spring.maven.services.impl.IAssignAccountServices;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service(value = "assignAccountServices")
public class AssignAccountServices implements IAssignAccountServices {

    @Autowired
    IAssignAccountDAO assignAccountDAO;
    @Autowired
    IExpenseDAO expenseDAO;
    @Autowired
    IPaymentDAO paymentDAO;

    @Override
    public AssignAccount save(HttpServletRequest request) {
        
         AssignAccount acc = new AssignAccount();
        
//        int eId = Integer.parseInt(request.getParameter("electricityBills"));
//        Expense t = expenseDAO.getById(eId);

//        acc.setExId(Integer.parseInt(request.getParameter("exId")));
//        acc.setElectricityBills(Integer.parseInt(request.getParameter("electricityBills")));
//        acc.setInternetBills(Integer.parseInt(request.getParameter("internetBills")));
//        acc.setWaterBills(Integer.parseInt(request.getParameter("waterBills")));
//        acc.setRent(Integer.parseInt(request.getParameter("rent")));
//        acc.setTax(Integer.parseInt(request.getParameter("tax")));
//        acc.setOthers(Integer.parseInt(request.getParameter("others")));
//        acc.setTotal(Integer.parseInt(request.getParameter("total")));
//
//        System.out.println("electricityBills");
////        asc.getCourseName()
//        acc.setPayId(Integer.parseInt(request.getParameter("payId")));
//        acc.setCardType(request.getParameter("cardType"));
//        acc.setExpireDate(request.getParameter("expireDate"));
//        acc.setCardNo(Integer.parseInt(request.getParameter("cardNo")));
//        acc.setCvcNo(Integer.parseInt(request.getParameter("cvcNo")));
//        acc.settName(request.getParameter("tName"));
//        acc.setcName(request.getParameter("cName"));
//        acc.setCode(request.getParameter("code"));
//        acc.setRound(request.getParameter("round"));
//        acc.setBatch(request.getParameter("batch"));
//        acc.setEmail(request.getParameter("email"));
//        acc.setTotalTrainee(Integer.parseInt(request.getParameter("totalTrainee")));
//        acc.setPayAmount(Integer.parseInt(request.getParameter("payAmount")));
        int eId = Integer.parseInt(request.getParameter("electricityBills"));
        Expense t = expenseDAO.getById(eId);
        int exId = t.getExId();
        int electricityBills = t.getElectricityBills();
        int internetBills = t.getInternetBills();
        int waterBills = t.getWaterBills();
        int rent = t.getRent();
        int tax = t.getTax();
        int others = t.getOthers();
        int total = t.getTotal();

        System.out.println(tax);

        int pid = Integer.parseInt(request.getParameter("cardType"));
        Payment c = paymentDAO.getById(pid);
        int payId = c.getPayId();
        String cardType = c.getCardType();
        String expireDate = c.getExpireDate();
        int cardNo = c.getCardNo();
        int cvcNo = c.getCvcNo();
        String tName = c.gettName();
        String cName = c.getcName();
        String code = c.getCode();
        String round = c.getRound();
        String batch = c.getBatch();
        String email = c.getEmail();
        int totalTrainee = c.getTotalTrainee();
        int payAmount = c.getPayAmount();
        int totalAmount = c.getTotalAmount();

       System.out.println("electricityBills");

        acc.setExId(exId);
        acc.setElectricityBills(electricityBills);
        acc.setInternetBills(internetBills);
        acc.setWaterBills(waterBills);
        acc.setRent(rent);
        acc.setTax(tax);
        acc.setOthers(others);
        acc.setTotal(total);
        
        acc.setPayId(payId);
        acc.setCardType(cardType);
        acc.setExpireDate(expireDate);
        acc.setCardNo(cardNo);
        acc.setCvcNo(cvcNo);
        acc.settName(tName);
        acc.setcName(cName);
        acc.setCode(code);
        acc.setRound(round);
        acc.setBatch(batch);
        acc.setEmail(email);
        acc.setTotalTrainee(totalTrainee);
        acc.setPayAmount(payAmount);
        acc.setTotalAmount(totalAmount);

        assignAccountDAO.save(acc);
        return acc;
    }

    @Override
    public AssignAccount update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AssignAccount delete(int id) {
        return assignAccountDAO.delete(id);
    }

    @Override
    public List<AssignAccount> getAll() {
        List<AssignAccount> assList = assignAccountDAO.getAll();
        return assList;
    }

    @Override
    public AssignAccount getById(int id) {
        return assignAccountDAO.getById(id);
    }

    @Override
    public List<AssignAccount> getByRoundAndBatch(String rounds, String batchs) {
        List<AssignAccount> aList = assignAccountDAO.getByRoundAndBatch(rounds, batchs);
        return aList;
    }

}
