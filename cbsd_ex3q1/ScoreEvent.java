public class ScoreEvent {
    private final String scoreLine;
    private final Object source;
    private final String eventType;
    

    public ScoreEvent(Object source, String scoreLine) {
        this.source = source;
        this.scoreLine = scoreLine;
        this.eventType = "SCORE_CHANGE";
    }

    public String getLatestScore() {
        return this.scoreLine;
    }
    

    public Object getSource() {
        return this.source;
    }
    
    public String getEventType() {
        return this.eventType;
    }
    
    @Override
    public String toString() {
        return String.format("ScoreEvent{type='%s', score='%s'}", 
                           eventType, scoreLine);
    }
}
