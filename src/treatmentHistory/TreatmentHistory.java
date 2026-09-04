package treatmentHistory;

import java.util.Stack;

public class TreatmentHistory {
	private Stack<Treatment> stack;

    public TreatmentHistory() {
        stack = new Stack<>();
    }

    public void push(Treatment treatment) {
        stack.push(treatment);
        System.out.println("Treatment record added.");
    }

    public Treatment pop() {

        if (stack.isEmpty()) {
            System.out.println("Treatment history is empty.");
            return null;
        }

        Treatment treatment = stack.pop();

        System.out.println("Latest treatment record removed.");
        return treatment;
    }

    public void displayHistory() {

        if (stack.isEmpty()) {
            System.out.println("Treatment history is empty.");
            return;
        }

        System.out.println("Treatment History:");

        for (int i = stack.size() - 1; i >= 0; i--) {
            stack.get(i).displayTreatment();
            System.out.println("--------------------");
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}