package com.mls.transport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:53
 * @version: 1.0
 * @modified By:
 */
public class Motorcycle extends LandTransport {
    @Override
    public void drivingMethod() {
        System.out.println("Motorcycle drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("Motorcycle load");
    }

    @Override
    public void maintain() {
        System.out.println("Motorcycle maintain");
    }

    @Override
    public void addGas() {
        System.out.println("Motorcycle addGas");
    }
}
