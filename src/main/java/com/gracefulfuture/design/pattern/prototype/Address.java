package com.gracefulfuture.design.pattern.prototype;

public class Address implements Cloneable{
    private String location;

    public Address() {
    }

    public Address(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Address address = (Address)super.clone();
//        address.setLocation(this.location);
        return address;
    }
}
