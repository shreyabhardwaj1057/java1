package com.nucleus;

public class Address
{
    private int aId;
    private  String city;
    private String state;
Address()
{
    System.out.println("address created");
}
    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
