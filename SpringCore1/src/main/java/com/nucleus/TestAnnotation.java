package com.nucleus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotation
{
    public static void main(String[] args)
    {
        ApplicationContext c=new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Employee e= (Employee) c.getBean("bean3");
        Employee e1= (Employee) c.getBean("bean3");
        if(e==e1)
        {
            System.out.println("same bean called");
        }
        else
        {
            System.out.println("Different bean");
        }
        System.out.println(e.getEmpId()+" "+e.getEmpName());
    }
}
