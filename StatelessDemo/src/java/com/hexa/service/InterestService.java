/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexa.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.Stateless;
/**
 *
 * @author Hvuser
 */
@Stateless(name="interestbean1", mappedName ="interestbean2")
public class InterestService implements InterestSerRemote {
    public InterestService(){
        System.out.println("Session bean-InterestService constructor");
    }
@PostConstruct    
public void myinit(){
    System.out.println("post construct");
}
@PreDestroy
public void mydestroy(){
    System.out.println("pre destroy");
}
@Override
public double calcSimple(double amt, int years, float rate){
    double si=amt*years*rate /100;
    si = robj.round2Dec(si);
    return si;
}
@Override
public double calcCompound(double amt, int years, float rate) {
    double ci = amt * Math.pow((1+rate/100),years)-amt;
    ci = robj.round2Dec(ci);
    return ci;
}
@EJB
private RoundLocal robj;

}
