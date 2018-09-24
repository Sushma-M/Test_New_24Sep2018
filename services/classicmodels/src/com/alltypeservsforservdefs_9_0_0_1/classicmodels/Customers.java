/*Generated by WaveMaker Studio*/
package com.alltypeservsforservdefs_9_0_0_1.classicmodels;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Customers generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`customers`")
public class Customers implements Serializable {

    private Integer customerNumber;
    private String customerName;
    private String contactLastName;
    private String contactFirstName;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private Integer salesRepEmployeeNumber;
    private BigDecimal creditLimit;
    private Employees employees;
    private List<Orders> ordersesForCustomerNumber;
    private List<Orders> ordersesForCustomerNumberRelation;
    private List<Payments> paymentsesForCustomerNumber;
    private List<Payments> paymentsesForCustomerNumberRelation;

    @Id
    @Column(name = "`customerNumber`", nullable = false, scale = 0, precision = 10)
    public Integer getCustomerNumber() {
        return this.customerNumber;
    }

    public void setCustomerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Column(name = "`customerName`", nullable = false, length = 50)
    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Column(name = "`contactLastName`", nullable = false, length = 50)
    public String getContactLastName() {
        return this.contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    @Column(name = "`contactFirstName`", nullable = false, length = 50)
    public String getContactFirstName() {
        return this.contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    @Column(name = "`phone`", nullable = false, length = 50)
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "`addressLine1`", nullable = false, length = 50)
    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @Column(name = "`addressLine2`", nullable = true, length = 50)
    public String getAddressLine2() {
        return this.addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @Column(name = "`city`", nullable = false, length = 50)
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "`state`", nullable = true, length = 50)
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Column(name = "`postalCode`", nullable = true, length = 15)
    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Column(name = "`country`", nullable = false, length = 50)
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "`salesRepEmployeeNumber`", nullable = true, scale = 0, precision = 10)
    public Integer getSalesRepEmployeeNumber() {
        return this.salesRepEmployeeNumber;
    }

    public void setSalesRepEmployeeNumber(Integer salesRepEmployeeNumber) {
        this.salesRepEmployeeNumber = salesRepEmployeeNumber;
    }

    @Column(name = "`creditLimit`", nullable = true, scale = 9, precision = 22)
    public BigDecimal getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`salesRepEmployeeNumber`", referencedColumnName = "`employeeNumber`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`customers_ibfk_1`"))
    @Fetch(FetchMode.JOIN)
    public Employees getEmployees() {
        return this.employees;
    }

    public void setEmployees(Employees employees) {
        if(employees != null) {
            this.salesRepEmployeeNumber = employees.getEmployeeNumber();
        }

        this.employees = employees;
    }
    @JsonInclude(Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customersByCustomerNumber")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.REMOVE})
    public List<Orders> getOrdersesForCustomerNumber() {
        return this.ordersesForCustomerNumber;
    }

    public void setOrdersesForCustomerNumber(List<Orders> ordersesForCustomerNumber) {
        this.ordersesForCustomerNumber = ordersesForCustomerNumber;
    }

    @JsonInclude(Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customersByCustomerNumberRelation")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.REMOVE})
    public List<Orders> getOrdersesForCustomerNumberRelation() {
        return this.ordersesForCustomerNumberRelation;
    }

    public void setOrdersesForCustomerNumberRelation(List<Orders> ordersesForCustomerNumberRelation) {
        this.ordersesForCustomerNumberRelation = ordersesForCustomerNumberRelation;
    }

    @JsonInclude(Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customersByCustomerNumber")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.REMOVE})
    public List<Payments> getPaymentsesForCustomerNumber() {
        return this.paymentsesForCustomerNumber;
    }

    public void setPaymentsesForCustomerNumber(List<Payments> paymentsesForCustomerNumber) {
        this.paymentsesForCustomerNumber = paymentsesForCustomerNumber;
    }

    @JsonInclude(Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customersByCustomerNumberRelation")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.REMOVE})
    public List<Payments> getPaymentsesForCustomerNumberRelation() {
        return this.paymentsesForCustomerNumberRelation;
    }

    public void setPaymentsesForCustomerNumberRelation(List<Payments> paymentsesForCustomerNumberRelation) {
        this.paymentsesForCustomerNumberRelation = paymentsesForCustomerNumberRelation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customers)) return false;
        final Customers customers = (Customers) o;
        return Objects.equals(getCustomerNumber(), customers.getCustomerNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustomerNumber());
    }
}