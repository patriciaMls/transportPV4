package com.mls.transport;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:40
 * @version: 1.0
 * @modified By:
 */
public class HotAirBalloon extends AirTransport {

    @Override
    public void drivingMethod() {
        System.out.println("HotAirBalloon drivingMethod");
    }

    @Override
    public void load() {
        System.out.println("HotAirBalloon load");
    }

    @Override
    public void maintain() {
        System.out.println("HotAirBalloon maintain");
    }

    @Override
    public void addGas() {
        System.out.println("HotAirBalloon addGas");
    }
}
