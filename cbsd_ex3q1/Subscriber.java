public class Subscriber implements ScoreListener {
    private String name;
    private boolean verbose; // สำหรับแสดงข้อมูล Event เพิ่มเติม
    
    public Subscriber(String name) {
        this.name = name;
        this.verbose = false;
    }
    
    public Subscriber(String name, boolean verbose) {
        this.name = name;
        this.verbose = verbose;
    }

    @Override
    public void scoreChange(ScoreEvent event) {
        System.out.println("live result: " + event.getLatestScore());
        
        if (verbose) {
            System.out.println("  [" + name + "] Event details: " + event.toString());
        }
        
        onEventReceived(event);
    }
    
    @Override
    public void onEventReceived(ScoreEvent event) {

    }
    
    public String getName() {
        return name;
    }
    
    public void setVerbose(boolean verbose) {
        this.verbose = verbose;
    }
    
    public boolean isVerbose() {
        return verbose;
    }
}
