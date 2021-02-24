/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.controller;

import com.spring.maven.model.Asset;
import com.spring.maven.model.Attendance;
import com.spring.maven.model.Courses;
import com.spring.maven.model.Employee;
import com.spring.maven.model.Expense;
import com.spring.maven.model.Faculty;
import com.spring.maven.model.Lab;
import com.spring.maven.model.Payment;
import com.spring.maven.model.Payroll;
import com.spring.maven.model.Trainee;
import com.spring.maven.services.impl.IAssetServices;
import com.spring.maven.services.impl.IAttendServices;
import com.spring.maven.services.impl.ICoursesServices;
import com.spring.maven.services.impl.IEmployeeServices;
import com.spring.maven.services.impl.IExpenseServices;
import com.spring.maven.services.impl.IFacultyService;
import com.spring.maven.services.impl.ILabServices;
import com.spring.maven.services.impl.IPaymentServices;
import com.spring.maven.services.impl.IPayrollServices;
import com.spring.maven.services.impl.ITraineeServices;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping(value = "/report")
public class ReportController {

    @Autowired
    IAttendServices attendServices;

    @Autowired
    IPayrollServices payrollServices;

    @Autowired
    IPaymentServices paymentServices;

    @Autowired
    IEmployeeServices employeeServices;

    @Autowired
    IFacultyService facultyService;

    @Autowired
    ITraineeServices traineeServices;

    @Autowired
    ICoursesServices coursesServices;

    @Autowired
    IExpenseServices expenseServices;

    @Autowired
    ILabServices labServices;

    @Autowired
    IAssetServices assetServices;

    @RequestMapping("/report")
    public ModelAndView report() {
        return new ModelAndView("reportAll");

    }

    @RequestMapping("/attReport")
    public ModelAndView report1() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Attendance> attList = attendServices.getAll();
        map.put("attList", attList);
        return new ModelAndView("report/attendanceReport", "map", map);

    }

    @RequestMapping("/pReport")
    public ModelAndView report2() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Payroll> pList = payrollServices.getAll();
        map.put("pList", pList);
        return new ModelAndView("report/payrollReport", "map", map);

    }

    @RequestMapping("/payReport")
    public ModelAndView report3() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Payment> payList = paymentServices.getAll();
        map.put("payList", payList);
        return new ModelAndView("report/paymentReport", "map", map);

    }

    @RequestMapping("/expenseReport")
    public ModelAndView report4() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Expense> exList = expenseServices.getAll();
        map.put("exList", exList);
        return new ModelAndView("report/expenseReport", "map", map);

    }

    @RequestMapping("/empReport")
    public ModelAndView report5() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Employee> empList = employeeServices.getAll();
        map.put("empList", empList);
        return new ModelAndView("report/employeeReport", "map", map);

    }

    @RequestMapping("/fReport")
    public ModelAndView report6() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Faculty> fList = facultyService.getAll();
        map.put("fList", fList);
        return new ModelAndView("report/facultyReport", "map", map);

    }

    @RequestMapping("/cReport")
    public ModelAndView report7() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Courses> cList = coursesServices.getAll();
        map.put("cList", cList);
        return new ModelAndView("report/cReport", "map", map);

    }

    @RequestMapping("/labReport")
    public ModelAndView report8() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Lab> labList = labServices.getAll();
        map.put("labList", labList);
        return new ModelAndView("report/labReport", "map", map);

    }

    @RequestMapping("/aReport")
    public ModelAndView report9() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Asset> aList = assetServices.getAll();
        int buyingCost = assetServices.totalBuyingCost();
        int serviceCost = assetServices.totalServiceCost();
        int totalCost = assetServices.getTotal();
        System.out.println(totalCost);
        map.put("totalCost", totalCost);
        System.out.println(buyingCost);
        System.out.println(serviceCost);
        map.put("buyingCost", buyingCost);
        map.put("serviceCost", serviceCost);
        map.put("aList", aList);
        return new ModelAndView("report/aReport", "map", map);

    }

    @RequestMapping("/tReport")
    public ModelAndView report10() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Trainee> traineeList = traineeServices.getAll();
        map.put("traineeList", traineeList);
        return new ModelAndView("report/tReport", "map", map);

    }
}
