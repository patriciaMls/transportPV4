package com.mls.transport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:57
 * @version: 1.0
 * @modified By:
 */
public class Submarine extends MaritimeMeansOfTransport {
    @Override
    public void drivingMethod() {
        System.out.println("Submarine drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("Submarine load");
    }

    @Override
    public void maintain() {
        System.out.println("Submarine maintain");
    }

    @Override
    public void addGas() {
        System.out.println("Submarine addGas");
    }
}
