/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.dao.impl;

import com.spring.maven.common.ICommonDAO;
import com.spring.maven.model.Payroll;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IPayrollDAO extends ICommonDAO<Payroll>{
    
    public List<Payroll> getSlaryByMonth(String month, String year);
}
