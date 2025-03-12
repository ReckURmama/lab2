package edu.canisius.cyb.cyb600.lab2;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.Arrays;
import static org.junit.Assert.*;

public class Task3UnitTests {
    private Task3 instance;

    @Before
    /*
    DO NOT MODIFY THIS METHOD.
     */
    public void initialize() {
        this.instance = new Task3();
    }

    @Test
    public void testUniqueCharacterExtraction_bestCase(){
        String input = "software";
        List<String> expectedOutput = Arrays.asList("a", "r", "s", "t", "e", "f", "w", "o");
        List<String> actualOutput = instance.removeDuplicates(input);
        assertEquals("Unexpected result:", expectedOutput, actualOutput);
    }

    @Test
    public void testUniqueCharacterExtraction_averageCase(){
        String input = "cybersecurity";
        List<String> expectedOutput = Arrays.asList("b","r","c","s","t","e","u","y","i");
        List<String> actualOutput = instance.removeDuplicates(input);
        assertEquals("Unexpected result:", expectedOutput, actualOutput);
    }

    @Test
    public void testUniqueCharacterExtraction_worstCase(){
        String input = "nnnnnnnnnnnnnnnnnnnnnn";
        List<String> expectedOutput = Arrays.asList("n");
        List<String> actualOutput = instance.removeDuplicates(input);
        assertEquals("Unexpected result:", expectedOutput, actualOutput);
    }

    @Test
    public void testAnagramCheck_bestCase(){
        assertTrue(instance.areTheseAnagrams("tac","cat"));
        assertFalse(instance.areTheseAnagrams("tic","tac"));
    }

    @Test
    public void testAnagramCheck_averageCase(){
        assertTrue(instance.areTheseAnagrams("java", "jvaa"));
        assertTrue(instance.areTheseAnagrams("javascript", "scriptjava"));
        assertFalse(instance.areTheseAnagrams("nonsense", "noworld"));
    }

    @Test
    public void testAnagramCheck_worstCase(){
        assertTrue(instance.areTheseAnagrams("dormitory", "dirtyroom"));
        assertFalse(instance.areTheseAnagrams(null, "really long word"));
    }
}
