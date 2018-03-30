/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexa.service;
import javax.ejb.Stateless;
/**
 *
 * @author Hvuser
 */
@Stateless(name="round1", mappedName="round2")
public class RoundSession implements RoundRemote, RoundLocal {

    @Override
    public double round2Dec(double num) {
       double value = Math.round(num * 100) / 100.0;
       return value;
    }

   
}
