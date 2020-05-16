package com.mls.transport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:48
 * @version: 1.0
 * @modified By:
 */
public class Airship extends AirTransport {
    @Override
    public void drivingMethod() {
        System.out.println("Airship drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("Airship load");
    }

    @Override
    public void maintain() {
        System.out.println("Airship maintain");
    }

    @Override
    public void addGas() {
        System.out.println("Airship addGas");
    }
}
