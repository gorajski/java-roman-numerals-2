import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void oldRoman1toI() {
        assertEquals("I", RomanNumerals.convertToOldRoman(1));
    }

    @Test
    public void oldRoman4toIIII() {
        assertEquals("IIII", RomanNumerals.convertToOldRoman(4));
    }

    @Test
    public void oldRoman5toV() {
        assertEquals("V", RomanNumerals.convertToOldRoman(5));
    }

    @Test
    public void oldRoman254toCCLIIII() {
        assertEquals("CCLIIII", RomanNumerals.convertToOldRoman(254));
    }

    @Test
    public void oldRoman999toDCCCCLXXXXVIIII() {
        assertEquals("DCCCCLXXXXVIIII", RomanNumerals.convertToOldRoman(999));
    }

    @Test
    public void oldRoman3258toMMMCCLVIII() {
        assertEquals("MMMCCLVIII", RomanNumerals.convertToOldRoman(3258));
    }

    @Test
    public void oldRoman17toXVII() {
        assertEquals("XVII", RomanNumerals.convertToOldRoman(17));
    }

    @Test
    public void oldRoman19toXVIIII() {
        assertEquals("XVIIII", RomanNumerals.convertToOldRoman(19));
    }



    @Test
    public void newRoman1toI() {
        assertEquals("I", RomanNumerals.convertToNewRoman(1));
    }

    @Test
    public void newRoman4toIV() {
        assertEquals("IV", RomanNumerals.convertToNewRoman(4));
    }

    @Test
    public void newRoman5toV() {
        assertEquals("V", RomanNumerals.convertToNewRoman(5));
    }

    @Test
    public void newRoman254toCCLIV() {
        assertEquals("CCLIV", RomanNumerals.convertToNewRoman(254));
    }

    @Test
    public void newRoman999toCMXCIX() {
        assertEquals("CMXCIX", RomanNumerals.convertToNewRoman(999));
    }

    @Test
    public void newRoman3258toMMMCCLVIII() {
        assertEquals("MMMCCLVIII", RomanNumerals.convertToNewRoman(3258));
    }

    @Test
    public void newRoman17toXVII() {
        assertEquals("XVII", RomanNumerals.convertToNewRoman(17));
    }

    @Test
    public void newRoman19toXIX() {
        assertEquals("XIX", RomanNumerals.convertToNewRoman(19));
    }
}