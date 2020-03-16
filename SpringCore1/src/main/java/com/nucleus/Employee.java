package com.nucleus;

import java.util.Date;

public class Employee
{
    private int empId;
    private String empName;
    private Address adrs;
   

   

  
    public Address getAdrs() {
        return adrs;
    }

    public void setAdrs(Address adrs) {
        this.adrs = adrs;
    }

    Employee()
    {
        System.out.println("Bean created");
    }

    public int getEmpId() {
        return empId;
    }
Employee(int empId,String empName)
{
    System.out.println("Bean created");
    this.empId=empId;
    this.empName=empName;
}
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void display()
    {
        System.out.println("Employee Class");
    }
}
