package model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Represents a bus having an id, capacity, chaperone and set of students assigned to travel on bus
public class Bus {
    // EFFECTS: constructs bus with id and capacity
    public Bus(int id, int capacity) {
        // stub
    }

    public int getId() {
        return 0;   // stub
    }

    public int getCapacity() {
        return 0;   // stub
    }

    public Chaperone getChaperone() {
        return null;   // stub
    }

    // EFFECTS: returns true if bus has a chaperone assigned, false otherwise
    public boolean hasChaperone() {
        return false;   // stub
    }

    // EFFECTS: returns an unmodifiable set of students assigned to travel on this bus
    public Set<Student> getStudents() {
        return null;   // stub
    }

    // MODIFIES: this
    // EFFECTS: assigns the chaperone for this bus
    public void setChaperone(Chaperone chaperone) {
        // stub
    }

    // EFFECTS: returns true if bus is full, false otherwise
    public boolean isFull() {
        return false;    // stub
    }

    // REQUIRES: !isFull()
    // MODIFIES: this, student
    // EFFECTS: adds student to this bus
    public void addStudent(Student student) {
        // stub
    }

    // MODIFIES: this, student
    // EFFECTS: removes student from this bus
    public void removeStudent(Student student) {
        // stub
    }
}
