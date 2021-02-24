/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services.impl;

import com.spring.maven.common.ICommonService;
import com.spring.maven.model.Profit;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author ASUS
 */
public interface IProfitServices extends ICommonService<Profit>{
    
   public List<Profit> saveProfits(HttpServletRequest request);
   public List<Profit> getSlaryByMonth(String month, String year);
     
}
