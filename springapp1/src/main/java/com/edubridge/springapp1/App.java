package com.edubridge.springapp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edubridge.springapp1.beans.IphoneMobile;
import com.edubridge.springapp1.beans.SamsungMobile;

/**
 * Hello world!
 * Dependency Injection : someone to create objects using spring.
 * IOC Inversion Of Control : 
 * IOC Inversion Of Control =  Dependency Injection are same.
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	
    	String configfile = "com/edubridge/springapp1/cfgs/applicationContext.xml";
    	
    	ApplicationContext ctx = new ClassPathXmlApplicationContext(configfile);
    	
    	// this is used to conifigure the files from config_file.
    	
    	SamsungMobile samsung = (SamsungMobile)ctx.getBean("samsung");
    	samsung.call();
    	System.out.println(samsung);
    	
    	IphoneMobile iphone = ctx.getBean(IphoneMobile.class ,"iphone");
    	iphone.call();
    	System.out.println(iphone);
    	
    	// we cannot assign object directly to SamsungMobile.

    	
    	
//        SamsungMobile sm = new SamsungMobile();
//        sm.call();
//        
//        IphoneMobile im = new IphoneMobile();
//        im.call();
    }
}
