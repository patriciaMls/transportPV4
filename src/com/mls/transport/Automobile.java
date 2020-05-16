package com.mls.transport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:52
 * @version: 1.0
 * @modified By:
 */
public class Automobile extends LandTransport {
    @Override
    public void drivingMethod() {
        System.out.println("Automobile drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("Automobile load");
    }

    @Override
    public void maintain() {
        System.out.println("Automobile maintain");
    }

    @Override
    public void addGas() {
        System.out.println("Automobile addGas");
    }
}
