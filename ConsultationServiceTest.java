package medcore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ICT6420 Assessment 4 - your JUnit test suite.
 *
 * Student name: ____________________
 * Student ID:   ____________________
 *
 * Implement EVERY test case from your Test Design Document as a test method
 * in this class. Use clear, descriptive method names, for example:
 *     void calculateFee_age17_returnsPaediatricFee()
 *
 * Useful assertions:
 *     assertEquals(expected, actual, 0.001);   // for double values
 *     assertTrue(...) / assertFalse(...);
 *     assertThrows(IllegalArgumentException.class, () -> service.calculateFee(-1));
 *
 * The single test below only checks that your JUnit setup works.
 * It does NOT count towards your test cases - you may delete it.
 */
class ConsultationServiceTest {

    private ConsultationService service;

    @BeforeEach
    void setUp() {
        service = new ConsultationService();
    }

    @Test
    void setupCheck_serviceCanBeCreated() {
        assertNotNull(service);
    }

    // TODO: add your test methods here
}
