package com.example.demo.model;

/**
 * Created by jerry on 2018/1/18.
 *
 * @author jerry
 */
public class DashboardActiveInstances {

    private String id;
    private String instanceName;
    private String region;
    private String cpuUsage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(String cpuUsage) {
        this.cpuUsage = cpuUsage;
    }
}
