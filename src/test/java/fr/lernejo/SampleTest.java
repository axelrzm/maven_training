package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void addOpTest() {
        Sample sample = new Sample();
        int result = sample.op(Sample.Operation.ADD, 5, 5);
        assertEquals(10, result);
    }

    @Test
    void multOpTest() {
        Sample sample = new Sample();
        int result = sample.op(Sample.Operation.MULT, 2, 3);
        assertEquals(6, result);
    }
}
