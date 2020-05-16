package com.mls.transport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:54
 * @version: 1.0
 * @modified By:
 */
public class Train extends LandTransport {
    @Override
    public void drivingMethod() {
        System.out.println("Train drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("Train load");
    }

    @Override
    public void maintain() {
        System.out.println("Train maintain");
    }

    @Override
    public void addGas() {
        System.out.println("Train addGas");
    }
}
