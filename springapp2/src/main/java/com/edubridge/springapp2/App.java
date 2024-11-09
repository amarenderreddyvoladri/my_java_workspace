package com.edubridge.springapp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.edubridge.springapp2.beans.CanonPrinter;
import com.edubridge.springapp2.beans.Customer;
import com.edubridge.springapp2.beans.EpsonPrinter;
import com.edubridge.springapp2.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        // here from above line alrady objects rae created!
        // it is responsible for creating Objects dynamically on the fly.
        // it calls the constructors to initialize the objects.
        
        EpsonPrinter  ep = ctx.getBean(EpsonPrinter.class); // here we are acessing the just created object fo calss.
        System.out.println(ep);
        ep.printJob();
        
        CanonPrinter  cp = ctx.getBean(CanonPrinter.class);
        System.out.println(cp);
        cp.printJob();
        
        // just here retriving the already presented values in customer class.
        Customer  c = ctx.getBean(Customer.class);
        System.out.println(c.getCustomerFirstName());
        System.out.println(c.getCustomerLastName());
        System.out.println(c.getCustomerAddress());        
        
        
        System.out.println("Program Terminated!!");
    }
}
