/*Generated by WaveMaker Studio*/
package com.alltypeservsforservdefs_9_0_0_1.classicmodels.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class EmployeeProcVarResponse implements Serializable {


    @ColumnAlias("content")
    private List<EmployeeProcVarResponseContent> content;

    public List<EmployeeProcVarResponseContent> getContent() {
        return this.content;
    }

    public void setContent(List<EmployeeProcVarResponseContent> content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeProcVarResponse)) return false;
        final EmployeeProcVarResponse employeeProcVarResponse = (EmployeeProcVarResponse) o;
        return Objects.equals(getContent(), employeeProcVarResponse.getContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getContent());
    }
}