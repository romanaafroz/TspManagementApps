/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services.impl;

import com.spring.maven.common.ICommonService;
import com.spring.maven.model.Asset;

/**
 *
 * @author ASUS
 */
public interface IAssetServices extends ICommonService<Asset> {

    public int getTotal();
    public int totalBuyingCost();
    public int totalServiceCost();

}
