public class Bread {
    public static final String BURNT = "Burn";
    public static final String CRISP = "Crisp";
    public static final String SOFT = "Soft";
    private String state;
    
    public Bread() {
        state = SOFT;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public String toString() {
        return "Bread is now: " + state;
    }
}
