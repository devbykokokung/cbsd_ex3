/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

/**
 *
 * @author devbykokokung
 */
public class Subscriber implements PropertyChangeListener {

    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("scoreLine".equals(evt.getPropertyName())) {
            System.out.println("live result: " + evt.getNewValue());
        }
    }

    public String getName() {
        return name;
    }
}
