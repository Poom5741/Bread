import java.util.ArrayList;
/**
 * Toaster
 */
public class Toaster implements Toastable {
    private ArrayList<Toastable> item;

    public Toaster() {
        item = new ArrayList<>();
    }

    public void add(Toastable item) {
        //add new taosable item
    }

    public void print() {
        // print out all the items in the toaster
    }

    public void toast() {

    }

    public void getToastState() {

    }
}