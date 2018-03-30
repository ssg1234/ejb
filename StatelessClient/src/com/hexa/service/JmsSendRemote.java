/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexa.service;

import javax.ejb.Remote;

/**
 *
 * @author Hvuser
 */
@Remote
public interface JmsSendRemote {
   public String sendMsg(String msg);
    public String sendMsg2(Emp emp);
}
