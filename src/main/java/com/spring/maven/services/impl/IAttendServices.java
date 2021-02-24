/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services.impl;

import com.spring.maven.common.ICommonService;
import com.spring.maven.model.Attendance;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author ASUS
 */
public interface IAttendServices extends ICommonService<Attendance>{
    
   public List<Attendance> saveAttends(HttpServletRequest request);
    public List<Attendance> getAttendByDate(String date, String round);
//    public List<Attendance> getAttendByRound(String round, String batch);
    
}
