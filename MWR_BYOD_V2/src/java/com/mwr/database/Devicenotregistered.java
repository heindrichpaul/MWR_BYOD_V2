package com.mwr.database;
// Generated 24 Sep 2013 1:24:20 PM by Hibernate Tools 3.2.1.GA

import java.util.Date;

/**
 * Devicenotregistered generated by hbm2java
 */
public class Devicenotregistered implements java.io.Serializable {

    private DevicenotregisteredId id;
    private String manufacturer;
    private String model;
    private Date dateRegistered;
    private String token;
    private String username;
    private String password;
    private String idnumber;
    private String name;
    private String surname;

    public Devicenotregistered() {
    }

    public Devicenotregistered(DevicenotregisteredId id, String manufacturer, String model, Date dateRegistered, String token, String username, String password, String idnumber, String name, String surname) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.dateRegistered = dateRegistered;
        this.token = token;
        this.username = username;
        this.password = password;
        this.idnumber = idnumber;
        this.name = name;
        this.surname = surname;
    }

    public DevicenotregisteredId getId() {
        return this.id;
    }

    public void setId(DevicenotregisteredId id) {
        this.id = id;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDateRegistered() {
        String d = this.dateRegistered.toString();
        d = d.substring(0, d.length() - 2);
        int year = 0, month = 0, day = 0, hour = 0, minute = 0, second = 0;
        String date = d.substring(0, d.indexOf(" "));
        String time = d.substring(d.indexOf(" ") + 1);
        try {
            year = Integer.parseInt(date.split("-")[0]);
            month = Integer.parseInt(date.split("-")[1]);
            day = Integer.parseInt(date.split("-")[2]);
            hour = Integer.parseInt(time.split(":")[0]);
            minute = Integer.parseInt(time.split(":")[1]);
            second = Integer.parseInt(time.split(":")[2]);
        } finally {
            d = day + "/" + month + "/" + year + " " + hour + "h" + minute + "m" + second + "s";
            return d;
        }
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdnumber() {
        return this.idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
