/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statelessclient;

import com.hexa.service.InterestSerRemote;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Hvuser
 */
public class StatelessClient {

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
        InterestSerRemote ser=
                (InterestSerRemote) ctx.lookup("interestbean2");
        double si=(ser.calcSimple(5000, 2, 2.5f));
        System.out.println("Simple int=" +si);
        
        double ci= (ser.calcCompound(2000, 3, 2f));
        System.out.println("Compound interest=" +ci);
        
    }
    
}
