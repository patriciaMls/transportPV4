package com.mls;

import com.mls.person.Person;
import com.mls.transport.HotAirBalloon;
import com.mls.transport.Hovercraft;
import com.mls.transport.Motorcycle;
import com.mls.transport.Train;

/**
 * @description:
 * @author: Patricia
 * @date: Created in 2020/5/17 0:43
 * @version: 1.0
 * @modified By:
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        HotAirBalloon hotAirBalloon = new HotAirBalloon();
        Train train = new Train();
        Hovercraft hovercraft = new Hovercraft();
        Motorcycle motorcycle = new Motorcycle();

        person.driveMethod(hotAirBalloon);
        person.loadMethod(train);
        person.maintainMethod(hovercraft);
        person.addGasMethod(motorcycle);
    }
}
