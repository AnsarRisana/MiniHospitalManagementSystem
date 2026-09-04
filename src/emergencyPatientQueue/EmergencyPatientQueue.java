package emergencyPatientQueue;

import java.util.LinkedList;
import java.util.Queue;

import patient.Patient;


public class EmergencyPatientQueue {
	
	    private Queue<Patient> queue;

	    public EmergencyPatientQueue() {
	        queue = new LinkedList<>();
	    }

	    public void enqueue(Patient patient) {

	        queue.add(patient);

	        System.out.println("Patient added to emergency queue.");
	    }

	    public Patient dequeue() {

	        if (queue.isEmpty()) {
	            System.out.println("Emergency queue is empty.");
	            return null;
	        }

	        return queue.remove();
	    }

	    public void displayQueue() {

	        if (queue.isEmpty()) {
	            System.out.println("Emergency queue is empty.");
	            return;
	        }

	        System.out.println("\nEmergency Waiting Patients:");
	        System.out.println("---------------------------");

	        for (Patient patient : queue) {
	            patient.displayPatient();
	            System.out.println("---------------------------");
	        }
	    }

	    public boolean isEmpty() {
	        return queue.isEmpty();
	    }

}
