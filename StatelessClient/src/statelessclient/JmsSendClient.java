/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statelessclient;

import com.hexa.service.Emp;
import com.hexa.service.JmsSendRemote;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Hvuser
 */
public class JmsSendClient {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException {
        // TODO code application logic here
        System.out.println("Client started");
        Properties props= new Properties();
        props.setProperty(Context.INITIAL_CONTEXT_FACTORY, 
                "com.sun.enterprise.naming.SerialInitContextFactory");
        props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
        props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
        Context ctx= new InitialContext(props);
        JmsSendRemote ser =(JmsSendRemote) ctx.lookup("jbean2");
        System.out.println(ser.sendMsg("Hi, I am Shraddha"));
        //System.out.println(ser.sendMsg2(1000,"shraddha"));
        Emp emp = new Emp();
        emp.setEid(1001);
        emp.setEname("peter");
        System.out.println(ser.sendMsg2(emp));
    
    }
}
