package com.nucleus;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext c=new ClassPathXmlApplicationContext("spring-beans.xml");
        // BeanFactory c= new XmlBeanFactory(new FileSystemResource("spring-beans.xml"));
        Employee e=(Employee)c.getBean("bean2");
        System.out.println(e.getEmpId()+" "+e.getEmpName());
        Address a=e.getAdrs();
        System.out.println(a.getaId()+a.getCity()+a.getState());

    }
}
