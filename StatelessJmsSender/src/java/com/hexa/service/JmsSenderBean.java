/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexa.service;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.Connection;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;
/**
 *
 * @author Hvuser
 */
@Stateless(name="jbean1", mappedName="jbean2")
public class JmsSenderBean implements JmsSendRemote {
    @Resource(mappedName = "java:comp/DefaultJMSConnectionFactory")
    private ConnectionFactory cf;
    @Resource(mappedName ="myqueue")
    private Queue que;
    @Override
    public String sendMsg(String msg) {
        try{
        Connection conn =cf.createConnection();
        Session sess = conn.createSession();
        MessageProducer prod = sess.createProducer(que);
        TextMessage tm = sess.createTextMessage(msg);
        prod.send(tm);
        sess.close();
        conn.close();
      return "Your message is produced to queue";
    }catch(Exception e){
            System.out.println(e.getMessage());
            return "Your mesage is not produced";
    }

    }

    @Override
    public String sendMsg2(Emp emp) {
    try{
        Connection conn =cf.createConnection();
        Session sess = conn.createSession();
        MessageProducer prod = sess.createProducer(que);
        //Emp emp = new Emp();
        //emp.setEid(eid);
        //emp.setEname(name);
        ObjectMessage mm = sess.createObjectMessage(emp);
        prod.send(mm);
        sess.close();
        conn.close();
      return "Your message is produced to object";
    }catch(Exception e){
            System.out.println(e.getMessage());
            return "Your mesage is not produced";
    }
    
    }
}
