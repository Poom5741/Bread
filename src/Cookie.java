/* JIRAYU CHAROENYOST
 * STD_NUMBER : 6609611790
 * */

/**
 * The `Cookie` class represents a cookie that can be toasted.
 * It implements the `Toastable` interface.
 */
public class Cookie implements Toastable {
    public static final String BURNT = "Burn";
    public static final String CRISP = "Crisp";
    public static final String SOFT = "Soft";
    private String state;
    
    /**
     * Constructs a new `Cookie` object with the initial state set to "Soft".
     */
    public Cookie() {
        state = SOFT;
    }

    /**
     * Sets the state of the cookie.
     * 
     * @param state the new state of the cookie
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Returns the current state of the cookie.
     * 
     * @return the current state of the cookie
     */
    public String getState() {
        return state;
    }

    /**
     * Returns a string representation of the cookie.
     * 
     * @return a string representation of the cookie
     */
    public String toString() {
        return "Cookie is now: " + state;
    }

    /**
     * Toasts the cookie by changing its state.
     * If the current state is "Soft", it changes to "Crisp".
     * If the current state is "Crisp", it changes to "Burn".
     */
    public void toast() {
        if (state.equals(SOFT)) {
            state = CRISP;
        } else if (state.equals(CRISP)) {
            state = BURNT;
        }
    }

    /**
     * Prints the current state of the cookie to the console.
     */
    public void getToastState() {
        System.out.println("Cookie is now: " + state);
    }
}
