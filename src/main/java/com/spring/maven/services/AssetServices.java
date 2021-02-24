/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.services;

import com.spring.maven.dao.impl.IAssetDAO;
import com.spring.maven.model.Asset;
import com.spring.maven.services.impl.IAssetServices;
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
@Service(value = "assetServices")
public class AssetServices implements IAssetServices {

    @Autowired
    IAssetDAO assetDAO;

    @Override
    public Asset save(HttpServletRequest request) {
        String productName = request.getParameter("productName");
        int buyingCost = Integer.parseInt(request.getParameter("buyingCost"));
        String serviceCause = request.getParameter("serviceCause");
        int serviceCost = Integer.parseInt(request.getParameter("serviceCost"));
        int totalCost = (buyingCost + serviceCost);

        Map<String, Object> map = new HashMap<>();
        Asset a = new Asset();
        a.setProductName(productName);
        a.setBuyingCost(buyingCost);
        a.setServiceCause(serviceCause);
        a.setServiceCost(serviceCost);
        a.setTotalCost(totalCost);

        return assetDAO.save(a);
    }

    @Override
    public Asset update(HttpServletRequest request) {
        int assetId = Integer.parseInt(request.getParameter("assetId"));
        String productName = request.getParameter("productName");
        int buyingCost = Integer.parseInt(request.getParameter("buyingCost"));
        String serviceCause = request.getParameter("serviceCause");
        int serviceCost = Integer.parseInt(request.getParameter("serviceCost"));

        int totalCost = (buyingCost + serviceCost);

        Map<String, Object> map = new HashMap<>();
        Asset a = new Asset();
        a.setAssetId(assetId);
        a.setProductName(productName);
        a.setBuyingCost(buyingCost);
        a.setServiceCause(serviceCause);
        a.setServiceCost(serviceCost);

        a.setTotalCost(totalCost);
        return assetDAO.update(a);
    }

    @Override
    public Asset delete(int id) {
        return assetDAO.delete(id);

    }

    @Override
    public List<Asset> getAll() {
        List<Asset> lList = assetDAO.getAll();
        return lList;
    }

    @Override
    public Asset getById(int id) {
        return assetDAO.getById(id);
    }

    @Override
    public int getTotal() {
        List<Asset> p = assetDAO.getAll();
        int totalCost = 0;
        for (int i = 0; i < p.size(); i++) {
            totalCost += p.get(i).getTotalCost();
            System.out.println(totalCost);
        }
        System.out.println(totalCost);
        return totalCost;

    }

    @Override
    public int totalBuyingCost() {
        List<Asset> p = assetDAO.getAll();
        int buyingCost = 0;
        for (int i = 0; i < p.size(); i++) {
            buyingCost += p.get(i).getBuyingCost();
            System.out.println(buyingCost);
        }
        System.out.println(buyingCost);
        return buyingCost;
    }

    @Override
    public int totalServiceCost() {
        List<Asset> p = assetDAO.getAll();
        int serviceCost = 0;
        for (int i = 0; i < p.size(); i++) {
            serviceCost += p.get(i).getServiceCost();
            System.out.println(serviceCost);
        }
        System.out.println(serviceCost);
        return serviceCost;
    }

}
