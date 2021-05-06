package com.gracefulfuture.design.pattern.prototype;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("洛杉矶");
        Person person = new Person("Tom",28,address);
        Person clone = (Person) person.clone();
//        System.out.println(person == clone);
        System.out.println(person.getAddress() == clone.getAddress());
        System.out.println(person.getName());
        System.out.println(person.getAddress().getLocation());
        Address address2 = new Address("纽约");
        clone.setName("Jack");
        clone.setAddress(address2);
//        clone.getAddress().setLocation("纽约");
        System.out.println(person.getAddress() == clone.getAddress());
        System.out.println(person.getName());
        System.out.println(person.getAddress().getLocation());
//        System.out.println(address.getClass() == address2.getClass());
    }
}
