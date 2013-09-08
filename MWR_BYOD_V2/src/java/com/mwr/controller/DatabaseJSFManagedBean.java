/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mwr.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.mwr.database.*;
import com.mwr.businesslogic.TokenGenerator;
import java.security.NoSuchAlgorithmException;
import org.hibernate.Session;

/**
 *
 * @author Heindrich
 */
@ManagedBean(name="bean")
@SessionScoped
public class DatabaseJSFManagedBean {

    private Session session;
    private HibernateUtil helper;

    /**
     * Creates a new instance of DatabaseJSFManagedBean
     */
    public DatabaseJSFManagedBean() {

        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void addToWaitingList(String mac, String android, String serial, String make, String model, String username, String password, String idnumber, String name, String surname) throws NoSuchAlgorithmException
    {   
        TokenGenerator gen = new TokenGenerator();
        String token = gen.generateToken(mac, android, serial);    
        DevicenotregisteredId devicePK = new DevicenotregisteredId(mac,android,serial); 
        Devicenotregistered device = new Devicenotregistered(devicePK, make,model, username,  password, idnumber, name, surname,token);
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(device);
        session.getTransaction().commit();
        session.close();
    }
    
//    public String getDevices()
//    {
//        session = helper.getSessionFactory().openSession();
//        session.beginTransaction();
//
//    }
}
