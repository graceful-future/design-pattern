package com.gracefulfuture.design.pattern.mediator;

public class DatingPlatform {
    public static void main(String[] args) {
        Customer buyer = new Buyer("李四(买家)");
        Customer seller = new Seller("张三(卖家)");
        Medium medium = new EstateMedium();
        medium.register(buyer);
        medium.register(seller);
    }
}
