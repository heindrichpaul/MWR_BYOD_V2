package com.mwr.database;
// Generated 23 Sep 2013 5:37:49 PM by Hibernate Tools 3.2.1.GA



/**
 * Blacklistedapp generated by hbm2java
 */
public class Blacklistedapp  implements java.io.Serializable {


     private Integer appId;
     private String appName;
     private String appCategory;

    public Blacklistedapp() {
    }

    public Blacklistedapp(String appName, String appCategory) {
       this.appName = appName;
       this.appCategory = appCategory;
    }
   
    public Integer getAppId() {
        return this.appId;
    }
    
    public void setAppId(Integer appId) {
        this.appId = appId;
    }
    public String getAppName() {
        return this.appName;
    }
    
    public void setAppName(String appName) {
        this.appName = appName;
    }
    public String getAppCategory() {
        return this.appCategory;
    }
    
    public void setAppCategory(String appCategory) {
        this.appCategory = appCategory;
    }




}

