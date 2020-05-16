package com.mls.transport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:46
 * @version: 1.0
 * @modified By:
 */
public class Aircraft extends AirTransport {
    @Override
    public void drivingMethod() {
        System.out.println("Aircraft drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("Aircraft load");
    }

    @Override
    public void maintain() {
        System.out.println("Aircraft maintain");
    }

    @Override
    public void addGas() {
        System.out.println("Aircraft addGas");
    }
}
