package org.oasis_open.wemi.context.server.api;

import java.io.Serializable;

/**
 * Represents the information about a cluster node
 */
public class ClusterNode implements Serializable {

    private double cpuLoad;
    private double[] loadAverage;
    private String hostName;
    private int publicPort;
    private long uptime;

    public ClusterNode() {
    }

    public double getCpuLoad() {
        return cpuLoad;
    }

    public void setCpuLoad(double cpuLoad) {
        this.cpuLoad = cpuLoad;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getPublicPort() {
        return publicPort;
    }

    public void setPublicPort(int publicPort) {
        this.publicPort = publicPort;
    }

    public double[] getLoadAverage() {
        return loadAverage;
    }

    public void setLoadAverage(double[] loadAverage) {
        this.loadAverage = loadAverage;
    }

    public long getUptime() {
        return uptime;
    }

    public void setUptime(long uptime) {
        this.uptime = uptime;
    }
}