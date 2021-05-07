package com.gracefulfuture.design.pattern.adapter;

public class AdpaterTest {
    public static void main(String[] args) {
        ElectricMotor electricMotor = new ElectricMotor();
        OpticalMotor opticalMotor = new OpticalMotor();
        Motor electricAdapter = new ElectricAdapter(electricMotor);
        Motor opticalAdapter = new OpticalAdapter(opticalMotor);
        electricAdapter.drive();
        opticalAdapter.drive();
    }
}
