/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.model;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 *
 * @author ASUS
 */
public class FacultyPayroll {
    
    @Id
    private int id;
    private int fId;
    private String name;
    private String email;
    private String contact;
    private int salary;
    private int bonus;
    private String paymentStatus;
    private String months;
    private String year;
}
