
/* JIRAYU CHAROENYOST
 * STD_NUMBER : 6609611790
 * */

 /**
 * The TestToaster class is used to test the functionality of the Toaster class.
 * It creates a Toaster object, adds different types of food items (Bread and Cookie),
 * toasts them, and retrieves the toast state.
 */
public class TestToaster {
    public static void main(String[] args) {
        Toaster toaster = new Toaster();
        Bread bread = new Bread();
        toaster.add(bread);
        toaster.toast();
        toaster.getToastState();

        Cookie cookie = new Cookie();
        toaster.add(cookie);
        toaster.toast();
        toaster.getToastState();
    }
}