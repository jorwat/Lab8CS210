package model;

// Represents a student with an id, name, the grade in which the student is registered and bus to which
// student is assigned to travel
public class Student {

    // EFFECTS: constructs student with id, name and registered grade
    public Student(int id, String name, int grade) {
        // stub
    }

    public int getId() {
        return 0;   // stub
    }

    public String getName() {
        return null;    // stub
    }

    public int getGrade() {
        return 0;    // stub
    }

    public Bus getAssignedBus() {
        return null;   // stub
    }

    // EFFECTS: returns true if student is assigned to a bus, false otherwise
    public boolean isAssignedToBus() {
        return false;   // stub
    }

    // REQUIRES: !bus.isFull()
    // MODIFIES: this, bus
    // EFFECTS: assigns student to travel on bus
    public void assignToBus(Bus bus) {
        // stub
    }

    // MODIFIES: this, Bus b = getAssignedBus()
    // EFFECTS: if student is assigned to a bus, removes student from assigned bus;
    // otherwise has no effect
    public void removeFromBus() {
        // stub
    }
}
