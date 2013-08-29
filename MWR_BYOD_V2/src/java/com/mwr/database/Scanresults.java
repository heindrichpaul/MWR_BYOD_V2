package com.mwr.database;
// Generated 29-Aug-2013 18:05:58 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Scanresults generated by hbm2java
 */
public class Scanresults  implements java.io.Serializable {


     private Integer scanId;
     private Date date;
     private boolean rooted;
     private boolean debuggingEnabled;
     private boolean unknownSourcesAllowed;
     private String apps;

    public Scanresults() {
    }

    public Scanresults(Date date, boolean rooted, boolean debuggingEnabled, boolean unknownSourcesAllowed, String apps) {
       this.date = date;
       this.rooted = rooted;
       this.debuggingEnabled = debuggingEnabled;
       this.unknownSourcesAllowed = unknownSourcesAllowed;
       this.apps = apps;
    }
   
    public Integer getScanId() {
        return this.scanId;
    }
    
    public void setScanId(Integer scanId) {
        this.scanId = scanId;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public boolean isRooted() {
        return this.rooted;
    }
    
    public void setRooted(boolean rooted) {
        this.rooted = rooted;
    }
    public boolean isDebuggingEnabled() {
        return this.debuggingEnabled;
    }
    
    public void setDebuggingEnabled(boolean debuggingEnabled) {
        this.debuggingEnabled = debuggingEnabled;
    }
    public boolean isUnknownSourcesAllowed() {
        return this.unknownSourcesAllowed;
    }
    
    public void setUnknownSourcesAllowed(boolean unknownSourcesAllowed) {
        this.unknownSourcesAllowed = unknownSourcesAllowed;
    }
    public String getApps() {
        return this.apps;
    }
    
    public void setApps(String apps) {
        this.apps = apps;
    }




}


