package com.nucleus;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguration
{
    @Bean(name = "bean3")
    @Scope("prototype")
    public Employee getBean1()
    {
        Employee e=new Employee();
        e.setEmpId(104);
        e.setEmpName("xyz");
        return e;
    }
    @Bean(name = "bean4")
    public Employee getBean2()
    {
        Employee e=new Employee();
        e.setEmpId(105);
        e.setEmpName("xyz");
        return e;
    }
}
