/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexa.service;

import java.io.Serializable;

/**
 *
 * @author Hvuser
 */
public class Emp implements Serializable{
   private int eid;
   private String ename;

   public Emp(){
       
   }
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
   
   
}
