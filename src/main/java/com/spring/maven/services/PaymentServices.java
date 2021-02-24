/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services;

import com.spring.maven.dao.impl.IPaymentDAO;
import com.spring.maven.model.Payment;
import com.spring.maven.services.impl.IPaymentServices;
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
@Service(value = "paymentServices")
public class PaymentServices implements IPaymentServices {

    @Autowired
    IPaymentDAO paymentDAO;

    @Override
    public Payment save(HttpServletRequest request) {
        String cardType = request.getParameter("cardType");
        String expireDate = request.getParameter("expireDate");
        int cardNo = Integer.parseInt(request.getParameter("cardNo"));
        int cvcNo = Integer.parseInt(request.getParameter("cvcNo"));
        int id = Integer.parseInt(request.getParameter("id"));
        String tName = request.getParameter("tName");
        String cName = request.getParameter("cName");
        String code = request.getParameter("code");
        String round = request.getParameter("round");
        String batch = request.getParameter("batch");
        String email = request.getParameter("email");
        int duration = Integer.parseInt(request.getParameter("duration"));
        int totalTrainee = Integer.parseInt(request.getParameter("totalTrainee"));
        int payAmount = Integer.parseInt(request.getParameter("payAmount"));
        int totalAmount = (payAmount * duration);

        Map<String, Object> map = new HashMap<>();
        Payment pay = new Payment();
        pay.setCardType(cardType);
        pay.setExpireDate(expireDate);
        pay.setCardNo(cardNo);
        pay.setCvcNo(cvcNo);
        pay.setId(id);
        pay.settName(tName);
        pay.setcName(cName);
        pay.setCode(code);
        pay.setRound(round);
        pay.setBatch(batch);
        pay.setEmail(email);
        pay.setDuration(duration);
        pay.setTotalTrainee(totalTrainee);
        pay.setPayAmount(payAmount);
        pay.setTotalAmount(totalAmount);
        return paymentDAO.save(pay);
    }

    @Override
    public Payment update(HttpServletRequest request) {
        int payId = Integer.parseInt(request.getParameter("payId"));
        String cardType = request.getParameter("cardType");
        String expireDate = request.getParameter("expireDate");
        int cardNo = Integer.parseInt(request.getParameter("cardNo"));
        int cvcNo = Integer.parseInt(request.getParameter("cvcNo"));
        int id = Integer.parseInt(request.getParameter("id"));
        String tName = request.getParameter("tName");
        String cName = request.getParameter("cName");
        String code = request.getParameter("code");
        String round = request.getParameter("round");
        String batch = request.getParameter("batch");
        String email = request.getParameter("email");
        int duration = Integer.parseInt(request.getParameter("duration"));
        int totalTrainee = Integer.parseInt(request.getParameter("totalTrainee"));
        int payAmount = Integer.parseInt(request.getParameter("payAmount"));

        Map<String, Object> map = new HashMap<>();
        Payment pay = new Payment();

        pay.setPayId(payId);
        pay.setCardType(cardType);
        pay.setExpireDate(expireDate);
        pay.setCardNo(cardNo);
        pay.setCvcNo(cvcNo);
        pay.setId(id);
        pay.settName(tName);
        pay.setcName(cName);
        pay.setCode(code);
        pay.setRound(round);
        pay.setBatch(batch);
        pay.setEmail(email);
        pay.setDuration(duration);
        pay.setTotalTrainee(totalTrainee);
        pay.setPayAmount(payAmount);
        return paymentDAO.update(pay);
    }

    @Override
    public Payment delete(int id) {
        return paymentDAO.delete(id);

    }

    @Override
    public List<Payment> getAll() {
        List<Payment> lList = paymentDAO.getAll();
        return lList;
    }

    @Override
    public Payment getById(int id) {
        return paymentDAO.getById(id);
    }
    
    public int getTotal() {
        List<Payment> p = paymentDAO.getAll();
        int total = 0;
        for (int i = 0; i < p.size(); i++) {
            total += p.get(i).getTotalAmount();
             System.out.println(total);
        }
         System.out.println(total);
        return total;
       
    } 

}
