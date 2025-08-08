import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ScoreSource {
    private List<ScoreListener> listeners;
    private String currentScore;
    
    public ScoreSource() {
        this.listeners = new CopyOnWriteArrayList<>();
        this.currentScore = "";
    }

    public void subscribe(ScoreListener listener) {
        if (listener != null && !listeners.contains(listener)) {
            listeners.add(listener);
            System.out.println("Listener subscribed. Total listeners: " + listeners.size());
        }
    }

    public void unsubscribe(ScoreListener listener) {
        if (listeners.remove(listener)) {
            System.out.println("Listener unsubscribed. Total listeners: " + listeners.size());
        }
    }

    public void setScoreLine(String scoreLine) {
        if (scoreLine != null && !scoreLine.equals(this.currentScore)) {
            this.currentScore = scoreLine;
            fireScoreEvent(scoreLine);
        }
    }
    
    private void fireScoreEvent(String scoreLine) {
        ScoreEvent event = new ScoreEvent(this, scoreLine);
        notifyAllListeners(event);
    }

    private void notifyAllListeners(ScoreEvent event) {
        for (ScoreListener listener : listeners) {
            try {
                listener.scoreChange(event);
            } catch (Exception e) {
                System.err.println("Error notifying listener: " + e.getMessage());
            }
        }
    }

    public String getCurrentScore() {
        return this.currentScore;
    }

    public int getListenerCount() {
        return listeners.size();
    }
}
