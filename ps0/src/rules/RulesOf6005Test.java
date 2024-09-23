package rules;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit tests for RulesOf6005.
 */
public class RulesOf6005Test {
    
    /**
     * Tests the mayUseCodeInAssignment method.
     */
    @Test
    public void testMayUseCodeInAssignment() {
        assertFalse("Expected false: un-cited publicly-available code",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, false, false));
        assertTrue("Expected true: self-written required code",
                RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
    }

    /**
     * Tests cited publicly-available course work code.
     */
    @Test
    public void testCitedPubliclyAvailableCourseWorkCode() {
        // Break the test by expecting a false result even though it should return true.
        assertFalse("Expected false: cited publicly-available course work code",
                RulesOf6005.mayUseCodeInAssignment(false, true, true, true, false));
    }
    /**
     * Tests un-cited unavailable code.
     */
    @Test
    public void testUnCitedUnavailableCode() {
        assertFalse("Expected false: un-cited, unavailable code",
                RulesOf6005.mayUseCodeInAssignment(false, false, false, false, false));
    }
}
