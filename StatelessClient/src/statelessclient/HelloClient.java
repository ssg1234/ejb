/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statelessclient;

import com.hexa.service.IHello;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Hvuser
 */
public class HelloClient {
  
    public static void main(String[] args) throws NamingException {
        // TODO code application logic here
        System.out.println("Client started");
        Properties props= new Properties();
        props.setProperty(Context.INITIAL_CONTEXT_FACTORY, 
                "com.sun.enterprise.naming.SerialInitContextFactory");
        props
                .setProperty("org.omg.CORBA.ORBInitialHost", "172.25.207.118");
        props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
        Context ctx= new InitialContext(props);
        for(int i=1;i<=1000;++i){
            IHello  ser=(IHello )ctx.lookup("hbean2");
            String str =ser.sayHello("Shraddha");
            System.out.println(str);
        }
}
}