package com.mls.transport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:56
 * @version: 1.0
 * @modified By:
 */
public class Ship extends MaritimeMeansOfTransport {
    @Override
    public void drivingMethod() {
        System.out.println("Ship drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("Ship load");
    }

    @Override
    public void maintain() {
        System.out.println("Ship maintain");
    }

    @Override
    public void addGas() {
        System.out.println("Ship addGas");
    }
}
