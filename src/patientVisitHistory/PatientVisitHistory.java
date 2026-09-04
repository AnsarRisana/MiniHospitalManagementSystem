package patientVisitHistory;

public class PatientVisitHistory {
	private Node head;

    private class Node {
        Visit visit;
        Node next;

        Node(Visit visit) {
            this.visit = visit;
            this.next = null;
        }
    }

    public void insert(Visit visit) {

        Node newNode = new Node(visit);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public void displayVisits() {

        if (head == null) {
            System.out.println("No visit history found.");
            return;
        }

        Node current = head;

        while (current != null) {
            current.visit.displayVisit();
            System.out.println(" ");
            current = current.next;
        }
    }

    public void searchVisit(int visitId) {

        Node current = head;

        while (current != null) {

            if (current.visit.getVisitId() == visitId) {
                current.visit.displayVisit();
                return;
            }

            current = current.next;
        }

        System.out.println("Visit not found.");
    }

    public void removeVisit(int visitId) {

        if (head == null) {
            System.out.println("No visit history found.");
            return;
        }

        if (head.visit.getVisitId() == visitId) {
            head = head.next;
            System.out.println("Visit removed successfully.");
            return;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.visit.getVisitId() == visitId) {
                current.next = current.next.next;
                System.out.println("Visit removed successfully.");
                return;
            }

            current = current.next;
        }

        System.out.println("Visit not found.");
    }
}
