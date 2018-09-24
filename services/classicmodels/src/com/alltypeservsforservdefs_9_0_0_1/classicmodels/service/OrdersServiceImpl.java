/*Generated by WaveMaker Studio*/
package com.alltypeservsforservdefs_9_0_0_1.classicmodels.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.hibernate.Hibernate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.wavemaker.commons.MessageResource;
import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.alltypeservsforservdefs_9_0_0_1.classicmodels.Orderdetails;
import com.alltypeservsforservdefs_9_0_0_1.classicmodels.Orders;


/**
 * ServiceImpl object for domain model class Orders.
 *
 * @see Orders
 */
@Service("classicmodels.OrdersService")
@Validated
public class OrdersServiceImpl implements OrdersService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrdersServiceImpl.class);

    @Lazy
    @Autowired
    @Qualifier("classicmodels.OrderdetailsService")
    private OrderdetailsService orderdetailsService;

    @Autowired
    @Qualifier("classicmodels.OrdersDao")
    private WMGenericDao<Orders, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Orders, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public Orders create(Orders orders) {
        LOGGER.debug("Creating a new Orders with information: {}", orders);

        List<Orderdetails> orderdetailses = orders.getOrderdetailses();
        if(orderdetailses != null && Hibernate.isInitialized(orderdetailses)) {
            orderdetailses.forEach(_orderdetails -> _orderdetails.setOrders(orders));
        }

        Orders ordersCreated = this.wmGenericDao.create(orders);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(ordersCreated);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public Orders getById(Integer ordersId) {
        LOGGER.debug("Finding Orders by id: {}", ordersId);
        return this.wmGenericDao.findById(ordersId);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public Orders findById(Integer ordersId) {
        LOGGER.debug("Finding Orders by id: {}", ordersId);
        try {
            return this.wmGenericDao.findById(ordersId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No Orders found with id: {}", ordersId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public List<Orders> findByMultipleIds(List<Integer> ordersIds, boolean orderedReturn) {
        LOGGER.debug("Finding Orders by ids: {}", ordersIds);

        return this.wmGenericDao.findByMultipleIds(ordersIds, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "classicmodelsTransactionManager")
    @Override
    public Orders update(Orders orders) {
        LOGGER.debug("Updating Orders with information: {}", orders);

        List<Orderdetails> orderdetailses = orders.getOrderdetailses();
        if(orderdetailses != null && Hibernate.isInitialized(orderdetailses)) {
            orderdetailses.forEach(_orderdetails -> _orderdetails.setOrders(orders));
        }

        this.wmGenericDao.update(orders);
        this.wmGenericDao.refresh(orders);

        return orders;
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public Orders delete(Integer ordersId) {
        LOGGER.debug("Deleting Orders with id: {}", ordersId);
        Orders deleted = this.wmGenericDao.findById(ordersId);
        if (deleted == null) {
            LOGGER.debug("No Orders found with id: {}", ordersId);
            throw new EntityNotFoundException(MessageResource.create("com.wavemaker.runtime.entity.not.found"), Orders.class.getSimpleName(), ordersId);
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public void delete(Orders orders) {
        LOGGER.debug("Deleting Orders with {}", orders);
        this.wmGenericDao.delete(orders);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public Page<Orders> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Orders");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public Page<Orders> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Orders");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service classicmodels for table Orders to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service classicmodels for table Orders to {} format", options.getExportType());
        this.wmGenericDao.export(options, pageable, outputStream);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public Page<Orderdetails> findAssociatedOrderdetailses(Integer orderNumber, Pageable pageable) {
        LOGGER.debug("Fetching all associated orderdetailses");

        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("orders.orderNumber = '" + orderNumber + "'");

        return orderdetailsService.findAll(queryBuilder.toString(), pageable);
    }

    /**
     * This setter method should only be used by unit tests
     *
     * @param service OrderdetailsService instance
     */
    protected void setOrderdetailsService(OrderdetailsService service) {
        this.orderdetailsService = service;
    }

}