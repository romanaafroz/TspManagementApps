/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.dao;

import com.spring.maven.dao.impl.IAssetDAO;
import com.spring.maven.model.Asset;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ASUS
 */
@Repository(value = "assetDAO")
@Transactional
public class AssetDAO implements IAssetDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Asset save(Asset t) {
        sessionFactory.getCurrentSession().save(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Asset update(Asset t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        sessionFactory.getCurrentSession().flush();
        return t;
    }

    @Override
    public Asset delete(int id) {
        Asset asset = (Asset) sessionFactory.getCurrentSession().load(Asset.class, id);
        sessionFactory.getCurrentSession().delete(asset);
        return asset;
    }

    @Override
    public List<Asset> getAll() {
        List<Asset> lList = sessionFactory.getCurrentSession().createCriteria(Asset.class).list();
        return lList;

    }

    @Override
    public Asset getById(int id) {
        Asset asset = (Asset) sessionFactory.getCurrentSession().get(Asset.class, id);
        return asset;
    }

}
