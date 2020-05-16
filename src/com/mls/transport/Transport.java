package com.mls.transport;

import java.util.Date;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:35
 * @version: 1.0
 * @modified By:
 */
public abstract class Transport {
    private String id;
    private String ownership;
    private String Price;
    private Date dateOfPurchase;
    private String GPSPosition;

    public Transport() {
    }

    public Transport(String id) {
        this.id = id;
    }

    //驾驶方法
    public abstract void drivingMethod();
    //装载物品方法
    public abstract void load();
    //维修方法
    public abstract void maintain();
    //加油方法
    public abstract void addGas();

}
