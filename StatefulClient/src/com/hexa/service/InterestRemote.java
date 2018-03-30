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
public interface InterestRemote {
    void setData(double amt, int years, float rate);
    double calcSimple();
    double calcCompound();
    public String getBname();
    void invalidate();
}
