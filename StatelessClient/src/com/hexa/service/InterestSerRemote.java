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
public interface InterestSerRemote {
    double calcSimple(double p,int n,float r);
    double calcCompound(double p,int n,float r);
}
