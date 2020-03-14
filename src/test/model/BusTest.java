package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTest {
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
    void testChaperones() {
        b1.setChaperone(c1);
        assertEquals(c1,b1.getChaperone());
        assertTrue(b1.hasChaperone());
        assertFalse(b2.hasChaperone());
        assertNull(b2.getChaperone());
    }

    @Test
    void testAddAndRemoveStudents() {
        b1.addStudent(s1);
        b2.addStudent(s2);
        b2.addStudent(s3);
        assertTrue(b1.getStudents().contains(s1));
        assertTrue(b2.getStudents().contains(s2));
        assertTrue(b2.getStudents().contains(s3));
        assertTrue(b2.isFull());
        b1.removeStudent(s1);
        b2.removeStudent(s2);
        assertFalse(b1.getStudents().contains(s1));
        assertFalse(b2.getStudents().contains(s2));
        assertTrue(b2.getStudents().contains(s3));
    }
}

