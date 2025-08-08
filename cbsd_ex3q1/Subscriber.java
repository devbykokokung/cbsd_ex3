public class Subscriber implements ScoreListener {
    private String name;
    
    public Subscriber(String name) {
        this.name = name;
    }
    
    public Subscriber(String name, boolean verbose) {
        this.name = name;
    }

    @Override
    public void scoreChange(ScoreEvent event) {
        System.out.println("live result: " + event.getLatestScore());
    }
    
    public String getName() {
        return name;
    }
    
}
