public interface ScoreListener {
    void scoreChange(ScoreEvent event);
    

    default void onEventReceived(ScoreEvent event) {
    }
}
