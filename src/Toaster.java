/* JIRAYU CHAROENYOST
 * STD_NUMBER : 6609611790
 * */

import java.util.ArrayList;

/**
 * The Toaster class represents a toaster that can toast multiple items.
 * It implements the Toastable interface.
 */
public class Toaster implements Toastable {
    private ArrayList<Toastable> item;

    /**
     * Constructs a new Toaster object with an empty list of items.
     */
    public Toaster() {
        item = new ArrayList<>();
    }

    /**
     * Adds a toastable item to the toaster.
     * 
     * @param item the toastable item to be added
     */
    public void add(Toastable item) {
        this.item.add(item);
    }

    /**
     * Prints out all the items in the toaster.
     */
    public void print() {
        for (Toastable toastable : item) {
            System.out.println(toastable);
        }
    }

    /**
     * Toasts all the items in the toaster.
     */
    public void toast() {
        for (Toastable toastable : item) {
            toastable.toast();
        }
    }

    /**
     * Gets the toast state of all the items in the toaster.
     */
    public void getToastState() {
        for (Toastable toastable : item) {
            toastable.getToastState();
        }
    }
}