/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services.impl;

import com.spring.maven.common.ICommonService;
import com.spring.maven.model.AssignAccount;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IAssignAccountServices extends ICommonService<AssignAccount>{

   public List<AssignAccount> getByRoundAndBatch(String round, String batch);
    
}
