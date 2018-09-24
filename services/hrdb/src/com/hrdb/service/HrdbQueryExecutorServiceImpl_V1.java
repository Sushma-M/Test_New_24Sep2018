/*Generated by WaveMaker Studio*/
package com.hrdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;
import com.wavemaker.runtime.data.export.ExportOptions;
import com.wavemaker.runtime.data.model.QueryProcedureInput;

import com.hrdb.models.query.*;

@Service
public class HrdbQueryExecutorServiceImpl_V1 implements HrdbQueryExecutorService_V1 {

    private static final Logger LOGGER = LoggerFactory.getLogger(HrdbQueryExecutorServiceImpl.class);

    @Autowired
    @Qualifier("hrdbWMQueryExecutor")
    private WMQueryExecutor queryExecutor;

    @Transactional(value = "hrdbTransactionManager", readOnly = true)
    @Override
    public Page<Object> executeQueryvar(Pageable pageable) {
        Map params = new HashMap(0);


        return queryExecutor.executeNamedQuery("queryvar", params, Object.class, pageable);
    }

}