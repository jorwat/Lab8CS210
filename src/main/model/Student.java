package model;

// Represents a student with an id, name, the grade in which the student is registered and bus to which
// student is assigned to travel
public class Student {

    private int id;
    private String name;
    private int grade;
    protected Bus bus;

    // EFFECTS: constructs student with id, name and registered grade
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public Bus getAssignedBus() {
        return bus;
    }

    // EFFECTS: returns true if student is assigned to a bus, false otherwise
    public boolean isAssignedToBus() {
        if (bus == null) {
            return false;
        } else {
            return bus.getStudents().contains(this);
        }
    }

    // REQUIRES: !bus.isFull()
    // MODIFIES: this, bus
    // EFFECTS: assigns student to travel on bus
    public void assignToBus(Bus bus) {
        if (isAssignedToBus() && getAssignedBus() != bus) {
            removeFromBus();
            this.bus = bus;
            bus.addStudent(this);
        }
        if (getAssignedBus() != bus) {
            this.bus = bus;
            bus.addStudent(this);
        }
    }

    // MODIFIES: this, Bus b = getAssignedBus()
    // EFFECTS: if student is assigned to a bus, removes student from assigned bus;
    // otherwise has no effect
    public void removeFromBus() {
        if (isAssignedToBus()) {
            bus.removeStudent(this);
            bus = null;
        }
    }
}
