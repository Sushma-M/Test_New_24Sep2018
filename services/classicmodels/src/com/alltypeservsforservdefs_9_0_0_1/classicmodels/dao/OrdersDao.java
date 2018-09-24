/*Generated by WaveMaker Studio*/
package com.alltypeservsforservdefs_9_0_0_1.classicmodels.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.alltypeservsforservdefs_9_0_0_1.classicmodels.Orders;

/**
 * Specifies methods used to obtain and modify Orders related information
 * which is stored in the database.
 */
@Repository("classicmodels.OrdersDao")
public class OrdersDao extends WMGenericDaoImpl<Orders, Integer> {

    @Autowired
    @Qualifier("classicmodelsTemplate")
    private HibernateTemplate template;


    @Override
    public HibernateTemplate getTemplate() {
        return this.template;
    }
}