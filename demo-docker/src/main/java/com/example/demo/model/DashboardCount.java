package com.example.demo.model;

/**
 * Created by jerry on 2018/1/18.
 *
 * @author jerry
 */
public class DashboardCount {

    private String customers;
    private String projects;
    private String virtualMachines;
    private String activeInstances;

    public String getCustomers() {
        return customers;
    }

    public void setCustomers(String customers) {
        this.customers = customers;
    }

    public String getProjects() {
        return projects;
    }

    public void setProjects(String projects) {
        this.projects = projects;
    }

    public String getVirtualMachines() {
        return virtualMachines;
    }

    public void setVirtualMachines(String virtualMachines) {
        this.virtualMachines = virtualMachines;
    }

    public String getActiveInstances() {
        return activeInstances;
    }

    public void setActiveInstances(String activeInstances) {
        this.activeInstances = activeInstances;
    }

}
