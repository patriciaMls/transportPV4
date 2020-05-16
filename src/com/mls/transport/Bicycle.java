package com.mls.transport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:50
 * @version: 1.0
 * @modified By:
 */
public class Bicycle extends LandTransport {
    @Override
    public void drivingMethod() {
        System.out.println("Bicycle drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("Bicycle load");
    }

    @Override
    public void maintain() {
        System.out.println("Bicycle maintain");
    }

    @Override
    public void addGas() {
        System.out.println("Bicycle addGas");
    }
}
