/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexa.service;

import javax.ejb.Local;

/**
 *
 * @author Hvuser
 */
@Local
public interface RoundLocal {
     double round2Dec(double num);
}
