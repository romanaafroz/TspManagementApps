/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services;

import com.spring.maven.dao.impl.IAssignTraineeCourseLabDAO;
import com.spring.maven.dao.impl.IAttendDAO;
import com.spring.maven.model.Attendance;
import com.spring.maven.services.impl.IAttendServices;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service(value = "attendServices")
public class AttendServices implements IAttendServices {

    @Autowired
    IAttendDAO attendDAO;
    @Autowired
    IAssignTraineeCourseLabDAO assignTraineeCourseLabDAO;

    @Override
    public List<Attendance> saveAttends(HttpServletRequest request) {

        Map<String, String[]> requestMap = request.getParameterMap();
        String[] ids = (String[]) requestMap.get("assignID[]");
        String[] tNames = (String[]) requestMap.get("tName[]");
        String[] rounds = (String[]) requestMap.get("round[]");
        String[] emails = (String[]) requestMap.get("email[]");
        String[] cNames = (String[]) requestMap.get("cName[]");
        String[] codes = (String[]) requestMap.get("code[]");
        String[] labNo = (String[]) requestMap.get("labNo[]");
        String[] attNote = (String[]) requestMap.get("attNote[]");
        String[] attStatus = (String[]) requestMap.get("attStatus[]");


        LocalDate d = LocalDate.now();
        String date = d.toString();
        LocalTime t = LocalTime.now();
        String time = t.toString();


//        List<Attendance> att = attendDAO.getByRoundAndBatch(rounds, batchs);
//        for (Attendance att1 : att) {
//            System.out.println(att1.gettName());
//        }
        Attendance at = new Attendance();

        for (int i = 0; i < ids.length; i++) {

            //  System.out.println(tNames);
//            System.out.println("..........     " + tNames[i] + "----" + rounds[i] + "----" + codes[i]);
            System.out.println(".......   " + tNames[i]);
            at.settId(Integer.parseInt(ids[i]));
            at.settName(tNames[i]);
            at.setRound(rounds[i]);
            at.setEmail(emails[i]);
            at.setcName(cNames[i]);
            at.setCode(codes[i]);
            at.setLabNo(labNo[i]);

            at.setAttNote(attNote[i]);

            boolean status = Arrays.stream(attStatus).anyMatch(ids[i]::equals);
            if (status) {
                at.setAttStatus("Present");
            } else {
                at.setAttStatus("Absent");
            }
            at.setDate(date);
            at.setTime(time);
            attendDAO.save(at);
        }
        return null;

//        if (att.isEmpty()) {
//            for (int i = 0; i < ids.length; i++) {
//                System.out.println(".......   " + tNames[i]);
//                Attendance at = new Attendance();
//                at.settId(Integer.parseInt(ids[i]));
//                at.settName(tNames[i]);
//                at.setRound(rounds[i]);
//                at.setEmail(emails[i]);
//                at.setcName(cNames[i]);
//                at.setCode(codes[i]);
//                at.setLabNo(labNo[i]);
//
//                at.setAttNote(attNote[i]);
//                at.setAttStatus("Present");
//                at.setTime(time);
//                at.setDate(date);
//                attendDAO.save(at);
//            }
//            return att;
//        } else {
//            return null;
//        }
    }

    @Override
    public Attendance update(HttpServletRequest request) {
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
//        Attend p = new Attend();
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

//        return attendDAO.update(p);
    }

    @Override
    public Attendance delete(int id) {
        return attendDAO.delete(id);

    }

    @Override
    public List<Attendance> getAll() {
        List<Attendance> pList = attendDAO.getAll();
        return pList;
    }

    @Override
    public Attendance getById(int id) {
        return attendDAO.getById(id);
    }

    @Override
    public Attendance save(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public List<Attendance> getAttendByRound(String round, String batch) {
//        List<Attendance> atList = attendDAO.getAttendByDate(round, batch);
//        return atList;
//    }
    
    @Override
    public List<Attendance> getAttendByDate(String date, String round) {
        List<Attendance> attList = attendDAO.getAttendByDate(date, round);
        return attList;
    }

}
