package trafficlight.gui;


import trafficlight.observer.Observer;
import trafficlight.observer.Subject;

import java.awt.*;

public class TrafficLight extends Light {

    TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }

    //TODO implement a part of the pattern here




}
