/* 
 * JIRAYU CHAROENYOST
 * STD_NUMBER : 6609611790
 * 
 * This class represents a Bread object that can be toasted.
 * It implements the Toastable interface.
 * The state of the bread can be one of the following: Burnt, Crisp, or Soft.
 * The default state is Soft.
 */
public class Bread implements Toastable{
    public static final String BURNT = "Burn";
    public static final String CRISP = "Crisp";
    public static final String SOFT = "Soft";
    private String state;
    
    /**
     * Constructs a Bread object with the default state of Soft.
     */
    public Bread() {
        state = SOFT;
    }

    /**
     * Sets the state of the bread.
     * @param state the new state of the bread
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the current state of the bread.
     * @return the current state of the bread
     */
    public String getState() {
        return state;
    }

    /**
     * Returns a string representation of the bread object.
     * @return a string representation of the bread object
     */
    public String toString() {
        return "Bread is now: " + state;
    }

    /**
     * Toasts the bread by changing its state.
     * If the bread is Soft, it becomes Crisp.
     * If the bread is Crisp, it becomes Burnt.
     */
    public void toast() {
        if (state.equals(SOFT)) {
            state = CRISP;
        } else if (state.equals(CRISP)) {
            state = BURNT;
        }
    }

    /**
     * Prints the current state of the bread.
     */
    public void getToastState() {
        System.out.println("Bread is now: " + state);
    }
}
