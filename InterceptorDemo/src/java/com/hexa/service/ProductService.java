/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexa.service;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
/**
 *
 * @author Hvuser
 */
@Stateless(name="pbean1", mappedName="pbean2")
@Interceptors({MyInterceptor.class})
public class ProductService implements ProductRemote {
  private static Map<Integer, Product> map;
  static{
      map = new HashMap<>();
      map.put(1001, new Product(1001,"acer", 25000));
      map.put(1002, new Product(1002,"ibm", 45000));
      map.put(1003, new Product(1003,"hp", 30000));
  }
    @Override
    public Product getproduct(int pid) { 
        System.out.println("inside getProduct()");
    return map.get(pid);
    }
}
