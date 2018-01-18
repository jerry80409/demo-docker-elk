package com.example.demo.model;

import java.util.List;

/**
 * Created by jerry on 2018/1/18.
 *
 * @author jerry
 */
public class DashboardEarnings {

    private String total;
    private String month;
    private String instanceCount;
    private List<String> instances;
    private List<Integer> instancesAmount;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(String instanceCount) {
        this.instanceCount = instanceCount;
    }

    public List<String> getInstances() {
        return instances;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
    }

    public List<Integer> getInstancesAmount() {
        return instancesAmount;
    }

    public void setInstancesAmount(List<Integer> instancesAmount) {
        this.instancesAmount = instancesAmount;
    }
}
