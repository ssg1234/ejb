/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexa.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Stateful;
import javax.ejb.Remove;

/**
 *
 * @author Hvuser
 */
@Stateful(name="ibean1", mappedName="ibean2")
public class InterestBean implements InterestRemote {
    
    private double amt;
    private int years;
    private float rate;
    private String bname;
    
    public InterestBean(){
        int i=0;
        bname="hexa"+i;
        ++i;
        System.out.println("Constructor fired");
    }
    @PostConstruct
    public void myinit(){
        System.out.println("post construct"); 
    }
    
    @PreDestroy
    public void myDestroy(){
        System.out.println("pre Destroy");
    }
    
    @PrePassivate
    public void mypassivate(){
        System.out.println("pre passivate");
    }
    
    @PostActivate
    public void myactive(){
        System.out.println("post activate       ");
    }
    @Override
    public void setData(double amt, int years, float rate) {
        this.amt = amt;
        this.years = years;
        this.rate = rate;
    }

    @Override
    public double calcSimple() {
       return amt * years *rate/100;
    }

    @Override
    public double calcCompound() {
        double ci = amt * Math.pow((1 + rate/100),years) - amt;
        return ci;
    }
    @Override
    @Remove
    public void invalidate() {
        System.out.println("bean is yet to be removed");
    }

    @Override
    public String getBname() {
     return bname;
    }
    
    
    
      
    
}
