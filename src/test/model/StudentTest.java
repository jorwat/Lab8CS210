package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Bus b1;
    private Bus b2;
    private Student s1;
    private Student s2;
    private Student s3;
    private Chaperone c1;

    @BeforeEach
    void runBefore() {
        b1 = new Bus(1,5);
        b2 = new Bus(7,2);
        s1 = new Student(659, "Jordan",8);
        s2 = new Student(5483, "Emilie", 9);
        s3 = new Student(54837,"Eric",9);
        c1 = new Chaperone("Mrs. Martin");
    }

    @Test
    void testConstructors() {
        assertEquals(1,b1.getId());
        assertEquals(7,b2.getId());
        assertEquals(5,b1.getCapacity());
        assertEquals(2,b2.getCapacity());
        assertEquals(659,s1.getId());
        assertEquals(5483,s2.getId());
        assertEquals(54837,s3.getId());
        assertEquals(8,s1.getGrade());
        assertEquals(9,s2.getGrade());
        assertEquals(9,s3.getGrade());
        assertEquals("Jordan",s1.getName());
        assertEquals("Emilie", s2.getName());
        assertEquals("Eric",s3.getName());
    }

    @Test
    void testAssignAndRemoveBusses() {
        s1.assignToBus(b1);
        s2.assignToBus(b2);
        assertEquals(b1,s1.getAssignedBus());
        assertEquals(b2,s2.getAssignedBus());
        assertNull(s3.getAssignedBus());
        assertTrue(s1.isAssignedToBus());
        assertTrue(s2.isAssignedToBus());
        assertFalse(s3.isAssignedToBus());
        s1.assignToBus(b2);

        s1.removeFromBus();
        assertFalse(s1.isAssignedToBus());
        assertTrue(s2.isAssignedToBus());
        assertNull(s1.getAssignedBus());
    }

    @Test
    void TrickyCase() {
        s1.assignToBus(b1);
        s2.assignToBus(b2);
        assertEquals(b1,s1.getAssignedBus());
        assertEquals(b2,s2.getAssignedBus());
        s1.assignToBus(b2);
        assertEquals(b2,s1.getAssignedBus());
        assertFalse(b1.students.contains(s1));
    }

}