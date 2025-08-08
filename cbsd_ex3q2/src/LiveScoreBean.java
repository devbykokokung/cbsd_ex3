/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

/**
 *
 * @author devbykokokung
 */
public class LiveScoreBean {

    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    private String scoreLine = "";

    public LiveScoreBean() {
    }

    public String getScoreLine() {
        return scoreLine;
    }

    public void setScoreLine(String newScore) {
        String oldScore = this.scoreLine;
        if (newScore == null) {
            newScore = "";
        }
        if (!newScore.equals(oldScore)) {
            this.scoreLine = newScore;
            pcs.firePropertyChange("scoreLine", oldScore, newScore);
        }
    }

    public void addPropertyChangeListener(String propertyName, PropertyChangeListener l) {
        pcs.addPropertyChangeListener(propertyName, l);
    }

    public void removePropertyChangeListener(String propertyName, PropertyChangeListener l) {
        pcs.removePropertyChangeListener(propertyName, l);
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        pcs.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        pcs.removePropertyChangeListener(l);
    }
}
