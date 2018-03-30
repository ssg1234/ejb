/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexa.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

/**
 *
 * @author Hvuser
 */
@Stateless(name="conversionbean1", mappedName ="conversionbean2")
public class ConversionService implements ConvRemote{
    
public ConversionService(){
    System.out.println("Session bean-ConversionService constructor");
}    
@PostConstruct    
public void myinit(){
    System.out.println("post construct");
}
@Override
public double conversion(int cel){
   double far = (cel*1.8) + 32;
   return far;
}

@PreDestroy
public void mydestroy(){
    System.out.println("pre destroy");
    
}
}
