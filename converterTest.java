import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class converterTest {
    @Test
    public void singleDigit()
    {
        assertEquals(1, new converter().romanToInt("I"));
        assertEquals(5, new converter().romanToInt("V"));
        assertEquals(10, new converter().romanToInt("X"));
        assertEquals(50, new converter().romanToInt("L"));
        assertEquals(100, new converter().romanToInt("C"));
        assertEquals(500, new converter().romanToInt("D"));
        assertEquals(1000, new converter().romanToInt("M"));
    }

    @Test
    public void repetition()
    {
        assertEquals(2, new converter().romanToInt("II"));
        assertEquals(20, new converter().romanToInt("XX"));
        assertEquals(200, new converter().romanToInt("CC"));
    }

    @Test
    public void manyLettersInOrder()
    {
        assertEquals(6, new converter().romanToInt("VI"));
        assertEquals(15, new converter().romanToInt("XV"));
    }

    @Test
    public void singleLetterWithSN() {
        assertEquals(4, new converter().romanToInt("IV"));
        assertEquals(9, new converter().romanToInt("IX"));
        assertEquals(40, new converter().romanToInt("XL"));
        assertEquals(90, new converter().romanToInt("XC"));
        assertEquals(400, new converter().romanToInt("CD"));
        assertEquals(900, new converter().romanToInt("CM"));
    }

    @Test
    public void invalidAndValidLetters() {
        assertEquals(-1, new converter().romanToInt("XIZ")); // Invalid letter 'Z'
        assertEquals(9, new converter().romanToInt("IX")); // Valid letter 'IX'
    }

    @Test
    public void nullInput() {
        assertEquals(0, new converter().romanToInt(null)); // Null input
    }

    @Test
    public void notValid() {
        assertEquals(-1, new converter().romanToInt("VV")); // Not valid Roman numeral
    }
    @Test
    public void withSubtractiveNotation() {
        assertEquals(14, new converter().romanToInt("XIV")); 
        assertEquals(44, new converter().romanToInt("XLIV")); 
        assertEquals(94, new converter().romanToInt("XCIV")); 
    }

    @Test
    public void withoutSubtractiveNotation() {
        assertEquals(14, new converter().romanToInt("XIIII")); 
        assertEquals(44, new converter().romanToInt("XXXXIV")); 
        assertEquals(94, new converter().romanToInt("LXXXXIV")); 
    }
    @Test
    public void firstNumber() {
        assertEquals(1, new converter().romanToInt("I")); // I is 1
    }
  
}
